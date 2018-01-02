package com.africastalking.models.payment;

import java.util.List;

public final class BankTransferResponse {
    public List<Entry> entries = null;

    public static final class Entry {
        public String accountNumber;
        public String status;
        public String value;
        public String transactionId;
        public String transactionFee;
        public String errorMessage;
    }
}
