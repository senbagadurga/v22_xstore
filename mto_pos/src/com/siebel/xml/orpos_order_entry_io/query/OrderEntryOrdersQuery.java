
package com.siebel.xml.orpos_order_entry_io.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderEntry-OrdersQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderEntry-OrdersQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOPaymentRefNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOOrderOfficeId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOBusinessDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOApplicationStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOAccountSCBalance" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MTOAccountPrepaidBalance" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ATPMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ATPStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ATPStatusAsOfDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountContractedProductsOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountOrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountOrderNumber-OLD" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPriceListId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AgreementId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AgreementIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AgreementName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Approved" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovedBy-EmpLogin" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovedBy-EmployeeId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovedBy-PositionId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovedByDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AsOfDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AutoReceiveFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AvailableDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BackOfficeErrorText" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BackOfficeOrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BackOfficeProcessStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillTo-County" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillTo-Province" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccountConstrained" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccountLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAddressIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAddressSiteUseIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToCityState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToCityStateENU" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToCityStateJPN" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToCityStateZip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToCityStateZipENU" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToCityStateZipJPN" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToDUNSNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToVATRegistrationNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillableFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingBlock" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ByAge" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedCustomerId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedOrderType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CampConId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CampaignIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CampaignName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChangedSinceLastExportToTransactionWorkbook" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChargedFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Check" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactEmailAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactWorkPhone" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedByName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditAssignmentDescription" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditAssignmentStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardApprovalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardHolder" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardMerchantId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber-ReadOnly" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardNumberKeyIndex" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionID" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionResponseCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionTime" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckSkipFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckSkipThreshold" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckSkipThresholdCurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatusAsOfDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditSubmissionTime" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCityState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCityStateZip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCountry" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToPostalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToStreetAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToStreetAddress2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalBasePrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalDiscount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalItemDiscount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalNetDiscountPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalNetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DeliveryBlock" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocationIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountAmountMRC" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountPercentMRC" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountReason" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EAISyncDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityCompatibilityProcedureName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EntitlementId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EntitlementName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExportedOnceToTransactionWorkbook" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Freight" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightAmountCurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightAmountDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightTerms" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightTermsInfo" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FulfillLockFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HierarchyVersionId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HoldFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IncentiveCompensationStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IncentiveCompensationStatusDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InternalTaxAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IseChannelShopForMyAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsAdminMode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LoadNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MRCTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MaxRevisionNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MediaId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MovedToTransactionWorkbook" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NumberofShipments" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Opportunity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OptyIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OptyPrimaryPositionId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderItemQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderLateFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderPriority" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTypeCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTypeId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTypeLIC" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrganizationIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OverrideOwnerinReorderProcess" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="POAutoApproveLimit" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="POEditable" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="POEditableStatus1" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="POEditableStatus2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentOrderId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartialShip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToAccountLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToAddressIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToContactFirstLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToContactLastFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayToContactName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PayerAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentTermId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentTermIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCountry" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToPostalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateENU" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateJPN" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateZip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateZipENU" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateZipJPN" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToPostalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceModelId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PricingDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PricingProcedureName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCountry" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPostalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryFulfillInvlocId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOfferId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOfferName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPartnerId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPayerAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPayerAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCountry" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPostalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipmentId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriorityStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProjectIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProjectName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PromotionId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProspectId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PurchMgrComments" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RecipientName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RequestedShipDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReserveTime" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReserveTimeUoM" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnReason" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAddrId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAddressIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputBill-toCustomerNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputBill-toName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputOrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnMessageFull" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputShip-toCustomerNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputShip-toName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputSold-toCustomerNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputSold-toName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputSubmitDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPDistributionChannel" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPDistributionChannelMO" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPDivision" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPDivisionMO" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderDeliveryBlock" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderDeliveryStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderProcessingStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderPurchaseOrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderRequestedShipDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnMessageFull" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputUpdateDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPOrganizationIdMO" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPSalesArea" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPSalesAreaMO" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPSalesAreaId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPSalesOrganization" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPSalesOrganizationMO" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ScenarioTestFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceRequestId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceRequestNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipCompleteFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipInstructions" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountConstrained" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressSiteUseIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateENU" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateJPN" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZipENU" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZipJPN" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCountry" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToState" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToZip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipViaId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShopforSelfFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SingleSourceFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-AllProducts" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-CurrentTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-ProductType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-SpreadTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SubmitDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxAmountFromRate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExempt" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptReason" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxRateFromAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ThirdPartyTaxAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TotalFieldsActive" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TotalListPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TotalVolume" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TotalVolumeUoM" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TotalWeight" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TotalWeightUoM" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TrainingTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UltimateParentId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UpdatedByLogin" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserTypeB-to-B" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WebphoneOrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfPayments" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}ListOfPaymentsQuery" minOccurs="0"/>
 *         &lt;element name="ListOfOrderEntry-LineItems" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}ListOfOrderEntry-LineItemsQuery" minOccurs="0"/>
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
@XmlType(name = "OrderEntry-OrdersQuery", propOrder = {
    "transactionType",
    "mtoPaymentRefNumber",
    "mtoOrderOfficeId",
    "mtoBusinessDate",
    "mtoApplicationStatus",
    "mtoAccountSCBalance",
    "mtoAccountPrepaidBalance",
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "atpMessage",
    "atpStatus",
    "atpStatusAsOfDate",
    "account",
    "accountAddressId",
    "accountContractedProductsOnlyFlag",
    "accountId",
    "accountIntegrationId",
    "accountLocation",
    "accountOrderNumber",
    "accountOrderNumberOLD",
    "accountPriceListId",
    "accountType",
    "active",
    "age",
    "agreementId",
    "agreementIntegrationId",
    "agreementName",
    "approved",
    "approvedByEmpLogin",
    "approvedByEmployeeId",
    "approvedByPositionId",
    "approvedByDate",
    "asOfDate",
    "autoReceiveFlag",
    "availableDate",
    "backOfficeErrorText",
    "backOfficeOrderNumber",
    "backOfficeProcessStatus",
    "billToCounty",
    "billToProvince",
    "billToAccount",
    "billToAccountConstrained",
    "billToAccountId",
    "billToAccountIntegrationId",
    "billToAccountLocation",
    "billToAddressId",
    "billToAddressIntegrationId",
    "billToAddressSiteUseIntegrationId",
    "billToCityState",
    "billToCityStateENU",
    "billToCityStateJPN",
    "billToCityStateZip",
    "billToCityStateZipENU",
    "billToCityStateZipJPN",
    "billToContactId",
    "billToContactIntegrationId",
    "billToDUNSNumber",
    "billToVATRegistrationNumber",
    "billableFlag",
    "billingAccount",
    "billingAccountId",
    "billingBlock",
    "byAge",
    "calculatedCustomerId",
    "calculatedOrderType",
    "campConId",
    "campaignId",
    "campaignIntegrationId",
    "campaignName",
    "carrierPriority",
    "carrierType",
    "changedSinceLastExportToTransactionWorkbook",
    "chargedFlag",
    "check",
    "comments",
    "compoundProductNumber",
    "contactEmailAddress",
    "contactFirstName",
    "contactId",
    "contactIntegrationId",
    "contactLastName",
    "contactWorkPhone",
    "createdByName",
    "creditAssignmentDescription",
    "creditAssignmentStatus",
    "creditCardApprovalCode",
    "creditCardExpirationDate",
    "creditCardExpirationMonth",
    "creditCardExpirationYear",
    "creditCardHolder",
    "creditCardMerchantId",
    "creditCardName",
    "creditCardNumber",
    "creditCardNumberDisplay",
    "creditCardNumberReadOnly",
    "creditCardNumberKeyIndex",
    "creditCardTransactionAmount",
    "creditCardTransactionID",
    "creditCardTransactionResponseCode",
    "creditCardTransactionStatus",
    "creditCardTransactionTime",
    "creditCheckMessage",
    "creditCheckSkipFlag",
    "creditCheckSkipThreshold",
    "creditCheckSkipThresholdCurrencyCode",
    "creditCheckStatus",
    "creditCheckStatusAsOfDate",
    "creditStatus",
    "creditSubmissionTime",
    "currencyCode",
    "currentOrderShipToCity",
    "currentOrderShipToCityState",
    "currentOrderShipToCityStateZip",
    "currentOrderShipToCountry",
    "currentOrderShipToPostalCode",
    "currentOrderShipToState",
    "currentOrderShipToStreetAddress",
    "currentOrderShipToStreetAddress2",
    "currentOrderTotalBasePrice",
    "currentOrderTotalDiscount",
    "currentOrderTotalItemDiscount",
    "currentOrderTotalNetDiscountPrice",
    "currentOrderTotalNetPrice",
    "customerId",
    "deliveryBlock",
    "deliveryStatus",
    "description",
    "destinationInventoryId",
    "destinationInventoryLocation",
    "destinationInventoryLocationIntegrationId",
    "discount",
    "discountAmount",
    "discountAmountMRC",
    "discountPercentMRC",
    "discountReason",
    "eaiSyncDate",
    "eligibilityCompatibilityProcedureName",
    "entitlementId",
    "entitlementName",
    "exchangeDate",
    "exportedOnceToTransactionWorkbook",
    "freight",
    "freightAmountCurrencyCode",
    "freightAmountDate",
    "freightTerms",
    "freightTermsInfo",
    "freightTotal",
    "fulfillLockFlag",
    "hierarchyVersionId",
    "holdFlag",
    "incentiveCompensationStatus",
    "incentiveCompensationStatusDate",
    "integrationId",
    "internalTaxAmount",
    "iseChannelShopForMyAccount",
    "isAdminMode",
    "loadNumber",
    "mrcTotal",
    "maxRevisionNumber",
    "mediaId",
    "movedToTransactionWorkbook",
    "nrcTotal",
    "numberofShipments",
    "opportunity",
    "optyId",
    "optyIntegrationId",
    "optyPrimaryPositionId",
    "orderDate",
    "orderItemQuantity",
    "orderLateFlag",
    "orderNumber",
    "orderPriority",
    "orderTotal",
    "orderType",
    "orderTypeCode",
    "orderTypeId",
    "orderTypeLIC",
    "organizationIntegrationId",
    "overrideOwnerinReorderProcess",
    "poAutoApproveLimit",
    "poEditable",
    "poEditableStatus1",
    "poEditableStatus2",
    "parentOrderId",
    "partialShip",
    "payToAccount",
    "payToAccountId",
    "payToAccountIntegrationId",
    "payToAccountLocation",
    "payToAddressId",
    "payToAddressIntegrationId",
    "payToContactFirstLastName",
    "payToContactId",
    "payToContactIntegrationId",
    "payToContactLastFirstName",
    "payToContactName",
    "payerAccountIntegrationId",
    "paymentMethod",
    "paymentTerm",
    "paymentTermId",
    "paymentTermIntegrationId",
    "personalBillToAddressId",
    "personalBillToCity",
    "personalBillToCountry",
    "personalBillToPostalCode",
    "personalBillToState",
    "personalBillToStreetAddress",
    "personalBillToStreetAddress2",
    "personalShipToAddressId",
    "personalShipToCity",
    "personalShipToCityState",
    "personalShipToCityStateENU",
    "personalShipToCityStateJPN",
    "personalShipToCityStateZip",
    "personalShipToCityStateZipENU",
    "personalShipToCityStateZipJPN",
    "personalShipToCountry",
    "personalShipToPostalCode",
    "personalShipToState",
    "personalShipToStreetAddress",
    "personalShipToStreetAddress2",
    "priceList",
    "priceListId",
    "priceListIntegrationId",
    "priceModelId",
    "pricingDate",
    "pricingProcedureName",
    "primaryBillToAddress",
    "primaryBillToAddressId",
    "primaryBillToCity",
    "primaryBillToContactId",
    "primaryBillToCountry",
    "primaryBillToFirstName",
    "primaryBillToLastName",
    "primaryBillToPostalCode",
    "primaryBillToState",
    "primaryFulfillInvlocId",
    "primaryOfferId",
    "primaryOfferName",
    "primaryOrganization",
    "primaryOrganizationId",
    "primaryPartnerId",
    "primaryPayerAccount",
    "primaryPayerAccountId",
    "primaryPaymentAmount",
    "primaryPaymentId",
    "primaryPositionContactId",
    "primaryPositionContactIntegrationId",
    "primaryPositionId",
    "primaryShipToAddress",
    "primaryShipToAddressId",
    "primaryShipToCity",
    "primaryShipToContactId",
    "primaryShipToCountry",
    "primaryShipToFirstName",
    "primaryShipToLastName",
    "primaryShipToPostalCode",
    "primaryShipToState",
    "primaryShipmentId",
    "priorityStatus",
    "productTotal",
    "projectId",
    "projectIntegrationId",
    "projectName",
    "promotionId",
    "prospectId",
    "purchMgrComments",
    "quoteId",
    "quoteIntegrationId",
    "quoteNumber",
    "recipientName",
    "requestedShipDate",
    "reserveTime",
    "reserveTimeUoM",
    "returnReason",
    "returnToAccount",
    "returnToAccountId",
    "returnToAccountIntegrationId",
    "returnToAccountLocation",
    "returnToAddrId",
    "returnToAddressIntegrationId",
    "returnToContactId",
    "returnToContactIntegrationId",
    "revision",
    "sapCreateOrderOutputBillToCustomerNumber",
    "sapCreateOrderOutputBillToName",
    "sapCreateOrderOutputOrderNumber",
    "sapCreateOrderOutputReturnCode",
    "sapCreateOrderOutputReturnMessage",
    "sapCreateOrderOutputReturnMessageFull",
    "sapCreateOrderOutputReturnType",
    "sapCreateOrderOutputShipToCustomerNumber",
    "sapCreateOrderOutputShipToName",
    "sapCreateOrderOutputSoldToCustomerNumber",
    "sapCreateOrderOutputSoldToName",
    "sapCreateOrderOutputSubmitDate",
    "sapDistributionChannel",
    "sapDistributionChannelMO",
    "sapDivision",
    "sapDivisionMO",
    "sapOrderStatusHeaderDeliveryBlock",
    "sapOrderStatusHeaderDeliveryStatus",
    "sapOrderStatusHeaderProcessingStatus",
    "sapOrderStatusHeaderPurchaseOrderNumber",
    "sapOrderStatusHeaderRequestedShipDate",
    "sapOrderStatusOutputId",
    "sapOrderStatusOutputReturnCode",
    "sapOrderStatusOutputReturnMessage",
    "sapOrderStatusOutputReturnMessageFull",
    "sapOrderStatusOutputReturnType",
    "sapOrderStatusOutputUpdateDate",
    "sapOrganizationIdMO",
    "sapSalesArea",
    "sapSalesAreaMO",
    "sapSalesAreaId",
    "sapSalesOrganization",
    "sapSalesOrganizationMO",
    "scenarioTestFlag",
    "serviceAccount",
    "serviceAccountId",
    "serviceRequestId",
    "serviceRequestNumber",
    "serviceTotal",
    "shipCompleteFlag",
    "shipInstructions",
    "shipToAccount",
    "shipToAccountConstrained",
    "shipToAccountId",
    "shipToAccountIntegrationId",
    "shipToAccountLocation",
    "shipToAddressId",
    "shipToAddressIntegrationId",
    "shipToAddressSiteUseIntegrationId",
    "shipToCity",
    "shipToCityState",
    "shipToCityStateENU",
    "shipToCityStateJPN",
    "shipToCityStateZip",
    "shipToCityStateZipENU",
    "shipToCityStateZipJPN",
    "shipToContactId",
    "shipToContactIntegrationId",
    "shipToCountry",
    "shipToState",
    "shipToZip",
    "shipViaId",
    "shopforSelfFlag",
    "singleSourceFlag",
    "sourceInventoryId",
    "sourceInventoryLocIntegrationId",
    "sourceInventoryLocation",
    "spreadDiscountAllProducts",
    "spreadDiscountCurrentTotal",
    "spreadDiscountProductType",
    "spreadDiscountSpreadTotal",
    "status",
    "submitDate",
    "tax",
    "taxAmount",
    "taxAmountFromRate",
    "taxExempt",
    "taxExemptNumber",
    "taxExemptReason",
    "taxRate",
    "taxRateFromAmount",
    "thirdPartyTaxAmount",
    "totalCurrentPrice",
    "totalFieldsActive",
    "totalListPrice",
    "totalVolume",
    "totalVolumeUoM",
    "totalWeight",
    "totalWeightUoM",
    "trainingTotal",
    "ultimateParentId",
    "updatedByLogin",
    "userType",
    "userTypeBToB",
    "webphoneOrderNumber",
    "listOfPayments",
    "listOfOrderEntryLineItems"
})
public class OrderEntryOrdersQuery {

