package com.example.coordinatortest

class Presenter : Contract.Presenter {

    private var view: Contract.View? = null

    override fun bind(view: Contract.View) {
        this.view = view
    }

    override fun unbind() {
        this.view = null
    }

    override fun getMessage() = "Hello world"
}