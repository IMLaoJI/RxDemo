package com.nexusunsky.rxdemo.entity;

public class UserInfo {
    UserBaseInfoResponse mBaseInfo;
    UserExtraInfoResponse mExtraInfo;

    public UserInfo(UserBaseInfoResponse baseInfo, UserExtraInfoResponse extraInfo) {
        mBaseInfo = baseInfo;
        mExtraInfo = extraInfo;
    }
}
