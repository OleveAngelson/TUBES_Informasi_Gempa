package com.azhar.informasigempa.views

interface MainPresenter {
    fun getDataGempaDirasakan()
    fun getDataGempaBerpotensi()
    fun onProses(proses: Boolean)
}