package com.example.coordinatortest

class Coordinator(private val view: Contract.View) : Contract.Coordinator {

    private val presenter: Contract.Presenter = Presenter()

    override fun bind() {
        presenter.bind(view)
    }

    override fun unbind() {
        presenter.unbind()
    }

    override fun requestMessage() {
        view.showToast(presenter.getMessage())
    }
}