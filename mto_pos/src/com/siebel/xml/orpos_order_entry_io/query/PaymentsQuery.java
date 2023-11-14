
package com.siebel.xml.orpos_order_entry_io.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MTOPaymentInstrNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOIdProofType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOIdProofNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOCreditCardNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOCreditAuthorizationTime" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ABACode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AVSCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountNumber-ReadOnly" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActualCharge" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AuthorizationDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BCReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAddressIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedOrderType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CardHolder" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFirstLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactLastFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactPhone" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedByName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber-Display2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionResponseCode2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionResponseMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckMessage2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatusAsOfDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CustomerId2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DesiredPayDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EncryptionKey" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExpirationMonth" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExpirationYear" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InvoiceId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IssuingBankCustomerId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IssuingBankName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IssuingBankPhoneNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ManualAuthorizationFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MerchantId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderCustomerId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTypeCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentAccountName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentAccountSite" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentImportFlg" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentMethodLIC" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentProfileName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentStatusAsOfDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentTypeReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCountry" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToPostalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteCustomerId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SSNEncryptionKey" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SaveCreditCard" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SocialSecurityNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransactionMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransactionTime" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VendorId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VerificationNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsQuery", propOrder = {
    "mtoPaymentInstrNumber",
    "mtoIdProofType",
    "mtoIdProofNumber",
    "mtoCreditCardNumber",
    "mtoCreditAuthorizationTime",
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "abaCode",
    "avsCode",
    "accountNumber",
    "accountNumberReadOnly",
    "actualCharge",
    "authorizationCode",
    "authorizationDate",
    "bcReadOnlyFlag",
    "bankAccountId",
    "bankAddressId",
    "billToAddressId",
    "billToAddressIntegrationId",
    "calculatedOrderType",
    "cardHolder",
    "contactEmail",
    "contactFirstLastName",
    "contactFirstName",
    "contactLastFirstName",
    "contactLastName",
    "contactName",
    "contactPhone",
    "createdByName",
    "creditCardNumberDisplay2",
    "creditCardTransactionResponseCode2",
    "creditCardTransactionResponseMessage",
    "creditCheckMessage2",
    "creditCheckStatus",
    "creditCheckStatusAsOfDate",
    "currencyCode",
    "customerId2",
    "dateOfBirth",
    "description",
    "desiredPayDate",
    "encryptionKey",
    "exchangeDate",
    "expirationDate",
    "expirationMonth",
    "expirationYear",
    "firstName",
    "integrationId2",
    "invoiceId",
    "invoiceNumber",
    "issuingBankCustomerId",
    "issuingBankName",
    "issuingBankPhoneNumber",
    "lastName",
    "lineNumber",
    "manualAuthorizationFlag",
    "merchantId",
    "orderCustomerId",
    "orderId",
    "orderNumber",
    "orderTypeCode",
    "payment",
    "paymentAccountId",
    "paymentAccountIntegrationId",
    "paymentAccountName",
    "paymentAccountSite",
    "paymentContactId",
    "paymentContactIntegrationId",
    "paymentDate",
    "paymentImportFlg",
    "paymentMethod",
    "paymentMethodLIC",
    "paymentProfileName",
    "paymentStatus",
    "paymentStatusAsOfDate",
    "paymentType",
    "paymentTypeReadOnlyFlag",
    "personalBillToCity",
    "personalBillToCountry",
    "personalBillToPostalCode",
    "personalBillToState",
    "personalBillToStreetAddress",
    "personalBillToStreetAddress2",
    "quoteCustomerId",
    "quoteId",
    "ssnEncryptionKey",
    "saveCreditCard",
    "socialSecurityNumber",
    "transactionAmount",
    "transactionId",
    "transactionMessage",
    "transactionTime",
    "transactionType",
    "vendorId",
    "verificationNumber"
})
public class PaymentsQuery {