    @XmlElement(name = "TransactionType")
    protected QueryType transactionType;
    @XmlElement(name = "MTOPaymentRefNumber")
    protected QueryType mtoPaymentRefNumber;
    @XmlElement(name = "MTOOrderOfficeId")
    protected QueryType mtoOrderOfficeId;
    @XmlElement(name = "MTOBusinessDate")
    protected QueryType mtoBusinessDate;
    @XmlElement(name = "MTOApplicationStatus")
    protected QueryType mtoApplicationStatus;
    @XmlElement(name = "MTOAccountSCBalance")
    protected QueryType mtoAccountSCBalance;
    @XmlElement(name = "MTOAccountPrepaidBalance")
    protected QueryType mtoAccountPrepaidBalance;
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
    @XmlElement(name = "ATPMessage")
    protected QueryType atpMessage;
    @XmlElement(name = "ATPStatus")
    protected QueryType atpStatus;
    @XmlElement(name = "ATPStatusAsOfDate")
    protected QueryType atpStatusAsOfDate;
    @XmlElement(name = "Account")
    protected QueryType account;
    @XmlElement(name = "AccountAddressId")
    protected QueryType accountAddressId;
    @XmlElement(name = "AccountContractedProductsOnlyFlag")
    protected QueryType accountContractedProductsOnlyFlag;
    @XmlElement(name = "AccountId")
    protected QueryType accountId;
    @XmlElement(name = "AccountIntegrationId")
    protected QueryType accountIntegrationId;
    @XmlElement(name = "AccountLocation")
    protected QueryType accountLocation;
    @XmlElement(name = "AccountOrderNumber")
    protected QueryType accountOrderNumber;
    @XmlElement(name = "AccountOrderNumber-OLD")
    protected QueryType accountOrderNumberOLD;
    @XmlElement(name = "AccountPriceListId")
    protected QueryType accountPriceListId;
    @XmlElement(name = "AccountType")
    protected QueryType accountType;
    @XmlElement(name = "Active")
    protected QueryType active;
    @XmlElement(name = "Age")
    protected QueryType age;
    @XmlElement(name = "AgreementId")
    protected QueryType agreementId;
    @XmlElement(name = "AgreementIntegrationId")
    protected QueryType agreementIntegrationId;
    @XmlElement(name = "AgreementName")
    protected QueryType agreementName;
    @XmlElement(name = "Approved")
    protected QueryType approved;
    @XmlElement(name = "ApprovedBy-EmpLogin")
    protected QueryType approvedByEmpLogin;
    @XmlElement(name = "ApprovedBy-EmployeeId")
    protected QueryType approvedByEmployeeId;
    @XmlElement(name = "ApprovedBy-PositionId")
    protected QueryType approvedByPositionId;
    @XmlElement(name = "ApprovedByDate")
    protected QueryType approvedByDate;
    @XmlElement(name = "AsOfDate")
    protected QueryType asOfDate;
    @XmlElement(name = "AutoReceiveFlag")
    protected QueryType autoReceiveFlag;
    @XmlElement(name = "AvailableDate")
    protected QueryType availableDate;
    @XmlElement(name = "BackOfficeErrorText")
    protected QueryType backOfficeErrorText;
    @XmlElement(name = "BackOfficeOrderNumber")
    protected QueryType backOfficeOrderNumber;
    @XmlElement(name = "BackOfficeProcessStatus")
    protected QueryType backOfficeProcessStatus;
    @XmlElement(name = "BillTo-County")
    protected QueryType billToCounty;
    @XmlElement(name = "BillTo-Province")
    protected QueryType billToProvince;
    @XmlElement(name = "BillToAccount")
    protected QueryType billToAccount;
    @XmlElement(name = "BillToAccountConstrained")
    protected QueryType billToAccountConstrained;
    @XmlElement(name = "BillToAccountId")
    protected QueryType billToAccountId;
    @XmlElement(name = "BillToAccountIntegrationId")
    protected QueryType billToAccountIntegrationId;
    @XmlElement(name = "BillToAccountLocation")
    protected QueryType billToAccountLocation;
    @XmlElement(name = "BillToAddressId")
    protected QueryType billToAddressId;
    @XmlElement(name = "BillToAddressIntegrationId")
    protected QueryType billToAddressIntegrationId;
    @XmlElement(name = "BillToAddressSiteUseIntegrationId")
    protected QueryType billToAddressSiteUseIntegrationId;
    @XmlElement(name = "BillToCityState")
    protected QueryType billToCityState;
    @XmlElement(name = "BillToCityStateENU")
    protected QueryType billToCityStateENU;
    @XmlElement(name = "BillToCityStateJPN")
    protected QueryType billToCityStateJPN;
    @XmlElement(name = "BillToCityStateZip")
    protected QueryType billToCityStateZip;
    @XmlElement(name = "BillToCityStateZipENU")
    protected QueryType billToCityStateZipENU;
    @XmlElement(name = "BillToCityStateZipJPN")
    protected QueryType billToCityStateZipJPN;
    @XmlElement(name = "BillToContactId")
    protected QueryType billToContactId;
    @XmlElement(name = "BillToContactIntegrationId")
    protected QueryType billToContactIntegrationId;
    @XmlElement(name = "BillToDUNSNumber")
    protected QueryType billToDUNSNumber;
    @XmlElement(name = "BillToVATRegistrationNumber")
    protected QueryType billToVATRegistrationNumber;
    @XmlElement(name = "BillableFlag")
    protected QueryType billableFlag;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected QueryType billingAccountId;
    @XmlElement(name = "BillingBlock")
    protected QueryType billingBlock;
    @XmlElement(name = "ByAge")
    protected QueryType byAge;
    @XmlElement(name = "CalculatedCustomerId")
    protected QueryType calculatedCustomerId;
    @XmlElement(name = "CalculatedOrderType")
    protected QueryType calculatedOrderType;
    @XmlElement(name = "CampConId")
    protected QueryType campConId;
    @XmlElement(name = "CampaignId")
    protected QueryType campaignId;
    @XmlElement(name = "CampaignIntegrationId")
    protected QueryType campaignIntegrationId;
    @XmlElement(name = "CampaignName")
    protected QueryType campaignName;
    @XmlElement(name = "CarrierPriority")
    protected QueryType carrierPriority;
    @XmlElement(name = "CarrierType")
    protected QueryType carrierType;
    @XmlElement(name = "ChangedSinceLastExportToTransactionWorkbook")
    protected QueryType changedSinceLastExportToTransactionWorkbook;
    @XmlElement(name = "ChargedFlag")
    protected QueryType chargedFlag;
    @XmlElement(name = "Check")
    protected QueryType check;
    @XmlElement(name = "Comments")
    protected QueryType comments;
    @XmlElement(name = "CompoundProductNumber")
    protected QueryType compoundProductNumber;
    @XmlElement(name = "ContactEmailAddress")
    protected QueryType contactEmailAddress;
    @XmlElement(name = "ContactFirstName")
    protected QueryType contactFirstName;
    @XmlElement(name = "ContactId")
    protected QueryType contactId;
    @XmlElement(name = "ContactIntegrationId")
    protected QueryType contactIntegrationId;
    @XmlElement(name = "ContactLastName")
    protected QueryType contactLastName;
    @XmlElement(name = "ContactWorkPhone")
    protected QueryType contactWorkPhone;
    @XmlElement(name = "CreatedByName")
    protected QueryType createdByName;
    @XmlElement(name = "CreditAssignmentDescription")
    protected QueryType creditAssignmentDescription;
    @XmlElement(name = "CreditAssignmentStatus")
    protected QueryType creditAssignmentStatus;
    @XmlElement(name = "CreditCardApprovalCode")
    protected QueryType creditCardApprovalCode;
    @XmlElement(name = "CreditCardExpirationDate")
    protected QueryType creditCardExpirationDate;
    @XmlElement(name = "CreditCardExpirationMonth")
    protected QueryType creditCardExpirationMonth;
    @XmlElement(name = "CreditCardExpirationYear")
    protected QueryType creditCardExpirationYear;
    @XmlElement(name = "CreditCardHolder")
    protected QueryType creditCardHolder;
    @XmlElement(name = "CreditCardMerchantId")
    protected QueryType creditCardMerchantId;
    @XmlElement(name = "CreditCardName")
    protected QueryType creditCardName;
    @XmlElement(name = "CreditCardNumber")
    protected QueryType creditCardNumber;
    @XmlElement(name = "CreditCardNumber-Display")
    protected QueryType creditCardNumberDisplay;
    @XmlElement(name = "CreditCardNumber-ReadOnly")
    protected QueryType creditCardNumberReadOnly;
    @XmlElement(name = "CreditCardNumberKeyIndex")
    protected QueryType creditCardNumberKeyIndex;
    @XmlElement(name = "CreditCardTransactionAmount")
    protected QueryType creditCardTransactionAmount;
    @XmlElement(name = "CreditCardTransactionID")
    protected QueryType creditCardTransactionID;
    @XmlElement(name = "CreditCardTransactionResponseCode")
    protected QueryType creditCardTransactionResponseCode;
    @XmlElement(name = "CreditCardTransactionStatus")
    protected QueryType creditCardTransactionStatus;
    @XmlElement(name = "CreditCardTransactionTime")
    protected QueryType creditCardTransactionTime;
    @XmlElement(name = "CreditCheckMessage")
    protected QueryType creditCheckMessage;
    @XmlElement(name = "CreditCheckSkipFlag")
    protected QueryType creditCheckSkipFlag;
    @XmlElement(name = "CreditCheckSkipThreshold")
    protected QueryType creditCheckSkipThreshold;
    @XmlElement(name = "CreditCheckSkipThresholdCurrencyCode")
    protected QueryType creditCheckSkipThresholdCurrencyCode;
    @XmlElement(name = "CreditCheckStatus")
    protected QueryType creditCheckStatus;
    @XmlElement(name = "CreditCheckStatusAsOfDate")
    protected QueryType creditCheckStatusAsOfDate;
    @XmlElement(name = "CreditStatus")
    protected QueryType creditStatus;
    @XmlElement(name = "CreditSubmissionTime")
    protected QueryType creditSubmissionTime;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "CurrentOrderShipToCity")
    protected QueryType currentOrderShipToCity;
    @XmlElement(name = "CurrentOrderShipToCityState")
    protected QueryType currentOrderShipToCityState;
    @XmlElement(name = "CurrentOrderShipToCityStateZip")
    protected QueryType currentOrderShipToCityStateZip;
    @XmlElement(name = "CurrentOrderShipToCountry")
    protected QueryType currentOrderShipToCountry;
    @XmlElement(name = "CurrentOrderShipToPostalCode")
    protected QueryType currentOrderShipToPostalCode;
    @XmlElement(name = "CurrentOrderShipToState")
    protected QueryType currentOrderShipToState;
    @XmlElement(name = "CurrentOrderShipToStreetAddress")
    protected QueryType currentOrderShipToStreetAddress;
    @XmlElement(name = "CurrentOrderShipToStreetAddress2")
    protected QueryType currentOrderShipToStreetAddress2;
    @XmlElement(name = "CurrentOrderTotalBasePrice")
    protected QueryType currentOrderTotalBasePrice;
    @XmlElement(name = "CurrentOrderTotalDiscount")
    protected QueryType currentOrderTotalDiscount;
    @XmlElement(name = "CurrentOrderTotalItemDiscount")
    protected QueryType currentOrderTotalItemDiscount;
    @XmlElement(name = "CurrentOrderTotalNetDiscountPrice")
    protected QueryType currentOrderTotalNetDiscountPrice;
    @XmlElement(name = "CurrentOrderTotalNetPrice")
    protected QueryType currentOrderTotalNetPrice;
    @XmlElement(name = "CustomerId")
    protected QueryType customerId;
    @XmlElement(name = "DeliveryBlock")
    protected QueryType deliveryBlock;
    @XmlElement(name = "DeliveryStatus")
    protected QueryType deliveryStatus;
    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "DestinationInventoryId")
    protected QueryType destinationInventoryId;
    @XmlElement(name = "DestinationInventoryLocation")
    protected QueryType destinationInventoryLocation;
    @XmlElement(name = "DestinationInventoryLocationIntegrationId")
    protected QueryType destinationInventoryLocationIntegrationId;
    @XmlElement(name = "Discount")
    protected QueryType discount;
    @XmlElement(name = "DiscountAmount")
    protected QueryType discountAmount;
    @XmlElement(name = "DiscountAmountMRC")
    protected QueryType discountAmountMRC;
    @XmlElement(name = "DiscountPercentMRC")
    protected QueryType discountPercentMRC;
    @XmlElement(name = "DiscountReason")
    protected QueryType discountReason;
    @XmlElement(name = "EAISyncDate")
    protected QueryType eaiSyncDate;
    @XmlElement(name = "EligibilityCompatibilityProcedureName")
    protected QueryType eligibilityCompatibilityProcedureName;
    @XmlElement(name = "EntitlementId")
    protected QueryType entitlementId;
    @XmlElement(name = "EntitlementName")
    protected QueryType entitlementName;
    @XmlElement(name = "ExchangeDate")
    protected QueryType exchangeDate;
    @XmlElement(name = "ExportedOnceToTransactionWorkbook")
    protected QueryType exportedOnceToTransactionWorkbook;
    @XmlElement(name = "Freight")
    protected QueryType freight;
    @XmlElement(name = "FreightAmountCurrencyCode")
    protected QueryType freightAmountCurrencyCode;
    @XmlElement(name = "FreightAmountDate")
    protected QueryType freightAmountDate;
    @XmlElement(name = "FreightTerms")
    protected QueryType freightTerms;
    @XmlElement(name = "FreightTermsInfo")
    protected QueryType freightTermsInfo;
    @XmlElement(name = "FreightTotal")
    protected QueryType freightTotal;
    @XmlElement(name = "FulfillLockFlag")
    protected QueryType fulfillLockFlag;
    @XmlElement(name = "HierarchyVersionId")
    protected QueryType hierarchyVersionId;
    @XmlElement(name = "HoldFlag")
    protected QueryType holdFlag;
    @XmlElement(name = "IncentiveCompensationStatus")
    protected QueryType incentiveCompensationStatus;
    @XmlElement(name = "IncentiveCompensationStatusDate")
    protected QueryType incentiveCompensationStatusDate;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "InternalTaxAmount")
    protected QueryType internalTaxAmount;
    @XmlElement(name = "IseChannelShopForMyAccount")
    protected QueryType iseChannelShopForMyAccount;
    @XmlElement(name = "IsAdminMode")
    protected QueryType isAdminMode;
    @XmlElement(name = "LoadNumber")
    protected QueryType loadNumber;
    @XmlElement(name = "MRCTotal")
    protected QueryType mrcTotal;
    @XmlElement(name = "MaxRevisionNumber")
    protected QueryType maxRevisionNumber;
    @XmlElement(name = "MediaId")
    protected QueryType mediaId;
    @XmlElement(name = "MovedToTransactionWorkbook")
    protected QueryType movedToTransactionWorkbook;
    @XmlElement(name = "NRCTotal")
    protected QueryType nrcTotal;
    @XmlElement(name = "NumberofShipments")
    protected QueryType numberofShipments;
    @XmlElement(name = "Opportunity")
    protected QueryType opportunity;
    @XmlElement(name = "OptyId")
    protected QueryType optyId;
    @XmlElement(name = "OptyIntegrationId")
    protected QueryType optyIntegrationId;
    @XmlElement(name = "OptyPrimaryPositionId")
    protected QueryType optyPrimaryPositionId;
    @XmlElement(name = "OrderDate")
    protected QueryType orderDate;
    @XmlElement(name = "OrderItemQuantity")
    protected QueryType orderItemQuantity;
    @XmlElement(name = "OrderLateFlag")
    protected QueryType orderLateFlag;
    @XmlElement(name = "OrderNumber")
    protected QueryType orderNumber;
    @XmlElement(name = "OrderPriority")
    protected QueryType orderPriority;
    @XmlElement(name = "OrderTotal")
    protected QueryType orderTotal;
    @XmlElement(name = "OrderType")
    protected QueryType orderType;
    @XmlElement(name = "OrderTypeCode")
    protected QueryType orderTypeCode;
    @XmlElement(name = "OrderTypeId")
    protected QueryType orderTypeId;
    @XmlElement(name = "OrderTypeLIC")
    protected QueryType orderTypeLIC;
    @XmlElement(name = "OrganizationIntegrationId")
    protected QueryType organizationIntegrationId;
    @XmlElement(name = "OverrideOwnerinReorderProcess")
    protected QueryType overrideOwnerinReorderProcess;
    @XmlElement(name = "POAutoApproveLimit")
    protected QueryType poAutoApproveLimit;
    @XmlElement(name = "POEditable")
    protected QueryType poEditable;
    @XmlElement(name = "POEditableStatus1")
    protected QueryType poEditableStatus1;
    @XmlElement(name = "POEditableStatus2")
    protected QueryType poEditableStatus2;
    @XmlElement(name = "ParentOrderId")
    protected QueryType parentOrderId;
    @XmlElement(name = "PartialShip")
    protected QueryType partialShip;
    @XmlElement(name = "PayToAccount")
    protected QueryType payToAccount;
    @XmlElement(name = "PayToAccountId")
    protected QueryType payToAccountId;
    @XmlElement(name = "PayToAccountIntegrationId")
    protected QueryType payToAccountIntegrationId;
    @XmlElement(name = "PayToAccountLocation")
    protected QueryType payToAccountLocation;
    @XmlElement(name = "PayToAddressId")
    protected QueryType payToAddressId;
    @XmlElement(name = "PayToAddressIntegrationId")
    protected QueryType payToAddressIntegrationId;
    @XmlElement(name = "PayToContactFirstLastName")
    protected QueryType payToContactFirstLastName;
    @XmlElement(name = "PayToContactId")
    protected QueryType payToContactId;
    @XmlElement(name = "PayToContactIntegrationId")
    protected QueryType payToContactIntegrationId;
    @XmlElement(name = "PayToContactLastFirstName")
    protected QueryType payToContactLastFirstName;
    @XmlElement(name = "PayToContactName")
    protected QueryType payToContactName;
    @XmlElement(name = "PayerAccountIntegrationId")
    protected QueryType payerAccountIntegrationId;
    @XmlElement(name = "PaymentMethod")
    protected QueryType paymentMethod;
    @XmlElement(name = "PaymentTerm")
    protected QueryType paymentTerm;
    @XmlElement(name = "PaymentTermId")
    protected QueryType paymentTermId;
    @XmlElement(name = "PaymentTermIntegrationId")
    protected QueryType paymentTermIntegrationId;
    @XmlElement(name = "PersonalBillToAddressId")
    protected QueryType personalBillToAddressId;
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
    @XmlElement(name = "PersonalShipToAddressId")
    protected QueryType personalShipToAddressId;
    @XmlElement(name = "PersonalShipToCity")
    protected QueryType personalShipToCity;
    @XmlElement(name = "PersonalShipToCityState")
    protected QueryType personalShipToCityState;
    @XmlElement(name = "PersonalShipToCityStateENU")
    protected QueryType personalShipToCityStateENU;
    @XmlElement(name = "PersonalShipToCityStateJPN")
    protected QueryType personalShipToCityStateJPN;
    @XmlElement(name = "PersonalShipToCityStateZip")
    protected QueryType personalShipToCityStateZip;
    @XmlElement(name = "PersonalShipToCityStateZipENU")
    protected QueryType personalShipToCityStateZipENU;
    @XmlElement(name = "PersonalShipToCityStateZipJPN")
    protected QueryType personalShipToCityStateZipJPN;
    @XmlElement(name = "PersonalShipToCountry")
    protected QueryType personalShipToCountry;
    @XmlElement(name = "PersonalShipToPostalCode")
    protected QueryType personalShipToPostalCode;
    @XmlElement(name = "PersonalShipToState")
    protected QueryType personalShipToState;
    @XmlElement(name = "PersonalShipToStreetAddress")
    protected QueryType personalShipToStreetAddress;
    @XmlElement(name = "PersonalShipToStreetAddress2")
    protected QueryType personalShipToStreetAddress2;
    @XmlElement(name = "PriceList")
    protected QueryType priceList;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected QueryType priceListIntegrationId;
    @XmlElement(name = "PriceModelId")
    protected QueryType priceModelId;
    @XmlElement(name = "PricingDate")
    protected QueryType pricingDate;
    @XmlElement(name = "PricingProcedureName")
    protected QueryType pricingProcedureName;
    @XmlElement(name = "PrimaryBillToAddress")
    protected QueryType primaryBillToAddress;
    @XmlElement(name = "PrimaryBillToAddressId")
    protected QueryType primaryBillToAddressId;
    @XmlElement(name = "PrimaryBillToCity")
    protected QueryType primaryBillToCity;
    @XmlElement(name = "PrimaryBillToContactId")
    protected QueryType primaryBillToContactId;
    @XmlElement(name = "PrimaryBillToCountry")
    protected QueryType primaryBillToCountry;
    @XmlElement(name = "PrimaryBillToFirstName")
    protected QueryType primaryBillToFirstName;
    @XmlElement(name = "PrimaryBillToLastName")
    protected QueryType primaryBillToLastName;
    @XmlElement(name = "PrimaryBillToPostalCode")
    protected QueryType primaryBillToPostalCode;
    @XmlElement(name = "PrimaryBillToState")
    protected QueryType primaryBillToState;
    @XmlElement(name = "PrimaryFulfillInvlocId")
    protected QueryType primaryFulfillInvlocId;
    @XmlElement(name = "PrimaryOfferId")
    protected QueryType primaryOfferId;
    @XmlElement(name = "PrimaryOfferName")
    protected QueryType primaryOfferName;
    @XmlElement(name = "PrimaryOrganization")
    protected QueryType primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected QueryType primaryOrganizationId;
    @XmlElement(name = "PrimaryPartnerId")
    protected QueryType primaryPartnerId;
    @XmlElement(name = "PrimaryPayerAccount")
    protected QueryType primaryPayerAccount;
    @XmlElement(name = "PrimaryPayerAccountId")
    protected QueryType primaryPayerAccountId;
    @XmlElement(name = "PrimaryPaymentAmount")
    protected QueryType primaryPaymentAmount;
    @XmlElement(name = "PrimaryPaymentId")
    protected QueryType primaryPaymentId;
    @XmlElement(name = "PrimaryPositionContactId")
    protected QueryType primaryPositionContactId;
    @XmlElement(name = "PrimaryPositionContactIntegrationId")
    protected QueryType primaryPositionContactIntegrationId;
    @XmlElement(name = "PrimaryPositionId")
    protected QueryType primaryPositionId;
    @XmlElement(name = "PrimaryShipToAddress")
    protected QueryType primaryShipToAddress;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected QueryType primaryShipToAddressId;
    @XmlElement(name = "PrimaryShipToCity")
    protected QueryType primaryShipToCity;
    @XmlElement(name = "PrimaryShipToContactId")
    protected QueryType primaryShipToContactId;
    @XmlElement(name = "PrimaryShipToCountry")
    protected QueryType primaryShipToCountry;
    @XmlElement(name = "PrimaryShipToFirstName")
    protected QueryType primaryShipToFirstName;
    @XmlElement(name = "PrimaryShipToLastName")
    protected QueryType primaryShipToLastName;
    @XmlElement(name = "PrimaryShipToPostalCode")
    protected QueryType primaryShipToPostalCode;
    @XmlElement(name = "PrimaryShipToState")
    protected QueryType primaryShipToState;
    @XmlElement(name = "PrimaryShipmentId")
    protected QueryType primaryShipmentId;
    @XmlElement(name = "PriorityStatus")
    protected QueryType priorityStatus;
    @XmlElement(name = "ProductTotal")
    protected QueryType productTotal;
    @XmlElement(name = "ProjectId")
    protected QueryType projectId;
    @XmlElement(name = "ProjectIntegrationId")
    protected QueryType projectIntegrationId;
    @XmlElement(name = "ProjectName")
    protected QueryType projectName;
    @XmlElement(name = "PromotionId")
    protected QueryType promotionId;
    @XmlElement(name = "ProspectId")
    protected QueryType prospectId;
    @XmlElement(name = "PurchMgrComments")
    protected QueryType purchMgrComments;
    @XmlElement(name = "QuoteId")
    protected QueryType quoteId;
    @XmlElement(name = "QuoteIntegrationId")
    protected QueryType quoteIntegrationId;
    @XmlElement(name = "QuoteNumber")
    protected QueryType quoteNumber;
    @XmlElement(name = "RecipientName")
    protected QueryType recipientName;
    @XmlElement(name = "RequestedShipDate")
    protected QueryType requestedShipDate;
    @XmlElement(name = "ReserveTime")
    protected QueryType reserveTime;
    @XmlElement(name = "ReserveTimeUoM")
    protected QueryType reserveTimeUoM;
    @XmlElement(name = "ReturnReason")
    protected QueryType returnReason;
    @XmlElement(name = "ReturnToAccount")
    protected QueryType returnToAccount;
    @XmlElement(name = "ReturnToAccountId")
    protected QueryType returnToAccountId;
    @XmlElement(name = "ReturnToAccountIntegrationId")
    protected QueryType returnToAccountIntegrationId;
    @XmlElement(name = "ReturnToAccountLocation")
    protected QueryType returnToAccountLocation;
    @XmlElement(name = "ReturnToAddrId")
    protected QueryType returnToAddrId;
    @XmlElement(name = "ReturnToAddressIntegrationId")
    protected QueryType returnToAddressIntegrationId;
    @XmlElement(name = "ReturnToContactId")
    protected QueryType returnToContactId;
    @XmlElement(name = "ReturnToContactIntegrationId")
    protected QueryType returnToContactIntegrationId;
    @XmlElement(name = "Revision")
    protected QueryType revision;
    @XmlElement(name = "SAPCreateOrderOutputBill-toCustomerNumber")
    protected QueryType sapCreateOrderOutputBillToCustomerNumber;
    @XmlElement(name = "SAPCreateOrderOutputBill-toName")
    protected QueryType sapCreateOrderOutputBillToName;
    @XmlElement(name = "SAPCreateOrderOutputOrderNumber")
    protected QueryType sapCreateOrderOutputOrderNumber;
    @XmlElement(name = "SAPCreateOrderOutputReturnCode")
    protected QueryType sapCreateOrderOutputReturnCode;
    @XmlElement(name = "SAPCreateOrderOutputReturnMessage")
    protected QueryType sapCreateOrderOutputReturnMessage;
    @XmlElement(name = "SAPCreateOrderOutputReturnMessageFull")
    protected QueryType sapCreateOrderOutputReturnMessageFull;
    @XmlElement(name = "SAPCreateOrderOutputReturnType")
    protected QueryType sapCreateOrderOutputReturnType;
    @XmlElement(name = "SAPCreateOrderOutputShip-toCustomerNumber")
    protected QueryType sapCreateOrderOutputShipToCustomerNumber;
    @XmlElement(name = "SAPCreateOrderOutputShip-toName")
    protected QueryType sapCreateOrderOutputShipToName;
    @XmlElement(name = "SAPCreateOrderOutputSold-toCustomerNumber")
    protected QueryType sapCreateOrderOutputSoldToCustomerNumber;
    @XmlElement(name = "SAPCreateOrderOutputSold-toName")
    protected QueryType sapCreateOrderOutputSoldToName;
    @XmlElement(name = "SAPCreateOrderOutputSubmitDate")
    protected QueryType sapCreateOrderOutputSubmitDate;
    @XmlElement(name = "SAPDistributionChannel")
    protected QueryType sapDistributionChannel;
    @XmlElement(name = "SAPDistributionChannelMO")
    protected QueryType sapDistributionChannelMO;
    @XmlElement(name = "SAPDivision")
    protected QueryType sapDivision;
    @XmlElement(name = "SAPDivisionMO")
    protected QueryType sapDivisionMO;
    @XmlElement(name = "SAPOrderStatusHeaderDeliveryBlock")
    protected QueryType sapOrderStatusHeaderDeliveryBlock;
    @XmlElement(name = "SAPOrderStatusHeaderDeliveryStatus")
    protected QueryType sapOrderStatusHeaderDeliveryStatus;
    @XmlElement(name = "SAPOrderStatusHeaderProcessingStatus")
    protected QueryType sapOrderStatusHeaderProcessingStatus;
    @XmlElement(name = "SAPOrderStatusHeaderPurchaseOrderNumber")
    protected QueryType sapOrderStatusHeaderPurchaseOrderNumber;
    @XmlElement(name = "SAPOrderStatusHeaderRequestedShipDate")
    protected QueryType sapOrderStatusHeaderRequestedShipDate;
    @XmlElement(name = "SAPOrderStatusOutputId")
    protected QueryType sapOrderStatusOutputId;
    @XmlElement(name = "SAPOrderStatusOutputReturnCode")
    protected QueryType sapOrderStatusOutputReturnCode;
    @XmlElement(name = "SAPOrderStatusOutputReturnMessage")
    protected QueryType sapOrderStatusOutputReturnMessage;
    @XmlElement(name = "SAPOrderStatusOutputReturnMessageFull")
    protected QueryType sapOrderStatusOutputReturnMessageFull;
    @XmlElement(name = "SAPOrderStatusOutputReturnType")
    protected QueryType sapOrderStatusOutputReturnType;
    @XmlElement(name = "SAPOrderStatusOutputUpdateDate")
    protected QueryType sapOrderStatusOutputUpdateDate;
    @XmlElement(name = "SAPOrganizationIdMO")
    protected QueryType sapOrganizationIdMO;
    @XmlElement(name = "SAPSalesArea")
    protected QueryType sapSalesArea;
    @XmlElement(name = "SAPSalesAreaMO")
    protected QueryType sapSalesAreaMO;
    @XmlElement(name = "SAPSalesAreaId")
    protected QueryType sapSalesAreaId;
    @XmlElement(name = "SAPSalesOrganization")
    protected QueryType sapSalesOrganization;
    @XmlElement(name = "SAPSalesOrganizationMO")
    protected QueryType sapSalesOrganizationMO;
    @XmlElement(name = "ScenarioTestFlag")
    protected QueryType scenarioTestFlag;
    @XmlElement(name = "ServiceAccount")
    protected QueryType serviceAccount;
    @XmlElement(name = "ServiceAccountId")
    protected QueryType serviceAccountId;
    @XmlElement(name = "ServiceRequestId")
    protected QueryType serviceRequestId;
    @XmlElement(name = "ServiceRequestNumber")
    protected QueryType serviceRequestNumber;
    @XmlElement(name = "ServiceTotal")
    protected QueryType serviceTotal;
    @XmlElement(name = "ShipCompleteFlag")
    protected QueryType shipCompleteFlag;
    @XmlElement(name = "ShipInstructions")
    protected QueryType shipInstructions;
    @XmlElement(name = "ShipToAccount")
    protected QueryType shipToAccount;
    @XmlElement(name = "ShipToAccountConstrained")
    protected QueryType shipToAccountConstrained;
    @XmlElement(name = "ShipToAccountId")
    protected QueryType shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected QueryType shipToAccountIntegrationId;
    @XmlElement(name = "ShipToAccountLocation")
    protected QueryType shipToAccountLocation;
    @XmlElement(name = "ShipToAddressId")
    protected QueryType shipToAddressId;
    @XmlElement(name = "ShipToAddressIntegrationId")
    protected QueryType shipToAddressIntegrationId;
    @XmlElement(name = "ShipToAddressSiteUseIntegrationId")
    protected QueryType shipToAddressSiteUseIntegrationId;
    @XmlElement(name = "ShipToCity")
    protected QueryType shipToCity;
    @XmlElement(name = "ShipToCityState")
    protected QueryType shipToCityState;
    @XmlElement(name = "ShipToCityStateENU")
    protected QueryType shipToCityStateENU;
    @XmlElement(name = "ShipToCityStateJPN")
    protected QueryType shipToCityStateJPN;
    @XmlElement(name = "ShipToCityStateZip")
    protected QueryType shipToCityStateZip;
    @XmlElement(name = "ShipToCityStateZipENU")
    protected QueryType shipToCityStateZipENU;
    @XmlElement(name = "ShipToCityStateZipJPN")
    protected QueryType shipToCityStateZipJPN;
    @XmlElement(name = "ShipToContactId")
    protected QueryType shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected QueryType shipToContactIntegrationId;
    @XmlElement(name = "ShipToCountry")
    protected QueryType shipToCountry;
    @XmlElement(name = "ShipToState")
    protected QueryType shipToState;
    @XmlElement(name = "ShipToZip")
    protected QueryType shipToZip;
    @XmlElement(name = "ShipViaId")
    protected QueryType shipViaId;
    @XmlElement(name = "ShopforSelfFlag")
    protected QueryType shopforSelfFlag;
    @XmlElement(name = "SingleSourceFlag")
    protected QueryType singleSourceFlag;
    @XmlElement(name = "SourceInventoryId")
    protected QueryType sourceInventoryId;
    @XmlElement(name = "SourceInventoryLocIntegrationId")
    protected QueryType sourceInventoryLocIntegrationId;
    @XmlElement(name = "SourceInventoryLocation")
    protected QueryType sourceInventoryLocation;
    @XmlElement(name = "SpreadDiscount-AllProducts")
    protected QueryType spreadDiscountAllProducts;
    @XmlElement(name = "SpreadDiscount-CurrentTotal")
    protected QueryType spreadDiscountCurrentTotal;
    @XmlElement(name = "SpreadDiscount-ProductType")
    protected QueryType spreadDiscountProductType;
    @XmlElement(name = "SpreadDiscount-SpreadTotal")
    protected QueryType spreadDiscountSpreadTotal;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "SubmitDate")
    protected QueryType submitDate;
    @XmlElement(name = "Tax")
    protected QueryType tax;
    @XmlElement(name = "TaxAmount")
    protected QueryType taxAmount;
    @XmlElement(name = "TaxAmountFromRate")
    protected QueryType taxAmountFromRate;
    @XmlElement(name = "TaxExempt")
    protected QueryType taxExempt;
    @XmlElement(name = "TaxExemptNumber")
    protected QueryType taxExemptNumber;
    @XmlElement(name = "TaxExemptReason")
    protected QueryType taxExemptReason;
    @XmlElement(name = "TaxRate")
    protected QueryType taxRate;
    @XmlElement(name = "TaxRateFromAmount")
    protected QueryType taxRateFromAmount;
    @XmlElement(name = "ThirdPartyTaxAmount")
    protected QueryType thirdPartyTaxAmount;
    @XmlElement(name = "TotalCurrentPrice")
    protected QueryType totalCurrentPrice;
    @XmlElement(name = "TotalFieldsActive")
    protected QueryType totalFieldsActive;
    @XmlElement(name = "TotalListPrice")
    protected QueryType totalListPrice;
    @XmlElement(name = "TotalVolume")
    protected QueryType totalVolume;
    @XmlElement(name = "TotalVolumeUoM")
    protected QueryType totalVolumeUoM;
    @XmlElement(name = "TotalWeight")
    protected QueryType totalWeight;
    @XmlElement(name = "TotalWeightUoM")
    protected QueryType totalWeightUoM;
    @XmlElement(name = "TrainingTotal")
    protected QueryType trainingTotal;
    @XmlElement(name = "UltimateParentId")
    protected QueryType ultimateParentId;
    @XmlElement(name = "UpdatedByLogin")
    protected QueryType updatedByLogin;
    @XmlElement(name = "UserType")
    protected QueryType userType;
    @XmlElement(name = "UserTypeB-to-B")
    protected QueryType userTypeBToB;
    @XmlElement(name = "WebphoneOrderNumber")
    protected QueryType webphoneOrderNumber;
    @XmlElement(name = "ListOfPayments")
    protected ListOfPaymentsQuery listOfPayments;
    @XmlElement(name = "ListOfOrderEntry-LineItems")
    protected ListOfOrderEntryLineItemsQuery listOfOrderEntryLineItems;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

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
     * Gets the value of the mtoPaymentRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOPaymentRefNumber() {
        return mtoPaymentRefNumber;
    }

    /**
     * Sets the value of the mtoPaymentRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOPaymentRefNumber(QueryType value) {
        this.mtoPaymentRefNumber = value;
    }

    /**
     * Gets the value of the mtoOrderOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOOrderOfficeId() {
        return mtoOrderOfficeId;
    }

    /**
     * Sets the value of the mtoOrderOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOOrderOfficeId(QueryType value) {
        this.mtoOrderOfficeId = value;
    }

    /**
     * Gets the value of the mtoBusinessDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOBusinessDate() {
        return mtoBusinessDate;
    }

    /**
     * Sets the value of the mtoBusinessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOBusinessDate(QueryType value) {
        this.mtoBusinessDate = value;
    }

    /**
     * Gets the value of the mtoApplicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOApplicationStatus() {
        return mtoApplicationStatus;
    }

    /**
     * Sets the value of the mtoApplicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOApplicationStatus(QueryType value) {
        this.mtoApplicationStatus = value;
    }

    /**
     * Gets the value of the mtoAccountSCBalance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOAccountSCBalance() {
        return mtoAccountSCBalance;
    }

    /**
     * Sets the value of the mtoAccountSCBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOAccountSCBalance(QueryType value) {
        this.mtoAccountSCBalance = value;
    }

    /**
     * Gets the value of the mtoAccountPrepaidBalance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMTOAccountPrepaidBalance() {
        return mtoAccountPrepaidBalance;
    }

    /**
     * Sets the value of the mtoAccountPrepaidBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMTOAccountPrepaidBalance(QueryType value) {
        this.mtoAccountPrepaidBalance = value;
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
     * Gets the value of the atpMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getATPMessage() {
        return atpMessage;
    }

    /**
     * Sets the value of the atpMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setATPMessage(QueryType value) {
        this.atpMessage = value;
    }

    /**
     * Gets the value of the atpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getATPStatus() {
        return atpStatus;
    }

    /**
     * Sets the value of the atpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setATPStatus(QueryType value) {
        this.atpStatus = value;
    }

    /**
     * Gets the value of the atpStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getATPStatusAsOfDate() {
        return atpStatusAsOfDate;
    }

    /**
     * Sets the value of the atpStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setATPStatusAsOfDate(QueryType value) {
        this.atpStatusAsOfDate = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccount(QueryType value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountAddressId() {
        return accountAddressId;
    }

    /**
     * Sets the value of the accountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountAddressId(QueryType value) {
        this.accountAddressId = value;
    }

    /**
     * Gets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountContractedProductsOnlyFlag() {
        return accountContractedProductsOnlyFlag;
    }

    /**
     * Sets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountContractedProductsOnlyFlag(QueryType value) {
        this.accountContractedProductsOnlyFlag = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountId(QueryType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountIntegrationId(QueryType value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the accountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountLocation() {
        return accountLocation;
    }

    /**
     * Sets the value of the accountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountLocation(QueryType value) {
        this.accountLocation = value;
    }

    /**
     * Gets the value of the accountOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountOrderNumber() {
        return accountOrderNumber;
    }

    /**
     * Sets the value of the accountOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountOrderNumber(QueryType value) {
        this.accountOrderNumber = value;
    }

    /**
     * Gets the value of the accountOrderNumberOLD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountOrderNumberOLD() {
        return accountOrderNumberOLD;
    }

    /**
     * Sets the value of the accountOrderNumberOLD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountOrderNumberOLD(QueryType value) {
        this.accountOrderNumberOLD = value;
    }

    /**
     * Gets the value of the accountPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPriceListId() {
        return accountPriceListId;
    }

    /**
     * Sets the value of the accountPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPriceListId(QueryType value) {
        this.accountPriceListId = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountType(QueryType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActive(QueryType value) {
        this.active = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAge(QueryType value) {
        this.age = value;
    }

    /**
     * Gets the value of the agreementId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAgreementId() {
        return agreementId;
    }

    /**
     * Sets the value of the agreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAgreementId(QueryType value) {
        this.agreementId = value;
    }

    /**
     * Gets the value of the agreementIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAgreementIntegrationId() {
        return agreementIntegrationId;
    }

    /**
     * Sets the value of the agreementIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAgreementIntegrationId(QueryType value) {
        this.agreementIntegrationId = value;
    }

    /**
     * Gets the value of the agreementName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAgreementName() {
        return agreementName;
    }

    /**
     * Sets the value of the agreementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAgreementName(QueryType value) {
        this.agreementName = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApproved(QueryType value) {
        this.approved = value;
    }

    /**
     * Gets the value of the approvedByEmpLogin property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApprovedByEmpLogin() {
        return approvedByEmpLogin;
    }

    /**
     * Sets the value of the approvedByEmpLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApprovedByEmpLogin(QueryType value) {
        this.approvedByEmpLogin = value;
    }

    /**
     * Gets the value of the approvedByEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApprovedByEmployeeId() {
        return approvedByEmployeeId;
    }

    /**
     * Sets the value of the approvedByEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApprovedByEmployeeId(QueryType value) {
        this.approvedByEmployeeId = value;
    }

    /**
     * Gets the value of the approvedByPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApprovedByPositionId() {
        return approvedByPositionId;
    }

    /**
     * Sets the value of the approvedByPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApprovedByPositionId(QueryType value) {
        this.approvedByPositionId = value;
    }

    /**
     * Gets the value of the approvedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApprovedByDate() {
        return approvedByDate;
    }

    /**
     * Sets the value of the approvedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApprovedByDate(QueryType value) {
        this.approvedByDate = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAsOfDate(QueryType value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the autoReceiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAutoReceiveFlag() {
        return autoReceiveFlag;
    }

    /**
     * Sets the value of the autoReceiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAutoReceiveFlag(QueryType value) {
        this.autoReceiveFlag = value;
    }

    /**
     * Gets the value of the availableDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAvailableDate(QueryType value) {
        this.availableDate = value;
    }

    /**
     * Gets the value of the backOfficeErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBackOfficeErrorText() {
        return backOfficeErrorText;
    }

    /**
     * Sets the value of the backOfficeErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBackOfficeErrorText(QueryType value) {
        this.backOfficeErrorText = value;
    }

    /**
     * Gets the value of the backOfficeOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBackOfficeOrderNumber() {
        return backOfficeOrderNumber;
    }

    /**
     * Sets the value of the backOfficeOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBackOfficeOrderNumber(QueryType value) {
        this.backOfficeOrderNumber = value;
    }

    /**
     * Gets the value of the backOfficeProcessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBackOfficeProcessStatus() {
        return backOfficeProcessStatus;
    }

    /**
     * Sets the value of the backOfficeProcessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBackOfficeProcessStatus(QueryType value) {
        this.backOfficeProcessStatus = value;
    }

    /**
     * Gets the value of the billToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToCounty() {
        return billToCounty;
    }

    /**
     * Sets the value of the billToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToCounty(QueryType value) {
        this.billToCounty = value;
    }

    /**
     * Gets the value of the billToProvince property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToProvince() {
        return billToProvince;
    }

    /**
     * Sets the value of the billToProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToProvince(QueryType value) {
        this.billToProvince = value;
    }

    /**
     * Gets the value of the billToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccount() {
        return billToAccount;
    }

    /**
     * Sets the value of the billToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccount(QueryType value) {
        this.billToAccount = value;
    }

    /**
     * Gets the value of the billToAccountConstrained property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccountConstrained() {
        return billToAccountConstrained;
    }

    /**
     * Sets the value of the billToAccountConstrained property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccountConstrained(QueryType value) {
        this.billToAccountConstrained = value;
    }

    /**
     * Gets the value of the billToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccountId() {
        return billToAccountId;
    }

    /**
     * Sets the value of the billToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccountId(QueryType value) {
        this.billToAccountId = value;
    }

    /**
     * Gets the value of the billToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccountIntegrationId() {
        return billToAccountIntegrationId;
    }

    /**
     * Sets the value of the billToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccountIntegrationId(QueryType value) {
        this.billToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the billToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccountLocation() {
        return billToAccountLocation;
    }

    /**
     * Sets the value of the billToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccountLocation(QueryType value) {
        this.billToAccountLocation = value;
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
     * Gets the value of the billToAddressSiteUseIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAddressSiteUseIntegrationId() {
        return billToAddressSiteUseIntegrationId;
    }

    /**
     * Sets the value of the billToAddressSiteUseIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAddressSiteUseIntegrationId(QueryType value) {
        this.billToAddressSiteUseIntegrationId = value;
    }

    /**
     * Gets the value of the billToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToCityState() {
        return billToCityState;
    }

    /**
     * Sets the value of the billToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToCityState(QueryType value) {
        this.billToCityState = value;
    }

    /**
     * Gets the value of the billToCityStateENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToCityStateENU() {
        return billToCityStateENU;
    }

    /**
     * Sets the value of the billToCityStateENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToCityStateENU(QueryType value) {
        this.billToCityStateENU = value;
    }

    /**
     * Gets the value of the billToCityStateJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToCityStateJPN() {
        return billToCityStateJPN;
    }

    /**
     * Sets the value of the billToCityStateJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToCityStateJPN(QueryType value) {
        this.billToCityStateJPN = value;
    }

    /**
     * Gets the value of the billToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToCityStateZip() {
        return billToCityStateZip;
    }

    /**
     * Sets the value of the billToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToCityStateZip(QueryType value) {
        this.billToCityStateZip = value;
    }

    /**
     * Gets the value of the billToCityStateZipENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToCityStateZipENU() {
        return billToCityStateZipENU;
    }

    /**
     * Sets the value of the billToCityStateZipENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToCityStateZipENU(QueryType value) {
        this.billToCityStateZipENU = value;
    }

    /**
     * Gets the value of the billToCityStateZipJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToCityStateZipJPN() {
        return billToCityStateZipJPN;
    }

    /**
     * Sets the value of the billToCityStateZipJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToCityStateZipJPN(QueryType value) {
        this.billToCityStateZipJPN = value;
    }

    /**
     * Gets the value of the billToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToContactId() {
        return billToContactId;
    }

    /**
     * Sets the value of the billToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToContactId(QueryType value) {
        this.billToContactId = value;
    }

    /**
     * Gets the value of the billToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToContactIntegrationId() {
        return billToContactIntegrationId;
    }

    /**
     * Sets the value of the billToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToContactIntegrationId(QueryType value) {
        this.billToContactIntegrationId = value;
    }

    /**
     * Gets the value of the billToDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToDUNSNumber() {
        return billToDUNSNumber;
    }

    /**
     * Sets the value of the billToDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToDUNSNumber(QueryType value) {
        this.billToDUNSNumber = value;
    }

    /**
     * Gets the value of the billToVATRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToVATRegistrationNumber() {
        return billToVATRegistrationNumber;
    }

    /**
     * Sets the value of the billToVATRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToVATRegistrationNumber(QueryType value) {
        this.billToVATRegistrationNumber = value;
    }

    /**
     * Gets the value of the billableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillableFlag() {
        return billableFlag;
    }

    /**
     * Sets the value of the billableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillableFlag(QueryType value) {
        this.billableFlag = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccount(QueryType value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountId(QueryType value) {
        this.billingAccountId = value;
    }

    /**
     * Gets the value of the billingBlock property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingBlock() {
        return billingBlock;
    }

    /**
     * Sets the value of the billingBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingBlock(QueryType value) {
        this.billingBlock = value;
    }

    /**
     * Gets the value of the byAge property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getByAge() {
        return byAge;
    }

    /**
     * Sets the value of the byAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setByAge(QueryType value) {
        this.byAge = value;
    }

    /**
     * Gets the value of the calculatedCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedCustomerId() {
        return calculatedCustomerId;
    }

    /**
     * Sets the value of the calculatedCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedCustomerId(QueryType value) {
        this.calculatedCustomerId = value;
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
     * Gets the value of the campConId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCampConId() {
        return campConId;
    }

    /**
     * Sets the value of the campConId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCampConId(QueryType value) {
        this.campConId = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCampaignId(QueryType value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCampaignIntegrationId() {
        return campaignIntegrationId;
    }

    /**
     * Sets the value of the campaignIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCampaignIntegrationId(QueryType value) {
        this.campaignIntegrationId = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCampaignName(QueryType value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrierPriority(QueryType value) {
        this.carrierPriority = value;
    }

    /**
     * Gets the value of the carrierType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrierType() {
        return carrierType;
    }

    /**
     * Sets the value of the carrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrierType(QueryType value) {
        this.carrierType = value;
    }

    /**
     * Gets the value of the changedSinceLastExportToTransactionWorkbook property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChangedSinceLastExportToTransactionWorkbook() {
        return changedSinceLastExportToTransactionWorkbook;
    }

    /**
     * Sets the value of the changedSinceLastExportToTransactionWorkbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChangedSinceLastExportToTransactionWorkbook(QueryType value) {
        this.changedSinceLastExportToTransactionWorkbook = value;
    }

    /**
     * Gets the value of the chargedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChargedFlag() {
        return chargedFlag;
    }

    /**
     * Sets the value of the chargedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChargedFlag(QueryType value) {
        this.chargedFlag = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCheck(QueryType value) {
        this.check = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setComments(QueryType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCompoundProductNumber(QueryType value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the contactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Sets the value of the contactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactEmailAddress(QueryType value) {
        this.contactEmailAddress = value;
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
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactId(QueryType value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactIntegrationId() {
        return contactIntegrationId;
    }

    /**
     * Sets the value of the contactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactIntegrationId(QueryType value) {
        this.contactIntegrationId = value;
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
     * Gets the value of the contactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactWorkPhone() {
        return contactWorkPhone;
    }

    /**
     * Sets the value of the contactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactWorkPhone(QueryType value) {
        this.contactWorkPhone = value;
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
     * Gets the value of the creditAssignmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditAssignmentDescription() {
        return creditAssignmentDescription;
    }

    /**
     * Sets the value of the creditAssignmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditAssignmentDescription(QueryType value) {
        this.creditAssignmentDescription = value;
    }

    /**
     * Gets the value of the creditAssignmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditAssignmentStatus() {
        return creditAssignmentStatus;
    }

    /**
     * Sets the value of the creditAssignmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditAssignmentStatus(QueryType value) {
        this.creditAssignmentStatus = value;
    }

    /**
     * Gets the value of the creditCardApprovalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardApprovalCode() {
        return creditCardApprovalCode;
    }

    /**
     * Sets the value of the creditCardApprovalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardApprovalCode(QueryType value) {
        this.creditCardApprovalCode = value;
    }

    /**
     * Gets the value of the creditCardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    /**
     * Sets the value of the creditCardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardExpirationDate(QueryType value) {
        this.creditCardExpirationDate = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardExpirationMonth(QueryType value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardExpirationYear(QueryType value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the creditCardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardHolder() {
        return creditCardHolder;
    }

    /**
     * Sets the value of the creditCardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardHolder(QueryType value) {
        this.creditCardHolder = value;
    }

    /**
     * Gets the value of the creditCardMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardMerchantId() {
        return creditCardMerchantId;
    }

    /**
     * Sets the value of the creditCardMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardMerchantId(QueryType value) {
        this.creditCardMerchantId = value;
    }

    /**
     * Gets the value of the creditCardName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardName() {
        return creditCardName;
    }

    /**
     * Sets the value of the creditCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardName(QueryType value) {
        this.creditCardName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardNumber(QueryType value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardNumberDisplay() {
        return creditCardNumberDisplay;
    }

    /**
     * Sets the value of the creditCardNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardNumberDisplay(QueryType value) {
        this.creditCardNumberDisplay = value;
    }

    /**
     * Gets the value of the creditCardNumberReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardNumberReadOnly() {
        return creditCardNumberReadOnly;
    }

    /**
     * Sets the value of the creditCardNumberReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardNumberReadOnly(QueryType value) {
        this.creditCardNumberReadOnly = value;
    }

    /**
     * Gets the value of the creditCardNumberKeyIndex property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardNumberKeyIndex() {
        return creditCardNumberKeyIndex;
    }

    /**
     * Sets the value of the creditCardNumberKeyIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardNumberKeyIndex(QueryType value) {
        this.creditCardNumberKeyIndex = value;
    }

    /**
     * Gets the value of the creditCardTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardTransactionAmount() {
        return creditCardTransactionAmount;
    }

    /**
     * Sets the value of the creditCardTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardTransactionAmount(QueryType value) {
        this.creditCardTransactionAmount = value;
    }

    /**
     * Gets the value of the creditCardTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardTransactionID() {
        return creditCardTransactionID;
    }

    /**
     * Sets the value of the creditCardTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardTransactionID(QueryType value) {
        this.creditCardTransactionID = value;
    }

    /**
     * Gets the value of the creditCardTransactionResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardTransactionResponseCode() {
        return creditCardTransactionResponseCode;
    }

    /**
     * Sets the value of the creditCardTransactionResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardTransactionResponseCode(QueryType value) {
        this.creditCardTransactionResponseCode = value;
    }

    /**
     * Gets the value of the creditCardTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardTransactionStatus() {
        return creditCardTransactionStatus;
    }

    /**
     * Sets the value of the creditCardTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardTransactionStatus(QueryType value) {
        this.creditCardTransactionStatus = value;
    }

    /**
     * Gets the value of the creditCardTransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardTransactionTime() {
        return creditCardTransactionTime;
    }

    /**
     * Sets the value of the creditCardTransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardTransactionTime(QueryType value) {
        this.creditCardTransactionTime = value;
    }

    /**
     * Gets the value of the creditCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCheckMessage() {
        return creditCheckMessage;
    }

    /**
     * Sets the value of the creditCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCheckMessage(QueryType value) {
        this.creditCheckMessage = value;
    }

    /**
     * Gets the value of the creditCheckSkipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCheckSkipFlag() {
        return creditCheckSkipFlag;
    }

    /**
     * Sets the value of the creditCheckSkipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCheckSkipFlag(QueryType value) {
        this.creditCheckSkipFlag = value;
    }

    /**
     * Gets the value of the creditCheckSkipThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCheckSkipThreshold() {
        return creditCheckSkipThreshold;
    }

    /**
     * Sets the value of the creditCheckSkipThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCheckSkipThreshold(QueryType value) {
        this.creditCheckSkipThreshold = value;
    }

    /**
     * Gets the value of the creditCheckSkipThresholdCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCheckSkipThresholdCurrencyCode() {
        return creditCheckSkipThresholdCurrencyCode;
    }

    /**
     * Sets the value of the creditCheckSkipThresholdCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCheckSkipThresholdCurrencyCode(QueryType value) {
        this.creditCheckSkipThresholdCurrencyCode = value;
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
     * Gets the value of the creditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditStatus() {
        return creditStatus;
    }

    /**
     * Sets the value of the creditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditStatus(QueryType value) {
        this.creditStatus = value;
    }

    /**
     * Gets the value of the creditSubmissionTime property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditSubmissionTime() {
        return creditSubmissionTime;
    }

    /**
     * Sets the value of the creditSubmissionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditSubmissionTime(QueryType value) {
        this.creditSubmissionTime = value;
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
     * Gets the value of the currentOrderShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToCity() {
        return currentOrderShipToCity;
    }

    /**
     * Sets the value of the currentOrderShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToCity(QueryType value) {
        this.currentOrderShipToCity = value;
    }

    /**
     * Gets the value of the currentOrderShipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToCityState() {
        return currentOrderShipToCityState;
    }

    /**
     * Sets the value of the currentOrderShipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToCityState(QueryType value) {
        this.currentOrderShipToCityState = value;
    }

    /**
     * Gets the value of the currentOrderShipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToCityStateZip() {
        return currentOrderShipToCityStateZip;
    }

    /**
     * Sets the value of the currentOrderShipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToCityStateZip(QueryType value) {
        this.currentOrderShipToCityStateZip = value;
    }

    /**
     * Gets the value of the currentOrderShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToCountry() {
        return currentOrderShipToCountry;
    }

    /**
     * Sets the value of the currentOrderShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToCountry(QueryType value) {
        this.currentOrderShipToCountry = value;
    }

    /**
     * Gets the value of the currentOrderShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToPostalCode() {
        return currentOrderShipToPostalCode;
    }

    /**
     * Sets the value of the currentOrderShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToPostalCode(QueryType value) {
        this.currentOrderShipToPostalCode = value;
    }

    /**
     * Gets the value of the currentOrderShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToState() {
        return currentOrderShipToState;
    }

    /**
     * Sets the value of the currentOrderShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToState(QueryType value) {
        this.currentOrderShipToState = value;
    }

    /**
     * Gets the value of the currentOrderShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToStreetAddress() {
        return currentOrderShipToStreetAddress;
    }

    /**
     * Sets the value of the currentOrderShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToStreetAddress(QueryType value) {
        this.currentOrderShipToStreetAddress = value;
    }

    /**
     * Gets the value of the currentOrderShipToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderShipToStreetAddress2() {
        return currentOrderShipToStreetAddress2;
    }

    /**
     * Sets the value of the currentOrderShipToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderShipToStreetAddress2(QueryType value) {
        this.currentOrderShipToStreetAddress2 = value;
    }

    /**
     * Gets the value of the currentOrderTotalBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderTotalBasePrice() {
        return currentOrderTotalBasePrice;
    }

    /**
     * Sets the value of the currentOrderTotalBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderTotalBasePrice(QueryType value) {
        this.currentOrderTotalBasePrice = value;
    }

    /**
     * Gets the value of the currentOrderTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderTotalDiscount() {
        return currentOrderTotalDiscount;
    }

    /**
     * Sets the value of the currentOrderTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderTotalDiscount(QueryType value) {
        this.currentOrderTotalDiscount = value;
    }

    /**
     * Gets the value of the currentOrderTotalItemDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderTotalItemDiscount() {
        return currentOrderTotalItemDiscount;
    }

    /**
     * Sets the value of the currentOrderTotalItemDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderTotalItemDiscount(QueryType value) {
        this.currentOrderTotalItemDiscount = value;
    }

    /**
     * Gets the value of the currentOrderTotalNetDiscountPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderTotalNetDiscountPrice() {
        return currentOrderTotalNetDiscountPrice;
    }

    /**
     * Sets the value of the currentOrderTotalNetDiscountPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderTotalNetDiscountPrice(QueryType value) {
        this.currentOrderTotalNetDiscountPrice = value;
    }

    /**
     * Gets the value of the currentOrderTotalNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrentOrderTotalNetPrice() {
        return currentOrderTotalNetPrice;
    }

    /**
     * Sets the value of the currentOrderTotalNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrentOrderTotalNetPrice(QueryType value) {
        this.currentOrderTotalNetPrice = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCustomerId(QueryType value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the deliveryBlock property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDeliveryBlock() {
        return deliveryBlock;
    }

    /**
     * Sets the value of the deliveryBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDeliveryBlock(QueryType value) {
        this.deliveryBlock = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDeliveryStatus(QueryType value) {
        this.deliveryStatus = value;
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
     * Gets the value of the destinationInventoryId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDestinationInventoryId() {
        return destinationInventoryId;
    }

    /**
     * Sets the value of the destinationInventoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDestinationInventoryId(QueryType value) {
        this.destinationInventoryId = value;
    }

    /**
     * Gets the value of the destinationInventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDestinationInventoryLocation() {
        return destinationInventoryLocation;
    }

    /**
     * Sets the value of the destinationInventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDestinationInventoryLocation(QueryType value) {
        this.destinationInventoryLocation = value;
    }

    /**
     * Gets the value of the destinationInventoryLocationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDestinationInventoryLocationIntegrationId() {
        return destinationInventoryLocationIntegrationId;
    }

    /**
     * Sets the value of the destinationInventoryLocationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDestinationInventoryLocationIntegrationId(QueryType value) {
        this.destinationInventoryLocationIntegrationId = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscount(QueryType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountAmount(QueryType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountAmountMRC property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountAmountMRC() {
        return discountAmountMRC;
    }

    /**
     * Sets the value of the discountAmountMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountAmountMRC(QueryType value) {
        this.discountAmountMRC = value;
    }

    /**
     * Gets the value of the discountPercentMRC property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountPercentMRC() {
        return discountPercentMRC;
    }

    /**
     * Sets the value of the discountPercentMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountPercentMRC(QueryType value) {
        this.discountPercentMRC = value;
    }

    /**
     * Gets the value of the discountReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountReason() {
        return discountReason;
    }

    /**
     * Sets the value of the discountReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountReason(QueryType value) {
        this.discountReason = value;
    }

    /**
     * Gets the value of the eaiSyncDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEAISyncDate() {
        return eaiSyncDate;
    }

    /**
     * Sets the value of the eaiSyncDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEAISyncDate(QueryType value) {
        this.eaiSyncDate = value;
    }

    /**
     * Gets the value of the eligibilityCompatibilityProcedureName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEligibilityCompatibilityProcedureName() {
        return eligibilityCompatibilityProcedureName;
    }

    /**
     * Sets the value of the eligibilityCompatibilityProcedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEligibilityCompatibilityProcedureName(QueryType value) {
        this.eligibilityCompatibilityProcedureName = value;
    }

    /**
     * Gets the value of the entitlementId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEntitlementId() {
        return entitlementId;
    }

    /**
     * Sets the value of the entitlementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEntitlementId(QueryType value) {
        this.entitlementId = value;
    }

    /**
     * Gets the value of the entitlementName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEntitlementName() {
        return entitlementName;
    }

    /**
     * Sets the value of the entitlementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEntitlementName(QueryType value) {
        this.entitlementName = value;
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
     * Gets the value of the exportedOnceToTransactionWorkbook property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExportedOnceToTransactionWorkbook() {
        return exportedOnceToTransactionWorkbook;
    }

    /**
     * Sets the value of the exportedOnceToTransactionWorkbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExportedOnceToTransactionWorkbook(QueryType value) {
        this.exportedOnceToTransactionWorkbook = value;
    }

    /**
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreight(QueryType value) {
        this.freight = value;
    }

    /**
     * Gets the value of the freightAmountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreightAmountCurrencyCode() {
        return freightAmountCurrencyCode;
    }

    /**
     * Sets the value of the freightAmountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreightAmountCurrencyCode(QueryType value) {
        this.freightAmountCurrencyCode = value;
    }

    /**
     * Gets the value of the freightAmountDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreightAmountDate() {
        return freightAmountDate;
    }

    /**
     * Sets the value of the freightAmountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreightAmountDate(QueryType value) {
        this.freightAmountDate = value;
    }

    /**
     * Gets the value of the freightTerms property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreightTerms() {
        return freightTerms;
    }

    /**
     * Sets the value of the freightTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreightTerms(QueryType value) {
        this.freightTerms = value;
    }

    /**
     * Gets the value of the freightTermsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreightTermsInfo() {
        return freightTermsInfo;
    }

    /**
     * Sets the value of the freightTermsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreightTermsInfo(QueryType value) {
        this.freightTermsInfo = value;
    }

    /**
     * Gets the value of the freightTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreightTotal() {
        return freightTotal;
    }

    /**
     * Sets the value of the freightTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreightTotal(QueryType value) {
        this.freightTotal = value;
    }

    /**
     * Gets the value of the fulfillLockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFulfillLockFlag() {
        return fulfillLockFlag;
    }

    /**
     * Sets the value of the fulfillLockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFulfillLockFlag(QueryType value) {
        this.fulfillLockFlag = value;
    }

    /**
     * Gets the value of the hierarchyVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHierarchyVersionId() {
        return hierarchyVersionId;
    }

    /**
     * Sets the value of the hierarchyVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHierarchyVersionId(QueryType value) {
        this.hierarchyVersionId = value;
    }

    /**
     * Gets the value of the holdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHoldFlag() {
        return holdFlag;
    }

    /**
     * Sets the value of the holdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHoldFlag(QueryType value) {
        this.holdFlag = value;
    }

    /**
     * Gets the value of the incentiveCompensationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIncentiveCompensationStatus() {
        return incentiveCompensationStatus;
    }

    /**
     * Sets the value of the incentiveCompensationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIncentiveCompensationStatus(QueryType value) {
        this.incentiveCompensationStatus = value;
    }

    /**
     * Gets the value of the incentiveCompensationStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIncentiveCompensationStatusDate() {
        return incentiveCompensationStatusDate;
    }

    /**
     * Sets the value of the incentiveCompensationStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIncentiveCompensationStatusDate(QueryType value) {
        this.incentiveCompensationStatusDate = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId(QueryType value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the internalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInternalTaxAmount() {
        return internalTaxAmount;
    }

    /**
     * Sets the value of the internalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInternalTaxAmount(QueryType value) {
        this.internalTaxAmount = value;
    }

    /**
     * Gets the value of the iseChannelShopForMyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIseChannelShopForMyAccount() {
        return iseChannelShopForMyAccount;
    }

    /**
     * Sets the value of the iseChannelShopForMyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIseChannelShopForMyAccount(QueryType value) {
        this.iseChannelShopForMyAccount = value;
    }

    /**
     * Gets the value of the isAdminMode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsAdminMode() {
        return isAdminMode;
    }

    /**
     * Sets the value of the isAdminMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsAdminMode(QueryType value) {
        this.isAdminMode = value;
    }

    /**
     * Gets the value of the loadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLoadNumber() {
        return loadNumber;
    }

    /**
     * Sets the value of the loadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLoadNumber(QueryType value) {
        this.loadNumber = value;
    }

    /**
     * Gets the value of the mrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMRCTotal() {
        return mrcTotal;
    }

    /**
     * Sets the value of the mrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMRCTotal(QueryType value) {
        this.mrcTotal = value;
    }

    /**
     * Gets the value of the maxRevisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMaxRevisionNumber() {
        return maxRevisionNumber;
    }

    /**
     * Sets the value of the maxRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMaxRevisionNumber(QueryType value) {
        this.maxRevisionNumber = value;
    }

    /**
     * Gets the value of the mediaId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMediaId() {
        return mediaId;
    }

    /**
     * Sets the value of the mediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMediaId(QueryType value) {
        this.mediaId = value;
    }

    /**
     * Gets the value of the movedToTransactionWorkbook property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMovedToTransactionWorkbook() {
        return movedToTransactionWorkbook;
    }

    /**
     * Sets the value of the movedToTransactionWorkbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMovedToTransactionWorkbook(QueryType value) {
        this.movedToTransactionWorkbook = value;
    }

    /**
     * Gets the value of the nrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCTotal() {
        return nrcTotal;
    }

    /**
     * Sets the value of the nrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCTotal(QueryType value) {
        this.nrcTotal = value;
    }

    /**
     * Gets the value of the numberofShipments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNumberofShipments() {
        return numberofShipments;
    }

    /**
     * Sets the value of the numberofShipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNumberofShipments(QueryType value) {
        this.numberofShipments = value;
    }

    /**
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOpportunity(QueryType value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOptyId(QueryType value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the optyIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOptyIntegrationId() {
        return optyIntegrationId;
    }

    /**
     * Sets the value of the optyIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOptyIntegrationId(QueryType value) {
        this.optyIntegrationId = value;
    }

    /**
     * Gets the value of the optyPrimaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOptyPrimaryPositionId() {
        return optyPrimaryPositionId;
    }

    /**
     * Sets the value of the optyPrimaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOptyPrimaryPositionId(QueryType value) {
        this.optyPrimaryPositionId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderDate(QueryType value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderItemQuantity() {
        return orderItemQuantity;
    }

    /**
     * Sets the value of the orderItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderItemQuantity(QueryType value) {
        this.orderItemQuantity = value;
    }

    /**
     * Gets the value of the orderLateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderLateFlag() {
        return orderLateFlag;
    }

    /**
     * Sets the value of the orderLateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderLateFlag(QueryType value) {
        this.orderLateFlag = value;
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
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderPriority(QueryType value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderTotal(QueryType value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderType(QueryType value) {
        this.orderType = value;
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
     * Gets the value of the orderTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderTypeId() {
        return orderTypeId;
    }

    /**
     * Sets the value of the orderTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderTypeId(QueryType value) {
        this.orderTypeId = value;
    }

    /**
     * Gets the value of the orderTypeLIC property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderTypeLIC() {
        return orderTypeLIC;
    }

    /**
     * Sets the value of the orderTypeLIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderTypeLIC(QueryType value) {
        this.orderTypeLIC = value;
    }

    /**
     * Gets the value of the organizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganizationIntegrationId() {
        return organizationIntegrationId;
    }

    /**
     * Sets the value of the organizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganizationIntegrationId(QueryType value) {
        this.organizationIntegrationId = value;
    }

    /**
     * Gets the value of the overrideOwnerinReorderProcess property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOverrideOwnerinReorderProcess() {
        return overrideOwnerinReorderProcess;
    }

    /**
     * Sets the value of the overrideOwnerinReorderProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOverrideOwnerinReorderProcess(QueryType value) {
        this.overrideOwnerinReorderProcess = value;
    }

    /**
     * Gets the value of the poAutoApproveLimit property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPOAutoApproveLimit() {
        return poAutoApproveLimit;
    }

    /**
     * Sets the value of the poAutoApproveLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPOAutoApproveLimit(QueryType value) {
        this.poAutoApproveLimit = value;
    }

    /**
     * Gets the value of the poEditable property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPOEditable() {
        return poEditable;
    }

    /**
     * Sets the value of the poEditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPOEditable(QueryType value) {
        this.poEditable = value;
    }

    /**
     * Gets the value of the poEditableStatus1 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPOEditableStatus1() {
        return poEditableStatus1;
    }

    /**
     * Sets the value of the poEditableStatus1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPOEditableStatus1(QueryType value) {
        this.poEditableStatus1 = value;
    }

    /**
     * Gets the value of the poEditableStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPOEditableStatus2() {
        return poEditableStatus2;
    }

    /**
     * Sets the value of the poEditableStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPOEditableStatus2(QueryType value) {
        this.poEditableStatus2 = value;
    }

    /**
     * Gets the value of the parentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentOrderId() {
        return parentOrderId;
    }

    /**
     * Sets the value of the parentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentOrderId(QueryType value) {
        this.parentOrderId = value;
    }

    /**
     * Gets the value of the partialShip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartialShip() {
        return partialShip;
    }

    /**
     * Sets the value of the partialShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartialShip(QueryType value) {
        this.partialShip = value;
    }

    /**
     * Gets the value of the payToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToAccount() {
        return payToAccount;
    }

    /**
     * Sets the value of the payToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToAccount(QueryType value) {
        this.payToAccount = value;
    }

    /**
     * Gets the value of the payToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToAccountId() {
        return payToAccountId;
    }

    /**
     * Sets the value of the payToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToAccountId(QueryType value) {
        this.payToAccountId = value;
    }

    /**
     * Gets the value of the payToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToAccountIntegrationId() {
        return payToAccountIntegrationId;
    }

    /**
     * Sets the value of the payToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToAccountIntegrationId(QueryType value) {
        this.payToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the payToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToAccountLocation() {
        return payToAccountLocation;
    }

    /**
     * Sets the value of the payToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToAccountLocation(QueryType value) {
        this.payToAccountLocation = value;
    }

    /**
     * Gets the value of the payToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToAddressId() {
        return payToAddressId;
    }

    /**
     * Sets the value of the payToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToAddressId(QueryType value) {
        this.payToAddressId = value;
    }

    /**
     * Gets the value of the payToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToAddressIntegrationId() {
        return payToAddressIntegrationId;
    }

    /**
     * Sets the value of the payToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToAddressIntegrationId(QueryType value) {
        this.payToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the payToContactFirstLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToContactFirstLastName() {
        return payToContactFirstLastName;
    }

    /**
     * Sets the value of the payToContactFirstLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToContactFirstLastName(QueryType value) {
        this.payToContactFirstLastName = value;
    }

    /**
     * Gets the value of the payToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToContactId() {
        return payToContactId;
    }

    /**
     * Sets the value of the payToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToContactId(QueryType value) {
        this.payToContactId = value;
    }

    /**
     * Gets the value of the payToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToContactIntegrationId() {
        return payToContactIntegrationId;
    }

    /**
     * Sets the value of the payToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToContactIntegrationId(QueryType value) {
        this.payToContactIntegrationId = value;
    }

    /**
     * Gets the value of the payToContactLastFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToContactLastFirstName() {
        return payToContactLastFirstName;
    }

    /**
     * Sets the value of the payToContactLastFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToContactLastFirstName(QueryType value) {
        this.payToContactLastFirstName = value;
    }

    /**
     * Gets the value of the payToContactName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayToContactName() {
        return payToContactName;
    }

    /**
     * Sets the value of the payToContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayToContactName(QueryType value) {
        this.payToContactName = value;
    }

    /**
     * Gets the value of the payerAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPayerAccountIntegrationId() {
        return payerAccountIntegrationId;
    }

    /**
     * Sets the value of the payerAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPayerAccountIntegrationId(QueryType value) {
        this.payerAccountIntegrationId = value;
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
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentTerm(QueryType value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the paymentTermId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentTermId() {
        return paymentTermId;
    }

    /**
     * Sets the value of the paymentTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentTermId(QueryType value) {
        this.paymentTermId = value;
    }

    /**
     * Gets the value of the paymentTermIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentTermIntegrationId() {
        return paymentTermIntegrationId;
    }

    /**
     * Sets the value of the paymentTermIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentTermIntegrationId(QueryType value) {
        this.paymentTermIntegrationId = value;
    }

    /**
     * Gets the value of the personalBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToAddressId() {
        return personalBillToAddressId;
    }

    /**
     * Sets the value of the personalBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToAddressId(QueryType value) {
        this.personalBillToAddressId = value;
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
     * Gets the value of the personalShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToAddressId() {
        return personalShipToAddressId;
    }

    /**
     * Sets the value of the personalShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToAddressId(QueryType value) {
        this.personalShipToAddressId = value;
    }

    /**
     * Gets the value of the personalShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCity() {
        return personalShipToCity;
    }

    /**
     * Sets the value of the personalShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCity(QueryType value) {
        this.personalShipToCity = value;
    }

    /**
     * Gets the value of the personalShipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCityState() {
        return personalShipToCityState;
    }

    /**
     * Sets the value of the personalShipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCityState(QueryType value) {
        this.personalShipToCityState = value;
    }

    /**
     * Gets the value of the personalShipToCityStateENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCityStateENU() {
        return personalShipToCityStateENU;
    }

    /**
     * Sets the value of the personalShipToCityStateENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCityStateENU(QueryType value) {
        this.personalShipToCityStateENU = value;
    }

    /**
     * Gets the value of the personalShipToCityStateJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCityStateJPN() {
        return personalShipToCityStateJPN;
    }

    /**
     * Sets the value of the personalShipToCityStateJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCityStateJPN(QueryType value) {
        this.personalShipToCityStateJPN = value;
    }

    /**
     * Gets the value of the personalShipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCityStateZip() {
        return personalShipToCityStateZip;
    }

    /**
     * Sets the value of the personalShipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCityStateZip(QueryType value) {
        this.personalShipToCityStateZip = value;
    }

    /**
     * Gets the value of the personalShipToCityStateZipENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCityStateZipENU() {
        return personalShipToCityStateZipENU;
    }

    /**
     * Sets the value of the personalShipToCityStateZipENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCityStateZipENU(QueryType value) {
        this.personalShipToCityStateZipENU = value;
    }

    /**
     * Gets the value of the personalShipToCityStateZipJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCityStateZipJPN() {
        return personalShipToCityStateZipJPN;
    }

    /**
     * Sets the value of the personalShipToCityStateZipJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCityStateZipJPN(QueryType value) {
        this.personalShipToCityStateZipJPN = value;
    }

    /**
     * Gets the value of the personalShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCountry() {
        return personalShipToCountry;
    }

    /**
     * Sets the value of the personalShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCountry(QueryType value) {
        this.personalShipToCountry = value;
    }

    /**
     * Gets the value of the personalShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToPostalCode() {
        return personalShipToPostalCode;
    }

    /**
     * Sets the value of the personalShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToPostalCode(QueryType value) {
        this.personalShipToPostalCode = value;
    }

    /**
     * Gets the value of the personalShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToState() {
        return personalShipToState;
    }

    /**
     * Sets the value of the personalShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToState(QueryType value) {
        this.personalShipToState = value;
    }

    /**
     * Gets the value of the personalShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToStreetAddress() {
        return personalShipToStreetAddress;
    }

    /**
     * Sets the value of the personalShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToStreetAddress(QueryType value) {
        this.personalShipToStreetAddress = value;
    }

    /**
     * Gets the value of the personalShipToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToStreetAddress2() {
        return personalShipToStreetAddress2;
    }

    /**
     * Sets the value of the personalShipToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToStreetAddress2(QueryType value) {
        this.personalShipToStreetAddress2 = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceList(QueryType value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceListId(QueryType value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the priceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceListIntegrationId() {
        return priceListIntegrationId;
    }

    /**
     * Sets the value of the priceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceListIntegrationId(QueryType value) {
        this.priceListIntegrationId = value;
    }

    /**
     * Gets the value of the priceModelId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceModelId() {
        return priceModelId;
    }

    /**
     * Sets the value of the priceModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceModelId(QueryType value) {
        this.priceModelId = value;
    }

    /**
     * Gets the value of the pricingDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPricingDate() {
        return pricingDate;
    }

    /**
     * Sets the value of the pricingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPricingDate(QueryType value) {
        this.pricingDate = value;
    }

    /**
     * Gets the value of the pricingProcedureName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPricingProcedureName() {
        return pricingProcedureName;
    }

    /**
     * Sets the value of the pricingProcedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPricingProcedureName(QueryType value) {
        this.pricingProcedureName = value;
    }

    /**
     * Gets the value of the primaryBillToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddress() {
        return primaryBillToAddress;
    }

    /**
     * Sets the value of the primaryBillToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddress(QueryType value) {
        this.primaryBillToAddress = value;
    }

    /**
     * Gets the value of the primaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddressId() {
        return primaryBillToAddressId;
    }

    /**
     * Sets the value of the primaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddressId(QueryType value) {
        this.primaryBillToAddressId = value;
    }

    /**
     * Gets the value of the primaryBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToCity() {
        return primaryBillToCity;
    }

    /**
     * Sets the value of the primaryBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToCity(QueryType value) {
        this.primaryBillToCity = value;
    }

    /**
     * Gets the value of the primaryBillToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToContactId() {
        return primaryBillToContactId;
    }

    /**
     * Sets the value of the primaryBillToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToContactId(QueryType value) {
        this.primaryBillToContactId = value;
    }

    /**
     * Gets the value of the primaryBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToCountry() {
        return primaryBillToCountry;
    }

    /**
     * Sets the value of the primaryBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToCountry(QueryType value) {
        this.primaryBillToCountry = value;
    }

    /**
     * Gets the value of the primaryBillToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToFirstName() {
        return primaryBillToFirstName;
    }

    /**
     * Sets the value of the primaryBillToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToFirstName(QueryType value) {
        this.primaryBillToFirstName = value;
    }

    /**
     * Gets the value of the primaryBillToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToLastName() {
        return primaryBillToLastName;
    }

    /**
     * Sets the value of the primaryBillToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToLastName(QueryType value) {
        this.primaryBillToLastName = value;
    }

    /**
     * Gets the value of the primaryBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToPostalCode() {
        return primaryBillToPostalCode;
    }

    /**
     * Sets the value of the primaryBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToPostalCode(QueryType value) {
        this.primaryBillToPostalCode = value;
    }

    /**
     * Gets the value of the primaryBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToState() {
        return primaryBillToState;
    }

    /**
     * Sets the value of the primaryBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToState(QueryType value) {
        this.primaryBillToState = value;
    }

    /**
     * Gets the value of the primaryFulfillInvlocId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryFulfillInvlocId() {
        return primaryFulfillInvlocId;
    }

    /**
     * Sets the value of the primaryFulfillInvlocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryFulfillInvlocId(QueryType value) {
        this.primaryFulfillInvlocId = value;
    }

    /**
     * Gets the value of the primaryOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOfferId() {
        return primaryOfferId;
    }

    /**
     * Sets the value of the primaryOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOfferId(QueryType value) {
        this.primaryOfferId = value;
    }

    /**
     * Gets the value of the primaryOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOfferName() {
        return primaryOfferName;
    }

    /**
     * Sets the value of the primaryOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOfferName(QueryType value) {
        this.primaryOfferName = value;
    }

    /**
     * Gets the value of the primaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOrganization() {
        return primaryOrganization;
    }

    /**
     * Sets the value of the primaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOrganization(QueryType value) {
        this.primaryOrganization = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOrganizationId(QueryType value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPartnerId() {
        return primaryPartnerId;
    }

    /**
     * Sets the value of the primaryPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPartnerId(QueryType value) {
        this.primaryPartnerId = value;
    }

    /**
     * Gets the value of the primaryPayerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPayerAccount() {
        return primaryPayerAccount;
    }

    /**
     * Sets the value of the primaryPayerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPayerAccount(QueryType value) {
        this.primaryPayerAccount = value;
    }

    /**
     * Gets the value of the primaryPayerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPayerAccountId() {
        return primaryPayerAccountId;
    }

    /**
     * Sets the value of the primaryPayerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPayerAccountId(QueryType value) {
        this.primaryPayerAccountId = value;
    }

    /**
     * Gets the value of the primaryPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPaymentAmount() {
        return primaryPaymentAmount;
    }

    /**
     * Sets the value of the primaryPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPaymentAmount(QueryType value) {
        this.primaryPaymentAmount = value;
    }

    /**
     * Gets the value of the primaryPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPaymentId() {
        return primaryPaymentId;
    }

    /**
     * Sets the value of the primaryPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPaymentId(QueryType value) {
        this.primaryPaymentId = value;
    }

    /**
     * Gets the value of the primaryPositionContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPositionContactId() {
        return primaryPositionContactId;
    }

    /**
     * Sets the value of the primaryPositionContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPositionContactId(QueryType value) {
        this.primaryPositionContactId = value;
    }

    /**
     * Gets the value of the primaryPositionContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPositionContactIntegrationId() {
        return primaryPositionContactIntegrationId;
    }

    /**
     * Sets the value of the primaryPositionContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPositionContactIntegrationId(QueryType value) {
        this.primaryPositionContactIntegrationId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPositionId(QueryType value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the primaryShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddress() {
        return primaryShipToAddress;
    }

    /**
     * Sets the value of the primaryShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddress(QueryType value) {
        this.primaryShipToAddress = value;
    }

    /**
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressId(QueryType value) {
        this.primaryShipToAddressId = value;
    }

    /**
     * Gets the value of the primaryShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToCity() {
        return primaryShipToCity;
    }

    /**
     * Sets the value of the primaryShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToCity(QueryType value) {
        this.primaryShipToCity = value;
    }

    /**
     * Gets the value of the primaryShipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToContactId() {
        return primaryShipToContactId;
    }

    /**
     * Sets the value of the primaryShipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToContactId(QueryType value) {
        this.primaryShipToContactId = value;
    }

    /**
     * Gets the value of the primaryShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToCountry() {
        return primaryShipToCountry;
    }

    /**
     * Sets the value of the primaryShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToCountry(QueryType value) {
        this.primaryShipToCountry = value;
    }

    /**
     * Gets the value of the primaryShipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToFirstName() {
        return primaryShipToFirstName;
    }

    /**
     * Sets the value of the primaryShipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToFirstName(QueryType value) {
        this.primaryShipToFirstName = value;
    }

    /**
     * Gets the value of the primaryShipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToLastName() {
        return primaryShipToLastName;
    }

    /**
     * Sets the value of the primaryShipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToLastName(QueryType value) {
        this.primaryShipToLastName = value;
    }

    /**
     * Gets the value of the primaryShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToPostalCode() {
        return primaryShipToPostalCode;
    }

    /**
     * Sets the value of the primaryShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToPostalCode(QueryType value) {
        this.primaryShipToPostalCode = value;
    }

    /**
     * Gets the value of the primaryShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToState() {
        return primaryShipToState;
    }

    /**
     * Sets the value of the primaryShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToState(QueryType value) {
        this.primaryShipToState = value;
    }

    /**
     * Gets the value of the primaryShipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipmentId() {
        return primaryShipmentId;
    }

    /**
     * Sets the value of the primaryShipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipmentId(QueryType value) {
        this.primaryShipmentId = value;
    }

    /**
     * Gets the value of the priorityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriorityStatus() {
        return priorityStatus;
    }

    /**
     * Sets the value of the priorityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriorityStatus(QueryType value) {
        this.priorityStatus = value;
    }

    /**
     * Gets the value of the productTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductTotal() {
        return productTotal;
    }

    /**
     * Sets the value of the productTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductTotal(QueryType value) {
        this.productTotal = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProjectId(QueryType value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProjectIntegrationId() {
        return projectIntegrationId;
    }

    /**
     * Sets the value of the projectIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProjectIntegrationId(QueryType value) {
        this.projectIntegrationId = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProjectName(QueryType value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPromotionId(QueryType value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the prospectId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProspectId() {
        return prospectId;
    }

    /**
     * Sets the value of the prospectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProspectId(QueryType value) {
        this.prospectId = value;
    }

    /**
     * Gets the value of the purchMgrComments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPurchMgrComments() {
        return purchMgrComments;
    }

    /**
     * Sets the value of the purchMgrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPurchMgrComments(QueryType value) {
        this.purchMgrComments = value;
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
     * Gets the value of the quoteIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteIntegrationId() {
        return quoteIntegrationId;
    }

    /**
     * Sets the value of the quoteIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteIntegrationId(QueryType value) {
        this.quoteIntegrationId = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteNumber(QueryType value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRecipientName(QueryType value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRequestedShipDate(QueryType value) {
        this.requestedShipDate = value;
    }

    /**
     * Gets the value of the reserveTime property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReserveTime() {
        return reserveTime;
    }

    /**
     * Sets the value of the reserveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReserveTime(QueryType value) {
        this.reserveTime = value;
    }

    /**
     * Gets the value of the reserveTimeUoM property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReserveTimeUoM() {
        return reserveTimeUoM;
    }

    /**
     * Sets the value of the reserveTimeUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReserveTimeUoM(QueryType value) {
        this.reserveTimeUoM = value;
    }

    /**
     * Gets the value of the returnReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnReason() {
        return returnReason;
    }

    /**
     * Sets the value of the returnReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnReason(QueryType value) {
        this.returnReason = value;
    }

    /**
     * Gets the value of the returnToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToAccount() {
        return returnToAccount;
    }

    /**
     * Sets the value of the returnToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToAccount(QueryType value) {
        this.returnToAccount = value;
    }

    /**
     * Gets the value of the returnToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToAccountId() {
        return returnToAccountId;
    }

    /**
     * Sets the value of the returnToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToAccountId(QueryType value) {
        this.returnToAccountId = value;
    }

    /**
     * Gets the value of the returnToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToAccountIntegrationId() {
        return returnToAccountIntegrationId;
    }

    /**
     * Sets the value of the returnToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToAccountIntegrationId(QueryType value) {
        this.returnToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the returnToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToAccountLocation() {
        return returnToAccountLocation;
    }

    /**
     * Sets the value of the returnToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToAccountLocation(QueryType value) {
        this.returnToAccountLocation = value;
    }

    /**
     * Gets the value of the returnToAddrId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToAddrId() {
        return returnToAddrId;
    }

    /**
     * Sets the value of the returnToAddrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToAddrId(QueryType value) {
        this.returnToAddrId = value;
    }

    /**
     * Gets the value of the returnToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToAddressIntegrationId() {
        return returnToAddressIntegrationId;
    }

    /**
     * Sets the value of the returnToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToAddressIntegrationId(QueryType value) {
        this.returnToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the returnToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToContactId() {
        return returnToContactId;
    }

    /**
     * Sets the value of the returnToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToContactId(QueryType value) {
        this.returnToContactId = value;
    }

    /**
     * Gets the value of the returnToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToContactIntegrationId() {
        return returnToContactIntegrationId;
    }

    /**
     * Sets the value of the returnToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToContactIntegrationId(QueryType value) {
        this.returnToContactIntegrationId = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRevision(QueryType value) {
        this.revision = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputBillToCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputBillToCustomerNumber() {
        return sapCreateOrderOutputBillToCustomerNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputBillToCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputBillToCustomerNumber(QueryType value) {
        this.sapCreateOrderOutputBillToCustomerNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputBillToName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputBillToName() {
        return sapCreateOrderOutputBillToName;
    }

    /**
     * Sets the value of the sapCreateOrderOutputBillToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputBillToName(QueryType value) {
        this.sapCreateOrderOutputBillToName = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputOrderNumber() {
        return sapCreateOrderOutputOrderNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputOrderNumber(QueryType value) {
        this.sapCreateOrderOutputOrderNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputReturnCode() {
        return sapCreateOrderOutputReturnCode;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputReturnCode(QueryType value) {
        this.sapCreateOrderOutputReturnCode = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputReturnMessage() {
        return sapCreateOrderOutputReturnMessage;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputReturnMessage(QueryType value) {
        this.sapCreateOrderOutputReturnMessage = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnMessageFull property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputReturnMessageFull() {
        return sapCreateOrderOutputReturnMessageFull;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnMessageFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputReturnMessageFull(QueryType value) {
        this.sapCreateOrderOutputReturnMessageFull = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputReturnType() {
        return sapCreateOrderOutputReturnType;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputReturnType(QueryType value) {
        this.sapCreateOrderOutputReturnType = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputShipToCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputShipToCustomerNumber() {
        return sapCreateOrderOutputShipToCustomerNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputShipToCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputShipToCustomerNumber(QueryType value) {
        this.sapCreateOrderOutputShipToCustomerNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputShipToName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputShipToName() {
        return sapCreateOrderOutputShipToName;
    }

    /**
     * Sets the value of the sapCreateOrderOutputShipToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputShipToName(QueryType value) {
        this.sapCreateOrderOutputShipToName = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputSoldToCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputSoldToCustomerNumber() {
        return sapCreateOrderOutputSoldToCustomerNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputSoldToCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputSoldToCustomerNumber(QueryType value) {
        this.sapCreateOrderOutputSoldToCustomerNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputSoldToName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputSoldToName() {
        return sapCreateOrderOutputSoldToName;
    }

    /**
     * Sets the value of the sapCreateOrderOutputSoldToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputSoldToName(QueryType value) {
        this.sapCreateOrderOutputSoldToName = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputSubmitDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCreateOrderOutputSubmitDate() {
        return sapCreateOrderOutputSubmitDate;
    }

    /**
     * Sets the value of the sapCreateOrderOutputSubmitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCreateOrderOutputSubmitDate(QueryType value) {
        this.sapCreateOrderOutputSubmitDate = value;
    }

    /**
     * Gets the value of the sapDistributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPDistributionChannel() {
        return sapDistributionChannel;
    }

    /**
     * Sets the value of the sapDistributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPDistributionChannel(QueryType value) {
        this.sapDistributionChannel = value;
    }

    /**
     * Gets the value of the sapDistributionChannelMO property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPDistributionChannelMO() {
        return sapDistributionChannelMO;
    }

    /**
     * Sets the value of the sapDistributionChannelMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPDistributionChannelMO(QueryType value) {
        this.sapDistributionChannelMO = value;
    }

    /**
     * Gets the value of the sapDivision property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPDivision() {
        return sapDivision;
    }

    /**
     * Sets the value of the sapDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPDivision(QueryType value) {
        this.sapDivision = value;
    }

    /**
     * Gets the value of the sapDivisionMO property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPDivisionMO() {
        return sapDivisionMO;
    }

    /**
     * Sets the value of the sapDivisionMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPDivisionMO(QueryType value) {
        this.sapDivisionMO = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderDeliveryBlock property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusHeaderDeliveryBlock() {
        return sapOrderStatusHeaderDeliveryBlock;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderDeliveryBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusHeaderDeliveryBlock(QueryType value) {
        this.sapOrderStatusHeaderDeliveryBlock = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusHeaderDeliveryStatus() {
        return sapOrderStatusHeaderDeliveryStatus;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusHeaderDeliveryStatus(QueryType value) {
        this.sapOrderStatusHeaderDeliveryStatus = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderProcessingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusHeaderProcessingStatus() {
        return sapOrderStatusHeaderProcessingStatus;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderProcessingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusHeaderProcessingStatus(QueryType value) {
        this.sapOrderStatusHeaderProcessingStatus = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderPurchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusHeaderPurchaseOrderNumber() {
        return sapOrderStatusHeaderPurchaseOrderNumber;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderPurchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusHeaderPurchaseOrderNumber(QueryType value) {
        this.sapOrderStatusHeaderPurchaseOrderNumber = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderRequestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusHeaderRequestedShipDate() {
        return sapOrderStatusHeaderRequestedShipDate;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderRequestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusHeaderRequestedShipDate(QueryType value) {
        this.sapOrderStatusHeaderRequestedShipDate = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusOutputId() {
        return sapOrderStatusOutputId;
    }

    /**
     * Sets the value of the sapOrderStatusOutputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusOutputId(QueryType value) {
        this.sapOrderStatusOutputId = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusOutputReturnCode() {
        return sapOrderStatusOutputReturnCode;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusOutputReturnCode(QueryType value) {
        this.sapOrderStatusOutputReturnCode = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusOutputReturnMessage() {
        return sapOrderStatusOutputReturnMessage;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusOutputReturnMessage(QueryType value) {
        this.sapOrderStatusOutputReturnMessage = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnMessageFull property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusOutputReturnMessageFull() {
        return sapOrderStatusOutputReturnMessageFull;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnMessageFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusOutputReturnMessageFull(QueryType value) {
        this.sapOrderStatusOutputReturnMessageFull = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusOutputReturnType() {
        return sapOrderStatusOutputReturnType;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusOutputReturnType(QueryType value) {
        this.sapOrderStatusOutputReturnType = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrderStatusOutputUpdateDate() {
        return sapOrderStatusOutputUpdateDate;
    }

    /**
     * Sets the value of the sapOrderStatusOutputUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrderStatusOutputUpdateDate(QueryType value) {
        this.sapOrderStatusOutputUpdateDate = value;
    }

    /**
     * Gets the value of the sapOrganizationIdMO property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPOrganizationIdMO() {
        return sapOrganizationIdMO;
    }

    /**
     * Sets the value of the sapOrganizationIdMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPOrganizationIdMO(QueryType value) {
        this.sapOrganizationIdMO = value;
    }

    /**
     * Gets the value of the sapSalesArea property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPSalesArea() {
        return sapSalesArea;
    }

    /**
     * Sets the value of the sapSalesArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPSalesArea(QueryType value) {
        this.sapSalesArea = value;
    }

    /**
     * Gets the value of the sapSalesAreaMO property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPSalesAreaMO() {
        return sapSalesAreaMO;
    }

    /**
     * Sets the value of the sapSalesAreaMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPSalesAreaMO(QueryType value) {
        this.sapSalesAreaMO = value;
    }

    /**
     * Gets the value of the sapSalesAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPSalesAreaId() {
        return sapSalesAreaId;
    }

    /**
     * Sets the value of the sapSalesAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPSalesAreaId(QueryType value) {
        this.sapSalesAreaId = value;
    }

    /**
     * Gets the value of the sapSalesOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPSalesOrganization() {
        return sapSalesOrganization;
    }

    /**
     * Sets the value of the sapSalesOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPSalesOrganization(QueryType value) {
        this.sapSalesOrganization = value;
    }

    /**
     * Gets the value of the sapSalesOrganizationMO property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPSalesOrganizationMO() {
        return sapSalesOrganizationMO;
    }

    /**
     * Sets the value of the sapSalesOrganizationMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPSalesOrganizationMO(QueryType value) {
        this.sapSalesOrganizationMO = value;
    }

    /**
     * Gets the value of the scenarioTestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getScenarioTestFlag() {
        return scenarioTestFlag;
    }

    /**
     * Sets the value of the scenarioTestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setScenarioTestFlag(QueryType value) {
        this.scenarioTestFlag = value;
    }

    /**
     * Gets the value of the serviceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Sets the value of the serviceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccount(QueryType value) {
        this.serviceAccount = value;
    }

    /**
     * Gets the value of the serviceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * Sets the value of the serviceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountId(QueryType value) {
        this.serviceAccountId = value;
    }

    /**
     * Gets the value of the serviceRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceRequestId() {
        return serviceRequestId;
    }

    /**
     * Sets the value of the serviceRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceRequestId(QueryType value) {
        this.serviceRequestId = value;
    }

    /**
     * Gets the value of the serviceRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceRequestNumber() {
        return serviceRequestNumber;
    }

    /**
     * Sets the value of the serviceRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceRequestNumber(QueryType value) {
        this.serviceRequestNumber = value;
    }

    /**
     * Gets the value of the serviceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceTotal() {
        return serviceTotal;
    }

    /**
     * Sets the value of the serviceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceTotal(QueryType value) {
        this.serviceTotal = value;
    }

    /**
     * Gets the value of the shipCompleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipCompleteFlag() {
        return shipCompleteFlag;
    }

    /**
     * Sets the value of the shipCompleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipCompleteFlag(QueryType value) {
        this.shipCompleteFlag = value;
    }

    /**
     * Gets the value of the shipInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipInstructions() {
        return shipInstructions;
    }

    /**
     * Sets the value of the shipInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipInstructions(QueryType value) {
        this.shipInstructions = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccount(QueryType value) {
        this.shipToAccount = value;
    }

    /**
     * Gets the value of the shipToAccountConstrained property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountConstrained() {
        return shipToAccountConstrained;
    }

    /**
     * Sets the value of the shipToAccountConstrained property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountConstrained(QueryType value) {
        this.shipToAccountConstrained = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountId(QueryType value) {
        this.shipToAccountId = value;
    }

    /**
     * Gets the value of the shipToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountIntegrationId() {
        return shipToAccountIntegrationId;
    }

    /**
     * Sets the value of the shipToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountIntegrationId(QueryType value) {
        this.shipToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the shipToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountLocation() {
        return shipToAccountLocation;
    }

    /**
     * Sets the value of the shipToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountLocation(QueryType value) {
        this.shipToAccountLocation = value;
    }

    /**
     * Gets the value of the shipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddressId() {
        return shipToAddressId;
    }

    /**
     * Sets the value of the shipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddressId(QueryType value) {
        this.shipToAddressId = value;
    }

    /**
     * Gets the value of the shipToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddressIntegrationId() {
        return shipToAddressIntegrationId;
    }

    /**
     * Sets the value of the shipToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddressIntegrationId(QueryType value) {
        this.shipToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the shipToAddressSiteUseIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddressSiteUseIntegrationId() {
        return shipToAddressSiteUseIntegrationId;
    }

    /**
     * Sets the value of the shipToAddressSiteUseIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddressSiteUseIntegrationId(QueryType value) {
        this.shipToAddressSiteUseIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCity(QueryType value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityState() {
        return shipToCityState;
    }

    /**
     * Sets the value of the shipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityState(QueryType value) {
        this.shipToCityState = value;
    }

    /**
     * Gets the value of the shipToCityStateENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityStateENU() {
        return shipToCityStateENU;
    }

    /**
     * Sets the value of the shipToCityStateENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityStateENU(QueryType value) {
        this.shipToCityStateENU = value;
    }

    /**
     * Gets the value of the shipToCityStateJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityStateJPN() {
        return shipToCityStateJPN;
    }

    /**
     * Sets the value of the shipToCityStateJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityStateJPN(QueryType value) {
        this.shipToCityStateJPN = value;
    }

    /**
     * Gets the value of the shipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityStateZip() {
        return shipToCityStateZip;
    }

    /**
     * Sets the value of the shipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityStateZip(QueryType value) {
        this.shipToCityStateZip = value;
    }

    /**
     * Gets the value of the shipToCityStateZipENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityStateZipENU() {
        return shipToCityStateZipENU;
    }

    /**
     * Sets the value of the shipToCityStateZipENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityStateZipENU(QueryType value) {
        this.shipToCityStateZipENU = value;
    }

    /**
     * Gets the value of the shipToCityStateZipJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityStateZipJPN() {
        return shipToCityStateZipJPN;
    }

    /**
     * Sets the value of the shipToCityStateZipJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityStateZipJPN(QueryType value) {
        this.shipToCityStateZipJPN = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactId(QueryType value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactIntegrationId() {
        return shipToContactIntegrationId;
    }

    /**
     * Sets the value of the shipToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactIntegrationId(QueryType value) {
        this.shipToContactIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCountry(QueryType value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToState(QueryType value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToZip(QueryType value) {
        this.shipToZip = value;
    }

    /**
     * Gets the value of the shipViaId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipViaId() {
        return shipViaId;
    }

    /**
     * Sets the value of the shipViaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipViaId(QueryType value) {
        this.shipViaId = value;
    }

    /**
     * Gets the value of the shopforSelfFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShopforSelfFlag() {
        return shopforSelfFlag;
    }

    /**
     * Sets the value of the shopforSelfFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShopforSelfFlag(QueryType value) {
        this.shopforSelfFlag = value;
    }

    /**
     * Gets the value of the singleSourceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSingleSourceFlag() {
        return singleSourceFlag;
    }

    /**
     * Sets the value of the singleSourceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSingleSourceFlag(QueryType value) {
        this.singleSourceFlag = value;
    }

    /**
     * Gets the value of the sourceInventoryId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSourceInventoryId() {
        return sourceInventoryId;
    }

    /**
     * Sets the value of the sourceInventoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSourceInventoryId(QueryType value) {
        this.sourceInventoryId = value;
    }

    /**
     * Gets the value of the sourceInventoryLocIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSourceInventoryLocIntegrationId() {
        return sourceInventoryLocIntegrationId;
    }

    /**
     * Sets the value of the sourceInventoryLocIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSourceInventoryLocIntegrationId(QueryType value) {
        this.sourceInventoryLocIntegrationId = value;
    }

    /**
     * Gets the value of the sourceInventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSourceInventoryLocation() {
        return sourceInventoryLocation;
    }

    /**
     * Sets the value of the sourceInventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSourceInventoryLocation(QueryType value) {
        this.sourceInventoryLocation = value;
    }

    /**
     * Gets the value of the spreadDiscountAllProducts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSpreadDiscountAllProducts() {
        return spreadDiscountAllProducts;
    }

    /**
     * Sets the value of the spreadDiscountAllProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSpreadDiscountAllProducts(QueryType value) {
        this.spreadDiscountAllProducts = value;
    }

    /**
     * Gets the value of the spreadDiscountCurrentTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSpreadDiscountCurrentTotal() {
        return spreadDiscountCurrentTotal;
    }

    /**
     * Sets the value of the spreadDiscountCurrentTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSpreadDiscountCurrentTotal(QueryType value) {
        this.spreadDiscountCurrentTotal = value;
    }

    /**
     * Gets the value of the spreadDiscountProductType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSpreadDiscountProductType() {
        return spreadDiscountProductType;
    }

    /**
     * Sets the value of the spreadDiscountProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSpreadDiscountProductType(QueryType value) {
        this.spreadDiscountProductType = value;
    }

    /**
     * Gets the value of the spreadDiscountSpreadTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSpreadDiscountSpreadTotal() {
        return spreadDiscountSpreadTotal;
    }

    /**
     * Sets the value of the spreadDiscountSpreadTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSpreadDiscountSpreadTotal(QueryType value) {
        this.spreadDiscountSpreadTotal = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStatus(QueryType value) {
        this.status = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSubmitDate(QueryType value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTax(QueryType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxAmount(QueryType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxAmountFromRate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxAmountFromRate() {
        return taxAmountFromRate;
    }

    /**
     * Sets the value of the taxAmountFromRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxAmountFromRate(QueryType value) {
        this.taxAmountFromRate = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExempt(QueryType value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the taxExemptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExemptNumber() {
        return taxExemptNumber;
    }

    /**
     * Sets the value of the taxExemptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExemptNumber(QueryType value) {
        this.taxExemptNumber = value;
    }

    /**
     * Gets the value of the taxExemptReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExemptReason() {
        return taxExemptReason;
    }

    /**
     * Sets the value of the taxExemptReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExemptReason(QueryType value) {
        this.taxExemptReason = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxRate(QueryType value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxRateFromAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxRateFromAmount() {
        return taxRateFromAmount;
    }

    /**
     * Sets the value of the taxRateFromAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxRateFromAmount(QueryType value) {
        this.taxRateFromAmount = value;
    }

    /**
     * Gets the value of the thirdPartyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getThirdPartyTaxAmount() {
        return thirdPartyTaxAmount;
    }

    /**
     * Sets the value of the thirdPartyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setThirdPartyTaxAmount(QueryType value) {
        this.thirdPartyTaxAmount = value;
    }

    /**
     * Gets the value of the totalCurrentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTotalCurrentPrice() {
        return totalCurrentPrice;
    }

    /**
     * Sets the value of the totalCurrentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTotalCurrentPrice(QueryType value) {
        this.totalCurrentPrice = value;
    }

    /**
     * Gets the value of the totalFieldsActive property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTotalFieldsActive() {
        return totalFieldsActive;
    }

    /**
     * Sets the value of the totalFieldsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTotalFieldsActive(QueryType value) {
        this.totalFieldsActive = value;
    }

    /**
     * Gets the value of the totalListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTotalListPrice() {
        return totalListPrice;
    }

    /**
     * Sets the value of the totalListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTotalListPrice(QueryType value) {
        this.totalListPrice = value;
    }

    /**
     * Gets the value of the totalVolume property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTotalVolume() {
        return totalVolume;
    }

    /**
     * Sets the value of the totalVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTotalVolume(QueryType value) {
        this.totalVolume = value;
    }

    /**
     * Gets the value of the totalVolumeUoM property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTotalVolumeUoM() {
        return totalVolumeUoM;
    }

    /**
     * Sets the value of the totalVolumeUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTotalVolumeUoM(QueryType value) {
        this.totalVolumeUoM = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTotalWeight(QueryType value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the totalWeightUoM property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTotalWeightUoM() {
        return totalWeightUoM;
    }

    /**
     * Sets the value of the totalWeightUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTotalWeightUoM(QueryType value) {
        this.totalWeightUoM = value;
    }

    /**
     * Gets the value of the trainingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTrainingTotal() {
        return trainingTotal;
    }

    /**
     * Sets the value of the trainingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTrainingTotal(QueryType value) {
        this.trainingTotal = value;
    }

    /**
     * Gets the value of the ultimateParentId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUltimateParentId() {
        return ultimateParentId;
    }

    /**
     * Sets the value of the ultimateParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUltimateParentId(QueryType value) {
        this.ultimateParentId = value;
    }

    /**
     * Gets the value of the updatedByLogin property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdatedByLogin() {
        return updatedByLogin;
    }

    /**
     * Sets the value of the updatedByLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdatedByLogin(QueryType value) {
        this.updatedByLogin = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUserType(QueryType value) {
        this.userType = value;
    }

    /**
     * Gets the value of the userTypeBToB property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUserTypeBToB() {
        return userTypeBToB;
    }

    /**
     * Sets the value of the userTypeBToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUserTypeBToB(QueryType value) {
        this.userTypeBToB = value;
    }

    /**
     * Gets the value of the webphoneOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWebphoneOrderNumber() {
        return webphoneOrderNumber;
    }

    /**
     * Sets the value of the webphoneOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWebphoneOrderNumber(QueryType value) {
        this.webphoneOrderNumber = value;
    }

    /**
     * Gets the value of the listOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPaymentsQuery }
     *     
     */
    public ListOfPaymentsQuery getListOfPayments() {
        return listOfPayments;
    }

    /**
     * Sets the value of the listOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPaymentsQuery }
     *     
     */
    public void setListOfPayments(ListOfPaymentsQuery value) {
        this.listOfPayments = value;
    }

    /**
     * Gets the value of the listOfOrderEntryLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderEntryLineItemsQuery }
     *     
     */
    public ListOfOrderEntryLineItemsQuery getListOfOrderEntryLineItems() {
        return listOfOrderEntryLineItems;
    }

    /**
     * Sets the value of the listOfOrderEntryLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderEntryLineItemsQuery }
     *     
     */
    public void setListOfOrderEntryLineItems(ListOfOrderEntryLineItemsQuery value) {
        this.listOfOrderEntryLineItems = value;
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
