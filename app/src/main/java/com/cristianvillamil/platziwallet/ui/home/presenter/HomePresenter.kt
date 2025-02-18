package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor

class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {
    private val homeInteractor = HomeInteractor()
    override fun retrieveFavoriteTransfers() {
        view.showLoader()
        homeInteractor.retrieverFavoriteTransferFromCache(object : HomeContract.OnResponseCallback {
            override fun onResponse(response: List<FavoriteTransfer>) {
                view.hideLoader()
                view.showFavoriteTransfers(response)
            }
        })
    }
}