    @XmlElement(name = "MTOPaymentInstrNumber")
    protected QueryType mtoPaymentInstrNumber;
    @XmlElement(name = "MTOIdProofType")
    protected QueryType mtoIdProofType;
    @XmlElement(name = "MTOIdProofNumber")
    protected QueryType mtoIdProofNumber;
    @XmlElement(name = "MTOCreditCardNumber")
    protected QueryType mtoCreditCardNumber;
    @XmlElement(name = "MTOCreditAuthorizationTime")
    protected QueryType mtoCreditAuthorizationTime;
    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "ConflictId")
    protected QueryType conflictId;
    @XmlElement(name = "ModId")
    protected QueryType modId;
    @XmlElement(name = "ABACode")
    protected QueryType abaCode;
    @XmlElement(name = "AVSCode")
    protected QueryType avsCode;
    @XmlElement(name = "AccountNumber")
    protected QueryType accountNumber;
    @XmlElement(name = "AccountNumber-ReadOnly")
    protected QueryType accountNumberReadOnly;
    @XmlElement(name = "ActualCharge")
    protected QueryType actualCharge;
    @XmlElement(name = "AuthorizationCode")
    protected QueryType authorizationCode;
    @XmlElement(name = "AuthorizationDate")
    protected QueryType authorizationDate;
    @XmlElement(name = "BCReadOnlyFlag")
    protected QueryType bcReadOnlyFlag;
    @XmlElement(name = "BankAccountId")
    protected QueryType bankAccountId;
    @XmlElement(name = "BankAddressId")
    protected QueryType bankAddressId;
    @XmlElement(name = "BillToAddressId")
    protected QueryType billToAddressId;
    @XmlElement(name = "BillToAddressIntegrationId")
    protected QueryType billToAddressIntegrationId;
    @XmlElement(name = "CalculatedOrderType")
    protected QueryType calculatedOrderType;
    @XmlElement(name = "CardHolder")
    protected QueryType cardHolder;
    @XmlElement(name = "ContactEmail")
    protected QueryType contactEmail;
    @XmlElement(name = "ContactFirstLastName")
    protected QueryType contactFirstLastName;
    @XmlElement(name = "ContactFirstName")
    protected QueryType contactFirstName;
    @XmlElement(name = "ContactLastFirstName")
    protected QueryType contactLastFirstName;
    @XmlElement(name = "ContactLastName")
    protected QueryType contactLastName;
    @XmlElement(name = "ContactName")
    protected QueryType contactName;
    @XmlElement(name = "ContactPhone")
    protected QueryType contactPhone;
    @XmlElement(name = "CreatedByName")
    protected QueryType createdByName;
    @XmlElement(name = "CreditCardNumber-Display2")
    protected QueryType creditCardNumberDisplay2;
    @XmlElement(name = "CreditCardTransactionResponseCode2")
    protected QueryType creditCardTransactionResponseCode2;
    @XmlElement(name = "CreditCardTransactionResponseMessage")
    protected QueryType creditCardTransactionResponseMessage;
    @XmlElement(name = "CreditCheckMessage2")
    protected QueryType creditCheckMessage2;
    @XmlElement(name = "CreditCheckStatus")
    protected QueryType creditCheckStatus;
    @XmlElement(name = "CreditCheckStatusAsOfDate")
    protected QueryType creditCheckStatusAsOfDate;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "CustomerId2")
    protected QueryType customerId2;
    @XmlElement(name = "DateOfBirth")
    protected QueryType dateOfBirth;
    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "DesiredPayDate")
    protected QueryType desiredPayDate;
    @XmlElement(name = "EncryptionKey")
    protected QueryType encryptionKey;
    @XmlElement(name = "ExchangeDate")
    protected QueryType exchangeDate;
    @XmlElement(name = "ExpirationDate")
    protected QueryType expirationDate;
    @XmlElement(name = "ExpirationMonth")
    protected QueryType expirationMonth;
    @XmlElement(name = "ExpirationYear")
    protected QueryType expirationYear;
    @XmlElement(name = "FirstName")
    protected QueryType firstName;
    @XmlElement(name = "IntegrationId2")
    protected QueryType integrationId2;
    @XmlElement(name = "InvoiceId")
    protected QueryType invoiceId;
    @XmlElement(name = "InvoiceNumber")
    protected QueryType invoiceNumber;
    @XmlElement(name = "IssuingBankCustomerId")
    protected QueryType issuingBankCustomerId;
    @XmlElement(name = "IssuingBankName")
    protected QueryType issuingBankName;
    @XmlElement(name = "IssuingBankPhoneNumber")
    protected QueryType issuingBankPhoneNumber;
    @XmlElement(name = "LastName")
    protected QueryType lastName;
    @XmlElement(name = "LineNumber")
    protected QueryType lineNumber;
    @XmlElement(name = "ManualAuthorizationFlag")
    protected QueryType manualAuthorizationFlag;
    @XmlElement(name = "MerchantId")
    protected QueryType merchantId;
    @XmlElement(name = "OrderCustomerId")
    protected QueryType orderCustomerId;
    @XmlElement(name = "OrderId")
    protected QueryType orderId;
    @XmlElement(name = "OrderNumber")
    protected QueryType orderNumber;
    @XmlElement(name = "OrderTypeCode")
    protected QueryType orderTypeCode;
    @XmlElement(name = "Payment")
    protected QueryType payment;
    @XmlElement(name = "PaymentAccountId")
    protected QueryType paymentAccountId;
    @XmlElement(name = "PaymentAccountIntegrationId")
    protected QueryType paymentAccountIntegrationId;
    @XmlElement(name = "PaymentAccountName")
    protected QueryType paymentAccountName;
    @XmlElement(name = "PaymentAccountSite")
    protected QueryType paymentAccountSite;
    @XmlElement(name = "PaymentContactId")
    protected QueryType paymentContactId;
    @XmlElement(name = "PaymentContactIntegrationId")
    protected QueryType paymentContactIntegrationId;
    @XmlElement(name = "PaymentDate")
    protected QueryType paymentDate;
    @XmlElement(name = "PaymentImportFlg")
    protected QueryType paymentImportFlg;
    @XmlElement(name = "PaymentMethod")
    protected QueryType paymentMethod;
    @XmlElement(name = "PaymentMethodLIC")
    protected QueryType paymentMethodLIC;
    @XmlElement(name = "PaymentProfileName")
    protected QueryType paymentProfileName;
    @XmlElement(name = "PaymentStatus")
    protected QueryType paymentStatus;
    @XmlElement(name = "PaymentStatusAsOfDate")
    protected QueryType paymentStatusAsOfDate;
    @XmlElement(name = "PaymentType")
    protected QueryType paymentType;
    @XmlElement(name = "PaymentTypeReadOnlyFlag")
    protected QueryType paymentTypeReadOnlyFlag;
    @XmlElement(name = "PersonalBillToCity")
    protected QueryType personalBillToCity;
    @XmlElement(name = "PersonalBillToCountry")
    protected QueryType personalBillToCountry;
    @XmlElement(name = "PersonalBillToPostalCode")
    protected QueryType personalBillToPostalCode;
    @XmlElement(name = "PersonalBillToState")
    protected QueryType personalBillToState;
    @XmlElement(name = "PersonalBillToStreetAddress")
    protected QueryType personalBillToStreetAddress;
    @XmlElement(name = "PersonalBillToStreetAddress2")
    protected QueryType personalBillToStreetAddress2;
    @XmlElement(name = "QuoteCustomerId")
    protected QueryType quoteCustomerId;
    @XmlElement(name = "QuoteId")
    protected QueryType quoteId;
    @XmlElement(name = "SSNEncryptionKey")
    protected QueryType ssnEncryptionKey;
    @XmlElement(name = "SaveCreditCard")
    protected QueryType saveCreditCard;
    @XmlElement(name = "SocialSecurityNumber")
    protected QueryType socialSecurityNumber;
    @XmlElement(name = "TransactionAmount")
    protected QueryType transactionAmount;
    @XmlElement(name = "TransactionId")
    protected QueryType transactionId;
    @XmlElement(name = "TransactionMessage")
    protected QueryType transactionMessage;
    @XmlElement(name = "TransactionTime")
    protected QueryType transactionTime;
    @XmlElement(name = "TransactionType")
    protected QueryType transactionType;
    @XmlElement(name = "VendorId")
    protected QueryType vendorId;
    @XmlElement(name = "VerificationNumber")
    protected QueryType verificationNumber;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the mtoPaymentInstrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOPaymentInstrNumber() {
        return mtoPaymentInstrNumber;
    }

    /**
     * Sets the value of the mtoPaymentInstrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOPaymentInstrNumber(QueryType value) {
        this.mtoPaymentInstrNumber = value;
    }

    /**
     * Gets the value of the mtoIdProofType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOIdProofType() {
        return mtoIdProofType;
    }

    /**
     * Sets the value of the mtoIdProofType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOIdProofType(QueryType value) {
        this.mtoIdProofType = value;
    }

    /**
     * Gets the value of the mtoIdProofNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOIdProofNumber() {
        return mtoIdProofNumber;
    }

    /**
     * Sets the value of the mtoIdProofNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOIdProofNumber(QueryType value) {
        this.mtoIdProofNumber = value;
    }

    /**
     * Gets the value of the mtoCreditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOCreditCardNumber() {
        return mtoCreditCardNumber;
    }

    /**
     * Sets the value of the mtoCreditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOCreditCardNumber(QueryType value) {
        this.mtoCreditCardNumber = value;
    }

    /**
     * Gets the value of the mtoCreditAuthorizationTime property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOCreditAuthorizationTime() {
        return mtoCreditAuthorizationTime;
    }

    /**
     * Sets the value of the mtoCreditAuthorizationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOCreditAuthorizationTime(QueryType value) {
        this.mtoCreditAuthorizationTime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setId(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreated(QueryType value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdated(QueryType value) {
        this.updated = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConflictId(QueryType value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setModId(QueryType value) {
        this.modId = value;
    }

    /**
     * Gets the value of the abaCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getABACode() {
        return abaCode;
    }

    /**
     * Sets the value of the abaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setABACode(QueryType value) {
        this.abaCode = value;
    }

    /**
     * Gets the value of the avsCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAVSCode() {
        return avsCode;
    }

    /**
     * Sets the value of the avsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAVSCode(QueryType value) {
        this.avsCode = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountNumber(QueryType value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountNumberReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountNumberReadOnly() {
        return accountNumberReadOnly;
    }

    /**
     * Sets the value of the accountNumberReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountNumberReadOnly(QueryType value) {
        this.accountNumberReadOnly = value;
    }

    /**
     * Gets the value of the actualCharge property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActualCharge() {
        return actualCharge;
    }

    /**
     * Sets the value of the actualCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActualCharge(QueryType value) {
        this.actualCharge = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAuthorizationCode(QueryType value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAuthorizationDate(QueryType value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the bcReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBCReadOnlyFlag() {
        return bcReadOnlyFlag;
    }

    /**
     * Sets the value of the bcReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBCReadOnlyFlag(QueryType value) {
        this.bcReadOnlyFlag = value;
    }

    /**
     * Gets the value of the bankAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Sets the value of the bankAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAccountId(QueryType value) {
        this.bankAccountId = value;
    }

    /**
     * Gets the value of the bankAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAddressId() {
        return bankAddressId;
    }

    /**
     * Sets the value of the bankAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAddressId(QueryType value) {
        this.bankAddressId = value;
    }

    /**
     * Gets the value of the billToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAddressId() {
        return billToAddressId;
    }

    /**
     * Sets the value of the billToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAddressId(QueryType value) {
        this.billToAddressId = value;
    }

    /**
     * Gets the value of the billToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAddressIntegrationId() {
        return billToAddressIntegrationId;
    }

    /**
     * Sets the value of the billToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAddressIntegrationId(QueryType value) {
        this.billToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the calculatedOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedOrderType() {
        return calculatedOrderType;
    }

    /**
     * Sets the value of the calculatedOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedOrderType(QueryType value) {
        this.calculatedOrderType = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCardHolder(QueryType value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactEmail(QueryType value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactFirstLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactFirstLastName() {
        return contactFirstLastName;
    }

    /**
     * Sets the value of the contactFirstLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactFirstLastName(QueryType value) {
        this.contactFirstLastName = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactFirstName(QueryType value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactLastFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactLastFirstName() {
        return contactLastFirstName;
    }

    /**
     * Sets the value of the contactLastFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactLastFirstName(QueryType value) {
        this.contactLastFirstName = value;
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactLastName(QueryType value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactName(QueryType value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactPhone(QueryType value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the createdByName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreatedByName() {
        return createdByName;
    }

    /**
     * Sets the value of the createdByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreatedByName(QueryType value) {
        this.createdByName = value;
    }

    /**
     * Gets the value of the creditCardNumberDisplay2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardNumberDisplay2() {
        return creditCardNumberDisplay2;
    }

    /**
     * Sets the value of the creditCardNumberDisplay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardNumberDisplay2(QueryType value) {
        this.creditCardNumberDisplay2 = value;
    }

    /**
     * Gets the value of the creditCardTransactionResponseCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardTransactionResponseCode2() {
        return creditCardTransactionResponseCode2;
    }

    /**
     * Sets the value of the creditCardTransactionResponseCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardTransactionResponseCode2(QueryType value) {
        this.creditCardTransactionResponseCode2 = value;
    }

    /**
     * Gets the value of the creditCardTransactionResponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardTransactionResponseMessage() {
        return creditCardTransactionResponseMessage;
    }

    /**
     * Sets the value of the creditCardTransactionResponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardTransactionResponseMessage(QueryType value) {
        this.creditCardTransactionResponseMessage = value;
    }

    /**
     * Gets the value of the creditCheckMessage2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCheckMessage2() {
        return creditCheckMessage2;
    }

    /**
     * Sets the value of the creditCheckMessage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCheckMessage2(QueryType value) {
        this.creditCheckMessage2 = value;
    }

    /**
     * Gets the value of the creditCheckStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCheckStatus() {
        return creditCheckStatus;
    }

    /**
     * Sets the value of the creditCheckStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCheckStatus(QueryType value) {
        this.creditCheckStatus = value;
    }

    /**
     * Gets the value of the creditCheckStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCheckStatusAsOfDate() {
        return creditCheckStatusAsOfDate;
    }

    /**
     * Sets the value of the creditCheckStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCheckStatusAsOfDate(QueryType value) {
        this.creditCheckStatusAsOfDate = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrencyCode(QueryType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customerId2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCustomerId2() {
        return customerId2;
    }

    /**
     * Sets the value of the customerId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCustomerId2(QueryType value) {
        this.customerId2 = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDateOfBirth(QueryType value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescription(QueryType value) {
        this.description = value;
    }

    /**
     * Gets the value of the desiredPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDesiredPayDate() {
        return desiredPayDate;
    }

    /**
     * Sets the value of the desiredPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDesiredPayDate(QueryType value) {
        this.desiredPayDate = value;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEncryptionKey(QueryType value) {
        this.encryptionKey = value;
    }

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExchangeDate(QueryType value) {
        this.exchangeDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExpirationDate(QueryType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExpirationMonth(QueryType value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExpirationYear(QueryType value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFirstName(QueryType value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the integrationId2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId2() {
        return integrationId2;
    }

    /**
     * Sets the value of the integrationId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId2(QueryType value) {
        this.integrationId2 = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInvoiceId(QueryType value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInvoiceNumber(QueryType value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the issuingBankCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIssuingBankCustomerId() {
        return issuingBankCustomerId;
    }

    /**
     * Sets the value of the issuingBankCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIssuingBankCustomerId(QueryType value) {
        this.issuingBankCustomerId = value;
    }

    /**
     * Gets the value of the issuingBankName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIssuingBankName() {
        return issuingBankName;
    }

    /**
     * Sets the value of the issuingBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIssuingBankName(QueryType value) {
        this.issuingBankName = value;
    }

    /**
     * Gets the value of the issuingBankPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIssuingBankPhoneNumber() {
        return issuingBankPhoneNumber;
    }

    /**
     * Sets the value of the issuingBankPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIssuingBankPhoneNumber(QueryType value) {
        this.issuingBankPhoneNumber = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastName(QueryType value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineNumber(QueryType value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the manualAuthorizationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getManualAuthorizationFlag() {
        return manualAuthorizationFlag;
    }

    /**
     * Sets the value of the manualAuthorizationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setManualAuthorizationFlag(QueryType value) {
        this.manualAuthorizationFlag = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMerchantId(QueryType value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the orderCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderCustomerId() {
        return orderCustomerId;
    }

    /**
     * Sets the value of the orderCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderCustomerId(QueryType value) {
        this.orderCustomerId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderId(QueryType value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderNumber(QueryType value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * Sets the value of the orderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderTypeCode(QueryType value) {
        this.orderTypeCode = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayment(QueryType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentAccountId() {
        return paymentAccountId;
    }

    /**
     * Sets the value of the paymentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentAccountId(QueryType value) {
        this.paymentAccountId = value;
    }

    /**
     * Gets the value of the paymentAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentAccountIntegrationId() {
        return paymentAccountIntegrationId;
    }

    /**
     * Sets the value of the paymentAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentAccountIntegrationId(QueryType value) {
        this.paymentAccountIntegrationId = value;
    }

    /**
     * Gets the value of the paymentAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentAccountName() {
        return paymentAccountName;
    }

    /**
     * Sets the value of the paymentAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentAccountName(QueryType value) {
        this.paymentAccountName = value;
    }

    /**
     * Gets the value of the paymentAccountSite property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentAccountSite() {
        return paymentAccountSite;
    }

    /**
     * Sets the value of the paymentAccountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentAccountSite(QueryType value) {
        this.paymentAccountSite = value;
    }

    /**
     * Gets the value of the paymentContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentContactId() {
        return paymentContactId;
    }

    /**
     * Sets the value of the paymentContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentContactId(QueryType value) {
        this.paymentContactId = value;
    }

    /**
     * Gets the value of the paymentContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentContactIntegrationId() {
        return paymentContactIntegrationId;
    }

    /**
     * Sets the value of the paymentContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentContactIntegrationId(QueryType value) {
        this.paymentContactIntegrationId = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentDate(QueryType value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentImportFlg property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentImportFlg() {
        return paymentImportFlg;
    }

    /**
     * Sets the value of the paymentImportFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentImportFlg(QueryType value) {
        this.paymentImportFlg = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentMethod(QueryType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentMethodLIC property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentMethodLIC() {
        return paymentMethodLIC;
    }

    /**
     * Sets the value of the paymentMethodLIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentMethodLIC(QueryType value) {
        this.paymentMethodLIC = value;
    }

    /**
     * Gets the value of the paymentProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentProfileName() {
        return paymentProfileName;
    }

    /**
     * Sets the value of the paymentProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentProfileName(QueryType value) {
        this.paymentProfileName = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentStatus(QueryType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentStatusAsOfDate() {
        return paymentStatusAsOfDate;
    }

    /**
     * Sets the value of the paymentStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentStatusAsOfDate(QueryType value) {
        this.paymentStatusAsOfDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentType(QueryType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentTypeReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentTypeReadOnlyFlag() {
        return paymentTypeReadOnlyFlag;
    }

    /**
     * Sets the value of the paymentTypeReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentTypeReadOnlyFlag(QueryType value) {
        this.paymentTypeReadOnlyFlag = value;
    }

    /**
     * Gets the value of the personalBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToCity() {
        return personalBillToCity;
    }

    /**
     * Sets the value of the personalBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToCity(QueryType value) {
        this.personalBillToCity = value;
    }

    /**
     * Gets the value of the personalBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToCountry() {
        return personalBillToCountry;
    }

    /**
     * Sets the value of the personalBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToCountry(QueryType value) {
        this.personalBillToCountry = value;
    }

    /**
     * Gets the value of the personalBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToPostalCode() {
        return personalBillToPostalCode;
    }

    /**
     * Sets the value of the personalBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToPostalCode(QueryType value) {
        this.personalBillToPostalCode = value;
    }

    /**
     * Gets the value of the personalBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToState() {
        return personalBillToState;
    }

    /**
     * Sets the value of the personalBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToState(QueryType value) {
        this.personalBillToState = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToStreetAddress() {
        return personalBillToStreetAddress;
    }

    /**
     * Sets the value of the personalBillToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToStreetAddress(QueryType value) {
        this.personalBillToStreetAddress = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToStreetAddress2() {
        return personalBillToStreetAddress2;
    }

    /**
     * Sets the value of the personalBillToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToStreetAddress2(QueryType value) {
        this.personalBillToStreetAddress2 = value;
    }

    /**
     * Gets the value of the quoteCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteCustomerId() {
        return quoteCustomerId;
    }

    /**
     * Sets the value of the quoteCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteCustomerId(QueryType value) {
        this.quoteCustomerId = value;
    }

    /**
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteId(QueryType value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the ssnEncryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSNEncryptionKey() {
        return ssnEncryptionKey;
    }

    /**
     * Sets the value of the ssnEncryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSNEncryptionKey(QueryType value) {
        this.ssnEncryptionKey = value;
    }

    /**
     * Gets the value of the saveCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSaveCreditCard() {
        return saveCreditCard;
    }

    /**
     * Sets the value of the saveCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSaveCreditCard(QueryType value) {
        this.saveCreditCard = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSocialSecurityNumber(QueryType value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransactionAmount(QueryType value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransactionId(QueryType value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransactionMessage() {
        return transactionMessage;
    }

    /**
     * Sets the value of the transactionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransactionMessage(QueryType value) {
        this.transactionMessage = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransactionTime(QueryType value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransactionType(QueryType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVendorId(QueryType value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the verificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVerificationNumber() {
        return verificationNumber;
    }

    /**
     * Sets the value of the verificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVerificationNumber(QueryType value) {
        this.verificationNumber = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
