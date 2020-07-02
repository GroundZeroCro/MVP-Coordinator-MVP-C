package com.example.coordinatortest

interface Contract {

    interface View {
        fun showToast(message: String)
    }

    interface Presenter {
        fun getMessage(): String
        fun bind(view: View)
        fun unbind()
    }

    interface Coordinator {
        fun bind()
        fun unbind()
        fun requestMessage()
    }
}