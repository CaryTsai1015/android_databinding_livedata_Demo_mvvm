//package com.example.mvvmtest
//
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//
//
//data class MainData(
//
//    val name: String, val age: Int, val sex: Int
//)
//
//class MainViewModel : ViewModel() {
//
//
//
//    val mUserLiveData = MutableLiveData<MainData>()
//    var mUserData:MainData? = null
//    var mIsType = false
//
//
//
//    fun setData() {
//
//        mUserData = MainData("李四", 18, 0)
//        mUserLiveData.value = mUserData
//
//    }
//
//    fun upLoadData() {
//
//        mUserData = MainData("張三", 21, 1)
//        mUserLiveData.value = mUserData
//
//    }
//
//
//    fun loadData() {
//
//        mIsType = if (mIsType) {
//
//            setData()
//            false
//
//        } else {
//
//            upLoadData()
//            true
//
//        }
//
//
//    }
//
//}