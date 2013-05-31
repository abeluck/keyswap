package com.lookout.keymaster.gpg;

public enum TrustLevel {
    New,
    Invalid,
    Disabled,
    Revoked,
    Expired,
    Unknown,
    Undefined,
    None,
    Marginal,
    Full,
    Ultimate
}