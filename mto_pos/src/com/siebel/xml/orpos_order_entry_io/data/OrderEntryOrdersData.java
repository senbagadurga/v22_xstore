
package com.siebel.xml.orpos_order_entry_io.data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderEntry-OrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderEntry-OrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTOPaymentRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTOOrderOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTOBusinessDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MTOApplicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTOAccountSCBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MTOAccountPrepaidBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountContractedProductsOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountOrderNumber-OLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApprovedBy-EmpLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovedBy-EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovedBy-PositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AutoReceiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BackOfficeErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackOfficeOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackOfficeProcessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillTo-County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillTo-Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccountConstrained" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddressSiteUseIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCityStateENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCityStateJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCityStateZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCityStateZipENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCityStateZipJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToVATRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ByAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CalculatedCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculatedOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampConId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangedSinceLastExportToTransactionWorkbook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChargedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Check" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditAssignmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditAssignmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber-Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber-ReadOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumberKeyIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditCheckMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCheckSkipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditCheckSkipThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditCheckSkipThresholdCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditSubmissionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCityStateZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderShipToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalItemDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalNetDiscountPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentOrderTotalNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmountMRC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercentMRC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAISyncDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EligibilityCompatibilityProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExportedOnceToTransactionWorkbook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Freight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FreightAmountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightAmountDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FreightTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightTermsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FulfillLockFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HierarchyVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncentiveCompensationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncentiveCompensationStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IseChannelShopForMyAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAdminMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoadNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MRCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MovedToTransactionWorkbook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NRCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumberofShipments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyPrimaryPositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderItemQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderLateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeLIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideOwnerinReorderProcess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="POAutoApproveLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="POEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="POEditableStatus1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="POEditableStatus2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParentOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartialShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToContactFirstLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToContactLastFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayerAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTermIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateZipENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCityStateZipJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PricingProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFulfillInvlocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPartnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPayerAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPayerAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProspectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchMgrComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReserveTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReserveTimeUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAddrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputBill-toCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputBill-toName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnMessageFull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputReturnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputShip-toCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputShip-toName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputSold-toCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputSold-toName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCreateOrderOutputSubmitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SAPDistributionChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPDistributionChannelMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPDivisionMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderDeliveryBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderProcessingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderPurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusHeaderRequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnMessageFull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputReturnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPOrderStatusOutputUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SAPOrganizationIdMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPSalesArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPSalesAreaMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPSalesAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPSalesOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPSalesOrganizationMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScenarioTestFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceRequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShipCompleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountConstrained" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressSiteUseIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZipENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZipJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipViaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShopforSelfFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SingleSourceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SourceInventoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-AllProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-CurrentTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpreadDiscount-SpreadTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmountFromRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExemptReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxRateFromAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCurrentPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFieldsActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalVolumeUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalWeightUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrainingTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UltimateParentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedByLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserTypeB-to-B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebphoneOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfPayments" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Data}ListOfPaymentsData" minOccurs="0"/>
 *         &lt;element name="ListOfOrderEntry-LineItems" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Data}ListOfOrderEntry-LineItemsData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderEntry-OrdersData", propOrder = {
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
public class OrderEntryOrdersData {

    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "MTOPaymentRefNumber")
    protected String mtoPaymentRefNumber;
    @XmlElement(name = "MTOOrderOfficeId")
    protected String mtoOrderOfficeId;
    @XmlElement(name = "MTOBusinessDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtoBusinessDate;
    @XmlElement(name = "MTOApplicationStatus")
    protected String mtoApplicationStatus;
    @XmlElement(name = "MTOAccountSCBalance")
    protected BigDecimal mtoAccountSCBalance;
    @XmlElement(name = "MTOAccountPrepaidBalance")
    protected BigDecimal mtoAccountPrepaidBalance;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "Updated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ATPMessage")
    protected String atpMessage;
    @XmlElement(name = "ATPStatus")
    protected String atpStatus;
    @XmlElement(name = "ATPStatusAsOfDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar atpStatusAsOfDate;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "AccountAddressId")
    protected String accountAddressId;
    @XmlElement(name = "AccountContractedProductsOnlyFlag")
    protected Boolean accountContractedProductsOnlyFlag;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountIntegrationId")
    protected String accountIntegrationId;
    @XmlElement(name = "AccountLocation")
    protected String accountLocation;
    @XmlElement(name = "AccountOrderNumber")
    protected String accountOrderNumber;
    @XmlElement(name = "AccountOrderNumber-OLD")
    protected String accountOrderNumberOLD;
    @XmlElement(name = "AccountPriceListId")
    protected String accountPriceListId;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Age")
    protected String age;
    @XmlElement(name = "AgreementId")
    protected String agreementId;
    @XmlElement(name = "AgreementIntegrationId")
    protected String agreementIntegrationId;
    @XmlElement(name = "AgreementName")
    protected String agreementName;
    @XmlElement(name = "Approved")
    protected Boolean approved;
    @XmlElement(name = "ApprovedBy-EmpLogin")
    protected String approvedByEmpLogin;
    @XmlElement(name = "ApprovedBy-EmployeeId")
    protected String approvedByEmployeeId;
    @XmlElement(name = "ApprovedBy-PositionId")
    protected String approvedByPositionId;
    @XmlElement(name = "ApprovedByDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedByDate;
    @XmlElement(name = "AsOfDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfDate;
    @XmlElement(name = "AutoReceiveFlag")
    protected Boolean autoReceiveFlag;
    @XmlElement(name = "AvailableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availableDate;
    @XmlElement(name = "BackOfficeErrorText")
    protected String backOfficeErrorText;
    @XmlElement(name = "BackOfficeOrderNumber")
    protected String backOfficeOrderNumber;
    @XmlElement(name = "BackOfficeProcessStatus")
    protected String backOfficeProcessStatus;
    @XmlElement(name = "BillTo-County")
    protected String billToCounty;
    @XmlElement(name = "BillTo-Province")
    protected String billToProvince;
    @XmlElement(name = "BillToAccount")
    protected String billToAccount;
    @XmlElement(name = "BillToAccountConstrained")
    protected String billToAccountConstrained;
    @XmlElement(name = "BillToAccountId")
    protected String billToAccountId;
    @XmlElement(name = "BillToAccountIntegrationId")
    protected String billToAccountIntegrationId;
    @XmlElement(name = "BillToAccountLocation")
    protected String billToAccountLocation;
    @XmlElement(name = "BillToAddressId")
    protected String billToAddressId;
    @XmlElement(name = "BillToAddressIntegrationId")
    protected String billToAddressIntegrationId;
    @XmlElement(name = "BillToAddressSiteUseIntegrationId")
    protected String billToAddressSiteUseIntegrationId;
    @XmlElement(name = "BillToCityState")
    protected String billToCityState;
    @XmlElement(name = "BillToCityStateENU")
    protected String billToCityStateENU;
    @XmlElement(name = "BillToCityStateJPN")
    protected String billToCityStateJPN;
    @XmlElement(name = "BillToCityStateZip")
    protected String billToCityStateZip;
    @XmlElement(name = "BillToCityStateZipENU")
    protected String billToCityStateZipENU;
    @XmlElement(name = "BillToCityStateZipJPN")
    protected String billToCityStateZipJPN;
    @XmlElement(name = "BillToContactId")
    protected String billToContactId;
    @XmlElement(name = "BillToContactIntegrationId")
    protected String billToContactIntegrationId;
    @XmlElement(name = "BillToDUNSNumber")
    protected String billToDUNSNumber;
    @XmlElement(name = "BillToVATRegistrationNumber")
    protected String billToVATRegistrationNumber;
    @XmlElement(name = "BillableFlag")
    protected Boolean billableFlag;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "BillingBlock")
    protected String billingBlock;
    @XmlElement(name = "ByAge")
    protected Integer byAge;
    @XmlElement(name = "CalculatedCustomerId")
    protected String calculatedCustomerId;
    @XmlElement(name = "CalculatedOrderType")
    protected String calculatedOrderType;
    @XmlElement(name = "CampConId")
    protected String campConId;
    @XmlElement(name = "CampaignId")
    protected String campaignId;
    @XmlElement(name = "CampaignIntegrationId")
    protected String campaignIntegrationId;
    @XmlElement(name = "CampaignName")
    protected String campaignName;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "CarrierType")
    protected String carrierType;
    @XmlElement(name = "ChangedSinceLastExportToTransactionWorkbook")
    protected Boolean changedSinceLastExportToTransactionWorkbook;
    @XmlElement(name = "ChargedFlag")
    protected Boolean chargedFlag;
    @XmlElement(name = "Check")
    protected Boolean check;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CompoundProductNumber")
    protected String compoundProductNumber;
    @XmlElement(name = "ContactEmailAddress")
    protected String contactEmailAddress;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactIntegrationId")
    protected String contactIntegrationId;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "ContactWorkPhone")
    protected String contactWorkPhone;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "CreditAssignmentDescription")
    protected String creditAssignmentDescription;
    @XmlElement(name = "CreditAssignmentStatus")
    protected String creditAssignmentStatus;
    @XmlElement(name = "CreditCardApprovalCode")
    protected String creditCardApprovalCode;
    @XmlElement(name = "CreditCardExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditCardExpirationDate;
    @XmlElement(name = "CreditCardExpirationMonth")
    protected String creditCardExpirationMonth;
    @XmlElement(name = "CreditCardExpirationYear")
    protected String creditCardExpirationYear;
    @XmlElement(name = "CreditCardHolder")
    protected String creditCardHolder;
    @XmlElement(name = "CreditCardMerchantId")
    protected String creditCardMerchantId;
    @XmlElement(name = "CreditCardName")
    protected String creditCardName;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardNumber-Display")
    protected String creditCardNumberDisplay;
    @XmlElement(name = "CreditCardNumber-ReadOnly")
    protected String creditCardNumberReadOnly;
    @XmlElement(name = "CreditCardNumberKeyIndex")
    protected String creditCardNumberKeyIndex;
    @XmlElement(name = "CreditCardTransactionAmount")
    protected BigDecimal creditCardTransactionAmount;
    @XmlElement(name = "CreditCardTransactionID")
    protected String creditCardTransactionID;
    @XmlElement(name = "CreditCardTransactionResponseCode")
    protected String creditCardTransactionResponseCode;
    @XmlElement(name = "CreditCardTransactionStatus")
    protected String creditCardTransactionStatus;
    @XmlElement(name = "CreditCardTransactionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditCardTransactionTime;
    @XmlElement(name = "CreditCheckMessage")
    protected String creditCheckMessage;
    @XmlElement(name = "CreditCheckSkipFlag")
    protected Boolean creditCheckSkipFlag;
    @XmlElement(name = "CreditCheckSkipThreshold")
    protected BigDecimal creditCheckSkipThreshold;
    @XmlElement(name = "CreditCheckSkipThresholdCurrencyCode")
    protected String creditCheckSkipThresholdCurrencyCode;
    @XmlElement(name = "CreditCheckStatus")
    protected String creditCheckStatus;
    @XmlElement(name = "CreditCheckStatusAsOfDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditCheckStatusAsOfDate;
    @XmlElement(name = "CreditStatus")
    protected Boolean creditStatus;
    @XmlElement(name = "CreditSubmissionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditSubmissionTime;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CurrentOrderShipToCity")
    protected String currentOrderShipToCity;
    @XmlElement(name = "CurrentOrderShipToCityState")
    protected String currentOrderShipToCityState;
    @XmlElement(name = "CurrentOrderShipToCityStateZip")
    protected String currentOrderShipToCityStateZip;
    @XmlElement(name = "CurrentOrderShipToCountry")
    protected String currentOrderShipToCountry;
    @XmlElement(name = "CurrentOrderShipToPostalCode")
    protected String currentOrderShipToPostalCode;
    @XmlElement(name = "CurrentOrderShipToState")
    protected String currentOrderShipToState;
    @XmlElement(name = "CurrentOrderShipToStreetAddress")
    protected String currentOrderShipToStreetAddress;
    @XmlElement(name = "CurrentOrderShipToStreetAddress2")
    protected String currentOrderShipToStreetAddress2;
    @XmlElement(name = "CurrentOrderTotalBasePrice")
    protected BigDecimal currentOrderTotalBasePrice;
    @XmlElement(name = "CurrentOrderTotalDiscount")
    protected BigDecimal currentOrderTotalDiscount;
    @XmlElement(name = "CurrentOrderTotalItemDiscount")
    protected BigDecimal currentOrderTotalItemDiscount;
    @XmlElement(name = "CurrentOrderTotalNetDiscountPrice")
    protected BigDecimal currentOrderTotalNetDiscountPrice;
    @XmlElement(name = "CurrentOrderTotalNetPrice")
    protected BigDecimal currentOrderTotalNetPrice;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "DeliveryBlock")
    protected String deliveryBlock;
    @XmlElement(name = "DeliveryStatus")
    protected String deliveryStatus;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DestinationInventoryId")
    protected String destinationInventoryId;
    @XmlElement(name = "DestinationInventoryLocation")
    protected String destinationInventoryLocation;
    @XmlElement(name = "DestinationInventoryLocationIntegrationId")
    protected String destinationInventoryLocationIntegrationId;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountAmountMRC")
    protected BigDecimal discountAmountMRC;
    @XmlElement(name = "DiscountPercentMRC")
    protected BigDecimal discountPercentMRC;
    @XmlElement(name = "DiscountReason")
    protected String discountReason;
    @XmlElement(name = "EAISyncDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eaiSyncDate;
    @XmlElement(name = "EligibilityCompatibilityProcedureName")
    protected String eligibilityCompatibilityProcedureName;
    @XmlElement(name = "EntitlementId")
    protected String entitlementId;
    @XmlElement(name = "EntitlementName")
    protected String entitlementName;
    @XmlElement(name = "ExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(name = "ExportedOnceToTransactionWorkbook")
    protected Boolean exportedOnceToTransactionWorkbook;
    @XmlElement(name = "Freight")
    protected BigDecimal freight;
    @XmlElement(name = "FreightAmountCurrencyCode")
    protected String freightAmountCurrencyCode;
    @XmlElement(name = "FreightAmountDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar freightAmountDate;
    @XmlElement(name = "FreightTerms")
    protected String freightTerms;
    @XmlElement(name = "FreightTermsInfo")
    protected String freightTermsInfo;
    @XmlElement(name = "FreightTotal")
    protected BigDecimal freightTotal;
    @XmlElement(name = "FulfillLockFlag")
    protected Boolean fulfillLockFlag;
    @XmlElement(name = "HierarchyVersionId")
    protected String hierarchyVersionId;
    @XmlElement(name = "HoldFlag")
    protected Boolean holdFlag;
    @XmlElement(name = "IncentiveCompensationStatus")
    protected String incentiveCompensationStatus;
    @XmlElement(name = "IncentiveCompensationStatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar incentiveCompensationStatusDate;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "InternalTaxAmount")
    protected BigDecimal internalTaxAmount;
    @XmlElement(name = "IseChannelShopForMyAccount")
    protected Boolean iseChannelShopForMyAccount;
    @XmlElement(name = "IsAdminMode")
    protected Boolean isAdminMode;
    @XmlElement(name = "LoadNumber")
    protected Integer loadNumber;
    @XmlElement(name = "MRCTotal")
    protected BigDecimal mrcTotal;
    @XmlElement(name = "MaxRevisionNumber")
    protected String maxRevisionNumber;
    @XmlElement(name = "MediaId")
    protected String mediaId;
    @XmlElement(name = "MovedToTransactionWorkbook")
    protected Boolean movedToTransactionWorkbook;
    @XmlElement(name = "NRCTotal")
    protected BigDecimal nrcTotal;
    @XmlElement(name = "NumberofShipments")
    protected String numberofShipments;
    @XmlElement(name = "Opportunity")
    protected String opportunity;
    @XmlElement(name = "OptyId")
    protected String optyId;
    @XmlElement(name = "OptyIntegrationId")
    protected String optyIntegrationId;
    @XmlElement(name = "OptyPrimaryPositionId")
    protected String optyPrimaryPositionId;
    @XmlElement(name = "OrderDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderItemQuantity")
    protected String orderItemQuantity;
    @XmlElement(name = "OrderLateFlag")
    protected Boolean orderLateFlag;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderPriority")
    protected String orderPriority;
    @XmlElement(name = "OrderTotal")
    protected BigDecimal orderTotal;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "OrderTypeCode")
    protected String orderTypeCode;
    @XmlElement(name = "OrderTypeId")
    protected String orderTypeId;
    @XmlElement(name = "OrderTypeLIC")
    protected String orderTypeLIC;
    @XmlElement(name = "OrganizationIntegrationId")
    protected String organizationIntegrationId;
    @XmlElement(name = "OverrideOwnerinReorderProcess")
    protected Boolean overrideOwnerinReorderProcess;
    @XmlElement(name = "POAutoApproveLimit")
    protected BigDecimal poAutoApproveLimit;
    @XmlElement(name = "POEditable")
    protected Boolean poEditable;
    @XmlElement(name = "POEditableStatus1")
    protected Boolean poEditableStatus1;
    @XmlElement(name = "POEditableStatus2")
    protected Boolean poEditableStatus2;
    @XmlElement(name = "ParentOrderId")
    protected String parentOrderId;
    @XmlElement(name = "PartialShip")
    protected Boolean partialShip;
    @XmlElement(name = "PayToAccount")
    protected String payToAccount;
    @XmlElement(name = "PayToAccountId")
    protected String payToAccountId;
    @XmlElement(name = "PayToAccountIntegrationId")
    protected String payToAccountIntegrationId;
    @XmlElement(name = "PayToAccountLocation")
    protected String payToAccountLocation;
    @XmlElement(name = "PayToAddressId")
    protected String payToAddressId;
    @XmlElement(name = "PayToAddressIntegrationId")
    protected String payToAddressIntegrationId;
    @XmlElement(name = "PayToContactFirstLastName")
    protected String payToContactFirstLastName;
    @XmlElement(name = "PayToContactId")
    protected String payToContactId;
    @XmlElement(name = "PayToContactIntegrationId")
    protected String payToContactIntegrationId;
    @XmlElement(name = "PayToContactLastFirstName")
    protected String payToContactLastFirstName;
    @XmlElement(name = "PayToContactName")
    protected String payToContactName;
    @XmlElement(name = "PayerAccountIntegrationId")
    protected String payerAccountIntegrationId;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentTerm")
    protected String paymentTerm;
    @XmlElement(name = "PaymentTermId")
    protected String paymentTermId;
    @XmlElement(name = "PaymentTermIntegrationId")
    protected String paymentTermIntegrationId;
    @XmlElement(name = "PersonalBillToAddressId")
    protected String personalBillToAddressId;
    @XmlElement(name = "PersonalBillToCity")
    protected String personalBillToCity;
    @XmlElement(name = "PersonalBillToCountry")
    protected String personalBillToCountry;
    @XmlElement(name = "PersonalBillToPostalCode")
    protected String personalBillToPostalCode;
    @XmlElement(name = "PersonalBillToState")
    protected String personalBillToState;
    @XmlElement(name = "PersonalBillToStreetAddress")
    protected String personalBillToStreetAddress;
    @XmlElement(name = "PersonalBillToStreetAddress2")
    protected String personalBillToStreetAddress2;
    @XmlElement(name = "PersonalShipToAddressId")
    protected String personalShipToAddressId;
    @XmlElement(name = "PersonalShipToCity")
    protected String personalShipToCity;
    @XmlElement(name = "PersonalShipToCityState")
    protected String personalShipToCityState;
    @XmlElement(name = "PersonalShipToCityStateENU")
    protected String personalShipToCityStateENU;
    @XmlElement(name = "PersonalShipToCityStateJPN")
    protected String personalShipToCityStateJPN;
    @XmlElement(name = "PersonalShipToCityStateZip")
    protected String personalShipToCityStateZip;
    @XmlElement(name = "PersonalShipToCityStateZipENU")
    protected String personalShipToCityStateZipENU;
    @XmlElement(name = "PersonalShipToCityStateZipJPN")
    protected String personalShipToCityStateZipJPN;
    @XmlElement(name = "PersonalShipToCountry")
    protected String personalShipToCountry;
    @XmlElement(name = "PersonalShipToPostalCode")
    protected String personalShipToPostalCode;
    @XmlElement(name = "PersonalShipToState")
    protected String personalShipToState;
    @XmlElement(name = "PersonalShipToStreetAddress")
    protected String personalShipToStreetAddress;
    @XmlElement(name = "PersonalShipToStreetAddress2")
    protected String personalShipToStreetAddress2;
    @XmlElement(name = "PriceList")
    protected String priceList;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected String priceListIntegrationId;
    @XmlElement(name = "PriceModelId")
    protected String priceModelId;
    @XmlElement(name = "PricingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pricingDate;
    @XmlElement(name = "PricingProcedureName")
    protected String pricingProcedureName;
    @XmlElement(name = "PrimaryBillToAddress")
    protected String primaryBillToAddress;
    @XmlElement(name = "PrimaryBillToAddressId")
    protected String primaryBillToAddressId;
    @XmlElement(name = "PrimaryBillToCity")
    protected String primaryBillToCity;
    @XmlElement(name = "PrimaryBillToContactId")
    protected String primaryBillToContactId;
    @XmlElement(name = "PrimaryBillToCountry")
    protected String primaryBillToCountry;
    @XmlElement(name = "PrimaryBillToFirstName")
    protected String primaryBillToFirstName;
    @XmlElement(name = "PrimaryBillToLastName")
    protected String primaryBillToLastName;
    @XmlElement(name = "PrimaryBillToPostalCode")
    protected String primaryBillToPostalCode;
    @XmlElement(name = "PrimaryBillToState")
    protected String primaryBillToState;
    @XmlElement(name = "PrimaryFulfillInvlocId")
    protected String primaryFulfillInvlocId;
    @XmlElement(name = "PrimaryOfferId")
    protected String primaryOfferId;
    @XmlElement(name = "PrimaryOfferName")
    protected String primaryOfferName;
    @XmlElement(name = "PrimaryOrganization")
    protected String primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryPartnerId")
    protected String primaryPartnerId;
    @XmlElement(name = "PrimaryPayerAccount")
    protected String primaryPayerAccount;
    @XmlElement(name = "PrimaryPayerAccountId")
    protected String primaryPayerAccountId;
    @XmlElement(name = "PrimaryPaymentAmount")
    protected BigDecimal primaryPaymentAmount;
    @XmlElement(name = "PrimaryPaymentId")
    protected String primaryPaymentId;
    @XmlElement(name = "PrimaryPositionContactId")
    protected String primaryPositionContactId;
    @XmlElement(name = "PrimaryPositionContactIntegrationId")
    protected String primaryPositionContactIntegrationId;
    @XmlElement(name = "PrimaryPositionId")
    protected String primaryPositionId;
    @XmlElement(name = "PrimaryShipToAddress")
    protected String primaryShipToAddress;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected String primaryShipToAddressId;
    @XmlElement(name = "PrimaryShipToCity")
    protected String primaryShipToCity;
    @XmlElement(name = "PrimaryShipToContactId")
    protected String primaryShipToContactId;
    @XmlElement(name = "PrimaryShipToCountry")
    protected String primaryShipToCountry;
    @XmlElement(name = "PrimaryShipToFirstName")
    protected String primaryShipToFirstName;
    @XmlElement(name = "PrimaryShipToLastName")
    protected String primaryShipToLastName;
    @XmlElement(name = "PrimaryShipToPostalCode")
    protected String primaryShipToPostalCode;
    @XmlElement(name = "PrimaryShipToState")
    protected String primaryShipToState;
    @XmlElement(name = "PrimaryShipmentId")
    protected String primaryShipmentId;
    @XmlElement(name = "PriorityStatus")
    protected String priorityStatus;
    @XmlElement(name = "ProductTotal")
    protected BigDecimal productTotal;
    @XmlElement(name = "ProjectId")
    protected String projectId;
    @XmlElement(name = "ProjectIntegrationId")
    protected String projectIntegrationId;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "PromotionId")
    protected String promotionId;
    @XmlElement(name = "ProspectId")
    protected String prospectId;
    @XmlElement(name = "PurchMgrComments")
    protected String purchMgrComments;
    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "QuoteIntegrationId")
    protected String quoteIntegrationId;
    @XmlElement(name = "QuoteNumber")
    protected String quoteNumber;
    @XmlElement(name = "RecipientName")
    protected String recipientName;
    @XmlElement(name = "RequestedShipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedShipDate;
    @XmlElement(name = "ReserveTime")
    protected BigDecimal reserveTime;
    @XmlElement(name = "ReserveTimeUoM")
    protected String reserveTimeUoM;
    @XmlElement(name = "ReturnReason")
    protected String returnReason;
    @XmlElement(name = "ReturnToAccount")
    protected String returnToAccount;
    @XmlElement(name = "ReturnToAccountId")
    protected String returnToAccountId;
    @XmlElement(name = "ReturnToAccountIntegrationId")
    protected String returnToAccountIntegrationId;
    @XmlElement(name = "ReturnToAccountLocation")
    protected String returnToAccountLocation;
    @XmlElement(name = "ReturnToAddrId")
    protected String returnToAddrId;
    @XmlElement(name = "ReturnToAddressIntegrationId")
    protected String returnToAddressIntegrationId;
    @XmlElement(name = "ReturnToContactId")
    protected String returnToContactId;
    @XmlElement(name = "ReturnToContactIntegrationId")
    protected String returnToContactIntegrationId;
    @XmlElement(name = "Revision")
    protected Integer revision;
    @XmlElement(name = "SAPCreateOrderOutputBill-toCustomerNumber")
    protected String sapCreateOrderOutputBillToCustomerNumber;
    @XmlElement(name = "SAPCreateOrderOutputBill-toName")
    protected String sapCreateOrderOutputBillToName;
    @XmlElement(name = "SAPCreateOrderOutputOrderNumber")
    protected String sapCreateOrderOutputOrderNumber;
    @XmlElement(name = "SAPCreateOrderOutputReturnCode")
    protected String sapCreateOrderOutputReturnCode;
    @XmlElement(name = "SAPCreateOrderOutputReturnMessage")
    protected String sapCreateOrderOutputReturnMessage;
    @XmlElement(name = "SAPCreateOrderOutputReturnMessageFull")
    protected String sapCreateOrderOutputReturnMessageFull;
    @XmlElement(name = "SAPCreateOrderOutputReturnType")
    protected String sapCreateOrderOutputReturnType;
    @XmlElement(name = "SAPCreateOrderOutputShip-toCustomerNumber")
    protected String sapCreateOrderOutputShipToCustomerNumber;
    @XmlElement(name = "SAPCreateOrderOutputShip-toName")
    protected String sapCreateOrderOutputShipToName;
    @XmlElement(name = "SAPCreateOrderOutputSold-toCustomerNumber")
    protected String sapCreateOrderOutputSoldToCustomerNumber;
    @XmlElement(name = "SAPCreateOrderOutputSold-toName")
    protected String sapCreateOrderOutputSoldToName;
    @XmlElement(name = "SAPCreateOrderOutputSubmitDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sapCreateOrderOutputSubmitDate;
    @XmlElement(name = "SAPDistributionChannel")
    protected String sapDistributionChannel;
    @XmlElement(name = "SAPDistributionChannelMO")
    protected String sapDistributionChannelMO;
    @XmlElement(name = "SAPDivision")
    protected String sapDivision;
    @XmlElement(name = "SAPDivisionMO")
    protected String sapDivisionMO;
    @XmlElement(name = "SAPOrderStatusHeaderDeliveryBlock")
    protected String sapOrderStatusHeaderDeliveryBlock;
    @XmlElement(name = "SAPOrderStatusHeaderDeliveryStatus")
    protected String sapOrderStatusHeaderDeliveryStatus;
    @XmlElement(name = "SAPOrderStatusHeaderProcessingStatus")
    protected String sapOrderStatusHeaderProcessingStatus;
    @XmlElement(name = "SAPOrderStatusHeaderPurchaseOrderNumber")
    protected String sapOrderStatusHeaderPurchaseOrderNumber;
    @XmlElement(name = "SAPOrderStatusHeaderRequestedShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sapOrderStatusHeaderRequestedShipDate;
    @XmlElement(name = "SAPOrderStatusOutputId")
    protected String sapOrderStatusOutputId;
    @XmlElement(name = "SAPOrderStatusOutputReturnCode")
    protected String sapOrderStatusOutputReturnCode;
    @XmlElement(name = "SAPOrderStatusOutputReturnMessage")
    protected String sapOrderStatusOutputReturnMessage;
    @XmlElement(name = "SAPOrderStatusOutputReturnMessageFull")
    protected String sapOrderStatusOutputReturnMessageFull;
    @XmlElement(name = "SAPOrderStatusOutputReturnType")
    protected String sapOrderStatusOutputReturnType;
    @XmlElement(name = "SAPOrderStatusOutputUpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sapOrderStatusOutputUpdateDate;
    @XmlElement(name = "SAPOrganizationIdMO")
    protected String sapOrganizationIdMO;
    @XmlElement(name = "SAPSalesArea")
    protected String sapSalesArea;
    @XmlElement(name = "SAPSalesAreaMO")
    protected String sapSalesAreaMO;
    @XmlElement(name = "SAPSalesAreaId")
    protected String sapSalesAreaId;
    @XmlElement(name = "SAPSalesOrganization")
    protected String sapSalesOrganization;
    @XmlElement(name = "SAPSalesOrganizationMO")
    protected String sapSalesOrganizationMO;
    @XmlElement(name = "ScenarioTestFlag")
    protected Boolean scenarioTestFlag;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "ServiceAccountId")
    protected String serviceAccountId;
    @XmlElement(name = "ServiceRequestId")
    protected String serviceRequestId;
    @XmlElement(name = "ServiceRequestNumber")
    protected String serviceRequestNumber;
    @XmlElement(name = "ServiceTotal")
    protected BigDecimal serviceTotal;
    @XmlElement(name = "ShipCompleteFlag")
    protected Boolean shipCompleteFlag;
    @XmlElement(name = "ShipInstructions")
    protected String shipInstructions;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ShipToAccountConstrained")
    protected String shipToAccountConstrained;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected String shipToAccountIntegrationId;
    @XmlElement(name = "ShipToAccountLocation")
    protected String shipToAccountLocation;
    @XmlElement(name = "ShipToAddressId")
    protected String shipToAddressId;
    @XmlElement(name = "ShipToAddressIntegrationId")
    protected String shipToAddressIntegrationId;
    @XmlElement(name = "ShipToAddressSiteUseIntegrationId")
    protected String shipToAddressSiteUseIntegrationId;
    @XmlElement(name = "ShipToCity")
    protected String shipToCity;
    @XmlElement(name = "ShipToCityState")
    protected String shipToCityState;
    @XmlElement(name = "ShipToCityStateENU")
    protected String shipToCityStateENU;
    @XmlElement(name = "ShipToCityStateJPN")
    protected String shipToCityStateJPN;
    @XmlElement(name = "ShipToCityStateZip")
    protected String shipToCityStateZip;
    @XmlElement(name = "ShipToCityStateZipENU")
    protected String shipToCityStateZipENU;
    @XmlElement(name = "ShipToCityStateZipJPN")
    protected String shipToCityStateZipJPN;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected String shipToContactIntegrationId;
    @XmlElement(name = "ShipToCountry")
    protected String shipToCountry;
    @XmlElement(name = "ShipToState")
    protected String shipToState;
    @XmlElement(name = "ShipToZip")
    protected String shipToZip;
    @XmlElement(name = "ShipViaId")
    protected String shipViaId;
    @XmlElement(name = "ShopforSelfFlag")
    protected Boolean shopforSelfFlag;
    @XmlElement(name = "SingleSourceFlag")
    protected Boolean singleSourceFlag;
    @XmlElement(name = "SourceInventoryId")
    protected String sourceInventoryId;
    @XmlElement(name = "SourceInventoryLocIntegrationId")
    protected String sourceInventoryLocIntegrationId;
    @XmlElement(name = "SourceInventoryLocation")
    protected String sourceInventoryLocation;
    @XmlElement(name = "SpreadDiscount-AllProducts")
    protected Boolean spreadDiscountAllProducts;
    @XmlElement(name = "SpreadDiscount-CurrentTotal")
    protected BigDecimal spreadDiscountCurrentTotal;
    @XmlElement(name = "SpreadDiscount-ProductType")
    protected String spreadDiscountProductType;
    @XmlElement(name = "SpreadDiscount-SpreadTotal")
    protected BigDecimal spreadDiscountSpreadTotal;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SubmitDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDate;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxAmountFromRate")
    protected String taxAmountFromRate;
    @XmlElement(name = "TaxExempt")
    protected Boolean taxExempt;
    @XmlElement(name = "TaxExemptNumber")
    protected String taxExemptNumber;
    @XmlElement(name = "TaxExemptReason")
    protected String taxExemptReason;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "TaxRateFromAmount")
    protected String taxRateFromAmount;
    @XmlElement(name = "ThirdPartyTaxAmount")
    protected BigDecimal thirdPartyTaxAmount;
    @XmlElement(name = "TotalCurrentPrice")
    protected BigDecimal totalCurrentPrice;
    @XmlElement(name = "TotalFieldsActive")
    protected String totalFieldsActive;
    @XmlElement(name = "TotalListPrice")
    protected BigDecimal totalListPrice;
    @XmlElement(name = "TotalVolume")
    protected BigDecimal totalVolume;
    @XmlElement(name = "TotalVolumeUoM")
    protected String totalVolumeUoM;
    @XmlElement(name = "TotalWeight")
    protected BigDecimal totalWeight;
    @XmlElement(name = "TotalWeightUoM")
    protected String totalWeightUoM;
    @XmlElement(name = "TrainingTotal")
    protected BigDecimal trainingTotal;
    @XmlElement(name = "UltimateParentId")
    protected String ultimateParentId;
    @XmlElement(name = "UpdatedByLogin")
    protected String updatedByLogin;
    @XmlElement(name = "UserType")
    protected String userType;
    @XmlElement(name = "UserTypeB-to-B")
    protected String userTypeBToB;
    @XmlElement(name = "WebphoneOrderNumber")
    protected String webphoneOrderNumber;
    @XmlElement(name = "ListOfPayments")
    protected ListOfPaymentsData listOfPayments;
    @XmlElement(name = "ListOfOrderEntry-LineItems")
    protected ListOfOrderEntryLineItemsData listOfOrderEntryLineItems;
    @XmlAttribute(name = "operation")
    protected String operation;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the mtoPaymentRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTOPaymentRefNumber() {
        return mtoPaymentRefNumber;
    }

    /**
     * Sets the value of the mtoPaymentRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTOPaymentRefNumber(String value) {
        this.mtoPaymentRefNumber = value;
    }

    /**
     * Gets the value of the mtoOrderOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTOOrderOfficeId() {
        return mtoOrderOfficeId;
    }

    /**
     * Sets the value of the mtoOrderOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTOOrderOfficeId(String value) {
        this.mtoOrderOfficeId = value;
    }

    /**
     * Gets the value of the mtoBusinessDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMTOBusinessDate() {
        return mtoBusinessDate;
    }

    /**
     * Sets the value of the mtoBusinessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMTOBusinessDate(XMLGregorianCalendar value) {
        this.mtoBusinessDate = value;
    }

    /**
     * Gets the value of the mtoApplicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTOApplicationStatus() {
        return mtoApplicationStatus;
    }

    /**
     * Sets the value of the mtoApplicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTOApplicationStatus(String value) {
        this.mtoApplicationStatus = value;
    }

    /**
     * Gets the value of the mtoAccountSCBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTOAccountSCBalance() {
        return mtoAccountSCBalance;
    }

    /**
     * Sets the value of the mtoAccountSCBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTOAccountSCBalance(BigDecimal value) {
        this.mtoAccountSCBalance = value;
    }

    /**
     * Gets the value of the mtoAccountPrepaidBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTOAccountPrepaidBalance() {
        return mtoAccountPrepaidBalance;
    }

    /**
     * Sets the value of the mtoAccountPrepaidBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTOAccountPrepaidBalance(BigDecimal value) {
        this.mtoAccountPrepaidBalance = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the atpMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPMessage() {
        return atpMessage;
    }

    /**
     * Sets the value of the atpMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPMessage(String value) {
        this.atpMessage = value;
    }

    /**
     * Gets the value of the atpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPStatus() {
        return atpStatus;
    }

    /**
     * Sets the value of the atpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPStatus(String value) {
        this.atpStatus = value;
    }

    /**
     * Gets the value of the atpStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATPStatusAsOfDate() {
        return atpStatusAsOfDate;
    }

    /**
     * Sets the value of the atpStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATPStatusAsOfDate(XMLGregorianCalendar value) {
        this.atpStatusAsOfDate = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAddressId() {
        return accountAddressId;
    }

    /**
     * Sets the value of the accountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAddressId(String value) {
        this.accountAddressId = value;
    }

    /**
     * Gets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountContractedProductsOnlyFlag() {
        return accountContractedProductsOnlyFlag;
    }

    /**
     * Sets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountContractedProductsOnlyFlag(Boolean value) {
        this.accountContractedProductsOnlyFlag = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIntegrationId(String value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the accountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLocation() {
        return accountLocation;
    }

    /**
     * Sets the value of the accountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLocation(String value) {
        this.accountLocation = value;
    }

    /**
     * Gets the value of the accountOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOrderNumber() {
        return accountOrderNumber;
    }

    /**
     * Sets the value of the accountOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOrderNumber(String value) {
        this.accountOrderNumber = value;
    }

    /**
     * Gets the value of the accountOrderNumberOLD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOrderNumberOLD() {
        return accountOrderNumberOLD;
    }

    /**
     * Sets the value of the accountOrderNumberOLD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOrderNumberOLD(String value) {
        this.accountOrderNumberOLD = value;
    }

    /**
     * Gets the value of the accountPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPriceListId() {
        return accountPriceListId;
    }

    /**
     * Sets the value of the accountPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPriceListId(String value) {
        this.accountPriceListId = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

    /**
     * Gets the value of the agreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementId() {
        return agreementId;
    }

    /**
     * Sets the value of the agreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementId(String value) {
        this.agreementId = value;
    }

    /**
     * Gets the value of the agreementIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementIntegrationId() {
        return agreementIntegrationId;
    }

    /**
     * Sets the value of the agreementIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementIntegrationId(String value) {
        this.agreementIntegrationId = value;
    }

    /**
     * Gets the value of the agreementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementName() {
        return agreementName;
    }

    /**
     * Sets the value of the agreementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementName(String value) {
        this.agreementName = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the approvedByEmpLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedByEmpLogin() {
        return approvedByEmpLogin;
    }

    /**
     * Sets the value of the approvedByEmpLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedByEmpLogin(String value) {
        this.approvedByEmpLogin = value;
    }

    /**
     * Gets the value of the approvedByEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedByEmployeeId() {
        return approvedByEmployeeId;
    }

    /**
     * Sets the value of the approvedByEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedByEmployeeId(String value) {
        this.approvedByEmployeeId = value;
    }

    /**
     * Gets the value of the approvedByPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedByPositionId() {
        return approvedByPositionId;
    }

    /**
     * Sets the value of the approvedByPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedByPositionId(String value) {
        this.approvedByPositionId = value;
    }

    /**
     * Gets the value of the approvedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedByDate() {
        return approvedByDate;
    }

    /**
     * Sets the value of the approvedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedByDate(XMLGregorianCalendar value) {
        this.approvedByDate = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the autoReceiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoReceiveFlag() {
        return autoReceiveFlag;
    }

    /**
     * Sets the value of the autoReceiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoReceiveFlag(Boolean value) {
        this.autoReceiveFlag = value;
    }

    /**
     * Gets the value of the availableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableDate(XMLGregorianCalendar value) {
        this.availableDate = value;
    }

    /**
     * Gets the value of the backOfficeErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOfficeErrorText() {
        return backOfficeErrorText;
    }

    /**
     * Sets the value of the backOfficeErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOfficeErrorText(String value) {
        this.backOfficeErrorText = value;
    }

    /**
     * Gets the value of the backOfficeOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOfficeOrderNumber() {
        return backOfficeOrderNumber;
    }

    /**
     * Sets the value of the backOfficeOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOfficeOrderNumber(String value) {
        this.backOfficeOrderNumber = value;
    }

    /**
     * Gets the value of the backOfficeProcessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOfficeProcessStatus() {
        return backOfficeProcessStatus;
    }

    /**
     * Sets the value of the backOfficeProcessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOfficeProcessStatus(String value) {
        this.backOfficeProcessStatus = value;
    }

    /**
     * Gets the value of the billToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCounty() {
        return billToCounty;
    }

    /**
     * Sets the value of the billToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCounty(String value) {
        this.billToCounty = value;
    }

    /**
     * Gets the value of the billToProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToProvince() {
        return billToProvince;
    }

    /**
     * Sets the value of the billToProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToProvince(String value) {
        this.billToProvince = value;
    }

    /**
     * Gets the value of the billToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccount() {
        return billToAccount;
    }

    /**
     * Sets the value of the billToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccount(String value) {
        this.billToAccount = value;
    }

    /**
     * Gets the value of the billToAccountConstrained property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountConstrained() {
        return billToAccountConstrained;
    }

    /**
     * Sets the value of the billToAccountConstrained property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountConstrained(String value) {
        this.billToAccountConstrained = value;
    }

    /**
     * Gets the value of the billToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountId() {
        return billToAccountId;
    }

    /**
     * Sets the value of the billToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountId(String value) {
        this.billToAccountId = value;
    }

    /**
     * Gets the value of the billToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountIntegrationId() {
        return billToAccountIntegrationId;
    }

    /**
     * Sets the value of the billToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountIntegrationId(String value) {
        this.billToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the billToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountLocation() {
        return billToAccountLocation;
    }

    /**
     * Sets the value of the billToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountLocation(String value) {
        this.billToAccountLocation = value;
    }

    /**
     * Gets the value of the billToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressId() {
        return billToAddressId;
    }

    /**
     * Sets the value of the billToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressId(String value) {
        this.billToAddressId = value;
    }

    /**
     * Gets the value of the billToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressIntegrationId() {
        return billToAddressIntegrationId;
    }

    /**
     * Sets the value of the billToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressIntegrationId(String value) {
        this.billToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the billToAddressSiteUseIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressSiteUseIntegrationId() {
        return billToAddressSiteUseIntegrationId;
    }

    /**
     * Sets the value of the billToAddressSiteUseIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressSiteUseIntegrationId(String value) {
        this.billToAddressSiteUseIntegrationId = value;
    }

    /**
     * Gets the value of the billToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCityState() {
        return billToCityState;
    }

    /**
     * Sets the value of the billToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCityState(String value) {
        this.billToCityState = value;
    }

    /**
     * Gets the value of the billToCityStateENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCityStateENU() {
        return billToCityStateENU;
    }

    /**
     * Sets the value of the billToCityStateENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCityStateENU(String value) {
        this.billToCityStateENU = value;
    }

    /**
     * Gets the value of the billToCityStateJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCityStateJPN() {
        return billToCityStateJPN;
    }

    /**
     * Sets the value of the billToCityStateJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCityStateJPN(String value) {
        this.billToCityStateJPN = value;
    }

    /**
     * Gets the value of the billToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCityStateZip() {
        return billToCityStateZip;
    }

    /**
     * Sets the value of the billToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCityStateZip(String value) {
        this.billToCityStateZip = value;
    }

    /**
     * Gets the value of the billToCityStateZipENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCityStateZipENU() {
        return billToCityStateZipENU;
    }

    /**
     * Sets the value of the billToCityStateZipENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCityStateZipENU(String value) {
        this.billToCityStateZipENU = value;
    }

    /**
     * Gets the value of the billToCityStateZipJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCityStateZipJPN() {
        return billToCityStateZipJPN;
    }

    /**
     * Sets the value of the billToCityStateZipJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCityStateZipJPN(String value) {
        this.billToCityStateZipJPN = value;
    }

    /**
     * Gets the value of the billToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToContactId() {
        return billToContactId;
    }

    /**
     * Sets the value of the billToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToContactId(String value) {
        this.billToContactId = value;
    }

    /**
     * Gets the value of the billToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToContactIntegrationId() {
        return billToContactIntegrationId;
    }

    /**
     * Sets the value of the billToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToContactIntegrationId(String value) {
        this.billToContactIntegrationId = value;
    }

    /**
     * Gets the value of the billToDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToDUNSNumber() {
        return billToDUNSNumber;
    }

    /**
     * Sets the value of the billToDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToDUNSNumber(String value) {
        this.billToDUNSNumber = value;
    }

    /**
     * Gets the value of the billToVATRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToVATRegistrationNumber() {
        return billToVATRegistrationNumber;
    }

    /**
     * Sets the value of the billToVATRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToVATRegistrationNumber(String value) {
        this.billToVATRegistrationNumber = value;
    }

    /**
     * Gets the value of the billableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillableFlag() {
        return billableFlag;
    }

    /**
     * Sets the value of the billableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillableFlag(Boolean value) {
        this.billableFlag = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccount(String value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountId(String value) {
        this.billingAccountId = value;
    }

    /**
     * Gets the value of the billingBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingBlock() {
        return billingBlock;
    }

    /**
     * Sets the value of the billingBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingBlock(String value) {
        this.billingBlock = value;
    }

    /**
     * Gets the value of the byAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getByAge() {
        return byAge;
    }

    /**
     * Sets the value of the byAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setByAge(Integer value) {
        this.byAge = value;
    }

    /**
     * Gets the value of the calculatedCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedCustomerId() {
        return calculatedCustomerId;
    }

    /**
     * Sets the value of the calculatedCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedCustomerId(String value) {
        this.calculatedCustomerId = value;
    }

    /**
     * Gets the value of the calculatedOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedOrderType() {
        return calculatedOrderType;
    }

    /**
     * Sets the value of the calculatedOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedOrderType(String value) {
        this.calculatedOrderType = value;
    }

    /**
     * Gets the value of the campConId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampConId() {
        return campConId;
    }

    /**
     * Sets the value of the campConId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampConId(String value) {
        this.campConId = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignIntegrationId() {
        return campaignIntegrationId;
    }

    /**
     * Sets the value of the campaignIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignIntegrationId(String value) {
        this.campaignIntegrationId = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierPriority(String value) {
        this.carrierPriority = value;
    }

    /**
     * Gets the value of the carrierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Sets the value of the carrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierType(String value) {
        this.carrierType = value;
    }

    /**
     * Gets the value of the changedSinceLastExportToTransactionWorkbook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedSinceLastExportToTransactionWorkbook() {
        return changedSinceLastExportToTransactionWorkbook;
    }

    /**
     * Sets the value of the changedSinceLastExportToTransactionWorkbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedSinceLastExportToTransactionWorkbook(Boolean value) {
        this.changedSinceLastExportToTransactionWorkbook = value;
    }

    /**
     * Gets the value of the chargedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargedFlag() {
        return chargedFlag;
    }

    /**
     * Sets the value of the chargedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargedFlag(Boolean value) {
        this.chargedFlag = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheck(Boolean value) {
        this.check = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundProductNumber(String value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the contactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Sets the value of the contactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmailAddress(String value) {
        this.contactEmailAddress = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIntegrationId() {
        return contactIntegrationId;
    }

    /**
     * Sets the value of the contactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIntegrationId(String value) {
        this.contactIntegrationId = value;
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the contactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactWorkPhone() {
        return contactWorkPhone;
    }

    /**
     * Sets the value of the contactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactWorkPhone(String value) {
        this.contactWorkPhone = value;
    }

    /**
     * Gets the value of the createdByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * Sets the value of the createdByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByName(String value) {
        this.createdByName = value;
    }

    /**
     * Gets the value of the creditAssignmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAssignmentDescription() {
        return creditAssignmentDescription;
    }

    /**
     * Sets the value of the creditAssignmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAssignmentDescription(String value) {
        this.creditAssignmentDescription = value;
    }

    /**
     * Gets the value of the creditAssignmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAssignmentStatus() {
        return creditAssignmentStatus;
    }

    /**
     * Sets the value of the creditAssignmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAssignmentStatus(String value) {
        this.creditAssignmentStatus = value;
    }

    /**
     * Gets the value of the creditCardApprovalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardApprovalCode() {
        return creditCardApprovalCode;
    }

    /**
     * Sets the value of the creditCardApprovalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardApprovalCode(String value) {
        this.creditCardApprovalCode = value;
    }

    /**
     * Gets the value of the creditCardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    /**
     * Sets the value of the creditCardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditCardExpirationDate(XMLGregorianCalendar value) {
        this.creditCardExpirationDate = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationMonth(String value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationYear(String value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the creditCardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardHolder() {
        return creditCardHolder;
    }

    /**
     * Sets the value of the creditCardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardHolder(String value) {
        this.creditCardHolder = value;
    }

    /**
     * Gets the value of the creditCardMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardMerchantId() {
        return creditCardMerchantId;
    }

    /**
     * Sets the value of the creditCardMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardMerchantId(String value) {
        this.creditCardMerchantId = value;
    }

    /**
     * Gets the value of the creditCardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardName() {
        return creditCardName;
    }

    /**
     * Sets the value of the creditCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardName(String value) {
        this.creditCardName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumberDisplay() {
        return creditCardNumberDisplay;
    }

    /**
     * Sets the value of the creditCardNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumberDisplay(String value) {
        this.creditCardNumberDisplay = value;
    }

    /**
     * Gets the value of the creditCardNumberReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumberReadOnly() {
        return creditCardNumberReadOnly;
    }

    /**
     * Sets the value of the creditCardNumberReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumberReadOnly(String value) {
        this.creditCardNumberReadOnly = value;
    }

    /**
     * Gets the value of the creditCardNumberKeyIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumberKeyIndex() {
        return creditCardNumberKeyIndex;
    }

    /**
     * Sets the value of the creditCardNumberKeyIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumberKeyIndex(String value) {
        this.creditCardNumberKeyIndex = value;
    }

    /**
     * Gets the value of the creditCardTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardTransactionAmount() {
        return creditCardTransactionAmount;
    }

    /**
     * Sets the value of the creditCardTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardTransactionAmount(BigDecimal value) {
        this.creditCardTransactionAmount = value;
    }

    /**
     * Gets the value of the creditCardTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardTransactionID() {
        return creditCardTransactionID;
    }

    /**
     * Sets the value of the creditCardTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardTransactionID(String value) {
        this.creditCardTransactionID = value;
    }

    /**
     * Gets the value of the creditCardTransactionResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardTransactionResponseCode() {
        return creditCardTransactionResponseCode;
    }

    /**
     * Sets the value of the creditCardTransactionResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardTransactionResponseCode(String value) {
        this.creditCardTransactionResponseCode = value;
    }

    /**
     * Gets the value of the creditCardTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardTransactionStatus() {
        return creditCardTransactionStatus;
    }

    /**
     * Sets the value of the creditCardTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardTransactionStatus(String value) {
        this.creditCardTransactionStatus = value;
    }

    /**
     * Gets the value of the creditCardTransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditCardTransactionTime() {
        return creditCardTransactionTime;
    }

    /**
     * Sets the value of the creditCardTransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditCardTransactionTime(XMLGregorianCalendar value) {
        this.creditCardTransactionTime = value;
    }

    /**
     * Gets the value of the creditCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckMessage() {
        return creditCheckMessage;
    }

    /**
     * Sets the value of the creditCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckMessage(String value) {
        this.creditCheckMessage = value;
    }

    /**
     * Gets the value of the creditCheckSkipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditCheckSkipFlag() {
        return creditCheckSkipFlag;
    }

    /**
     * Sets the value of the creditCheckSkipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditCheckSkipFlag(Boolean value) {
        this.creditCheckSkipFlag = value;
    }

    /**
     * Gets the value of the creditCheckSkipThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCheckSkipThreshold() {
        return creditCheckSkipThreshold;
    }

    /**
     * Sets the value of the creditCheckSkipThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCheckSkipThreshold(BigDecimal value) {
        this.creditCheckSkipThreshold = value;
    }

    /**
     * Gets the value of the creditCheckSkipThresholdCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckSkipThresholdCurrencyCode() {
        return creditCheckSkipThresholdCurrencyCode;
    }

    /**
     * Sets the value of the creditCheckSkipThresholdCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckSkipThresholdCurrencyCode(String value) {
        this.creditCheckSkipThresholdCurrencyCode = value;
    }

    /**
     * Gets the value of the creditCheckStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckStatus() {
        return creditCheckStatus;
    }

    /**
     * Sets the value of the creditCheckStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckStatus(String value) {
        this.creditCheckStatus = value;
    }

    /**
     * Gets the value of the creditCheckStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditCheckStatusAsOfDate() {
        return creditCheckStatusAsOfDate;
    }

    /**
     * Sets the value of the creditCheckStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditCheckStatusAsOfDate(XMLGregorianCalendar value) {
        this.creditCheckStatusAsOfDate = value;
    }

    /**
     * Gets the value of the creditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditStatus() {
        return creditStatus;
    }

    /**
     * Sets the value of the creditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditStatus(Boolean value) {
        this.creditStatus = value;
    }

    /**
     * Gets the value of the creditSubmissionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditSubmissionTime() {
        return creditSubmissionTime;
    }

    /**
     * Sets the value of the creditSubmissionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditSubmissionTime(XMLGregorianCalendar value) {
        this.creditSubmissionTime = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currentOrderShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToCity() {
        return currentOrderShipToCity;
    }

    /**
     * Sets the value of the currentOrderShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToCity(String value) {
        this.currentOrderShipToCity = value;
    }

    /**
     * Gets the value of the currentOrderShipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToCityState() {
        return currentOrderShipToCityState;
    }

    /**
     * Sets the value of the currentOrderShipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToCityState(String value) {
        this.currentOrderShipToCityState = value;
    }

    /**
     * Gets the value of the currentOrderShipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToCityStateZip() {
        return currentOrderShipToCityStateZip;
    }

    /**
     * Sets the value of the currentOrderShipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToCityStateZip(String value) {
        this.currentOrderShipToCityStateZip = value;
    }

    /**
     * Gets the value of the currentOrderShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToCountry() {
        return currentOrderShipToCountry;
    }

    /**
     * Sets the value of the currentOrderShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToCountry(String value) {
        this.currentOrderShipToCountry = value;
    }

    /**
     * Gets the value of the currentOrderShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToPostalCode() {
        return currentOrderShipToPostalCode;
    }

    /**
     * Sets the value of the currentOrderShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToPostalCode(String value) {
        this.currentOrderShipToPostalCode = value;
    }

    /**
     * Gets the value of the currentOrderShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToState() {
        return currentOrderShipToState;
    }

    /**
     * Sets the value of the currentOrderShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToState(String value) {
        this.currentOrderShipToState = value;
    }

    /**
     * Gets the value of the currentOrderShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToStreetAddress() {
        return currentOrderShipToStreetAddress;
    }

    /**
     * Sets the value of the currentOrderShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToStreetAddress(String value) {
        this.currentOrderShipToStreetAddress = value;
    }

    /**
     * Gets the value of the currentOrderShipToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrderShipToStreetAddress2() {
        return currentOrderShipToStreetAddress2;
    }

    /**
     * Sets the value of the currentOrderShipToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrderShipToStreetAddress2(String value) {
        this.currentOrderShipToStreetAddress2 = value;
    }

    /**
     * Gets the value of the currentOrderTotalBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentOrderTotalBasePrice() {
        return currentOrderTotalBasePrice;
    }

    /**
     * Sets the value of the currentOrderTotalBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentOrderTotalBasePrice(BigDecimal value) {
        this.currentOrderTotalBasePrice = value;
    }

    /**
     * Gets the value of the currentOrderTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentOrderTotalDiscount() {
        return currentOrderTotalDiscount;
    }

    /**
     * Sets the value of the currentOrderTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentOrderTotalDiscount(BigDecimal value) {
        this.currentOrderTotalDiscount = value;
    }

    /**
     * Gets the value of the currentOrderTotalItemDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentOrderTotalItemDiscount() {
        return currentOrderTotalItemDiscount;
    }

    /**
     * Sets the value of the currentOrderTotalItemDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentOrderTotalItemDiscount(BigDecimal value) {
        this.currentOrderTotalItemDiscount = value;
    }

    /**
     * Gets the value of the currentOrderTotalNetDiscountPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentOrderTotalNetDiscountPrice() {
        return currentOrderTotalNetDiscountPrice;
    }

    /**
     * Sets the value of the currentOrderTotalNetDiscountPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentOrderTotalNetDiscountPrice(BigDecimal value) {
        this.currentOrderTotalNetDiscountPrice = value;
    }

    /**
     * Gets the value of the currentOrderTotalNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentOrderTotalNetPrice() {
        return currentOrderTotalNetPrice;
    }

    /**
     * Sets the value of the currentOrderTotalNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentOrderTotalNetPrice(BigDecimal value) {
        this.currentOrderTotalNetPrice = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the deliveryBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryBlock() {
        return deliveryBlock;
    }

    /**
     * Sets the value of the deliveryBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryBlock(String value) {
        this.deliveryBlock = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the destinationInventoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryId() {
        return destinationInventoryId;
    }

    /**
     * Sets the value of the destinationInventoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryId(String value) {
        this.destinationInventoryId = value;
    }

    /**
     * Gets the value of the destinationInventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryLocation() {
        return destinationInventoryLocation;
    }

    /**
     * Sets the value of the destinationInventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryLocation(String value) {
        this.destinationInventoryLocation = value;
    }

    /**
     * Gets the value of the destinationInventoryLocationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryLocationIntegrationId() {
        return destinationInventoryLocationIntegrationId;
    }

    /**
     * Sets the value of the destinationInventoryLocationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryLocationIntegrationId(String value) {
        this.destinationInventoryLocationIntegrationId = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountAmountMRC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmountMRC() {
        return discountAmountMRC;
    }

    /**
     * Sets the value of the discountAmountMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmountMRC(BigDecimal value) {
        this.discountAmountMRC = value;
    }

    /**
     * Gets the value of the discountPercentMRC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercentMRC() {
        return discountPercentMRC;
    }

    /**
     * Sets the value of the discountPercentMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercentMRC(BigDecimal value) {
        this.discountPercentMRC = value;
    }

    /**
     * Gets the value of the discountReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReason() {
        return discountReason;
    }

    /**
     * Sets the value of the discountReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReason(String value) {
        this.discountReason = value;
    }

    /**
     * Gets the value of the eaiSyncDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEAISyncDate() {
        return eaiSyncDate;
    }

    /**
     * Sets the value of the eaiSyncDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEAISyncDate(XMLGregorianCalendar value) {
        this.eaiSyncDate = value;
    }

    /**
     * Gets the value of the eligibilityCompatibilityProcedureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCompatibilityProcedureName() {
        return eligibilityCompatibilityProcedureName;
    }

    /**
     * Sets the value of the eligibilityCompatibilityProcedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCompatibilityProcedureName(String value) {
        this.eligibilityCompatibilityProcedureName = value;
    }

    /**
     * Gets the value of the entitlementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementId() {
        return entitlementId;
    }

    /**
     * Sets the value of the entitlementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementId(String value) {
        this.entitlementId = value;
    }

    /**
     * Gets the value of the entitlementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementName() {
        return entitlementName;
    }

    /**
     * Sets the value of the entitlementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementName(String value) {
        this.entitlementName = value;
    }

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeDate(XMLGregorianCalendar value) {
        this.exchangeDate = value;
    }

    /**
     * Gets the value of the exportedOnceToTransactionWorkbook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportedOnceToTransactionWorkbook() {
        return exportedOnceToTransactionWorkbook;
    }

    /**
     * Sets the value of the exportedOnceToTransactionWorkbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportedOnceToTransactionWorkbook(Boolean value) {
        this.exportedOnceToTransactionWorkbook = value;
    }

    /**
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreight(BigDecimal value) {
        this.freight = value;
    }

    /**
     * Gets the value of the freightAmountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightAmountCurrencyCode() {
        return freightAmountCurrencyCode;
    }

    /**
     * Sets the value of the freightAmountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightAmountCurrencyCode(String value) {
        this.freightAmountCurrencyCode = value;
    }

    /**
     * Gets the value of the freightAmountDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFreightAmountDate() {
        return freightAmountDate;
    }

    /**
     * Sets the value of the freightAmountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFreightAmountDate(XMLGregorianCalendar value) {
        this.freightAmountDate = value;
    }

    /**
     * Gets the value of the freightTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightTerms() {
        return freightTerms;
    }

    /**
     * Sets the value of the freightTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightTerms(String value) {
        this.freightTerms = value;
    }

    /**
     * Gets the value of the freightTermsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightTermsInfo() {
        return freightTermsInfo;
    }

    /**
     * Sets the value of the freightTermsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightTermsInfo(String value) {
        this.freightTermsInfo = value;
    }

    /**
     * Gets the value of the freightTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightTotal() {
        return freightTotal;
    }

    /**
     * Sets the value of the freightTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightTotal(BigDecimal value) {
        this.freightTotal = value;
    }

    /**
     * Gets the value of the fulfillLockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFulfillLockFlag() {
        return fulfillLockFlag;
    }

    /**
     * Sets the value of the fulfillLockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFulfillLockFlag(Boolean value) {
        this.fulfillLockFlag = value;
    }

    /**
     * Gets the value of the hierarchyVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyVersionId() {
        return hierarchyVersionId;
    }

    /**
     * Sets the value of the hierarchyVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyVersionId(String value) {
        this.hierarchyVersionId = value;
    }

    /**
     * Gets the value of the holdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldFlag() {
        return holdFlag;
    }

    /**
     * Sets the value of the holdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldFlag(Boolean value) {
        this.holdFlag = value;
    }

    /**
     * Gets the value of the incentiveCompensationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncentiveCompensationStatus() {
        return incentiveCompensationStatus;
    }

    /**
     * Sets the value of the incentiveCompensationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncentiveCompensationStatus(String value) {
        this.incentiveCompensationStatus = value;
    }

    /**
     * Gets the value of the incentiveCompensationStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncentiveCompensationStatusDate() {
        return incentiveCompensationStatusDate;
    }

    /**
     * Sets the value of the incentiveCompensationStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncentiveCompensationStatusDate(XMLGregorianCalendar value) {
        this.incentiveCompensationStatusDate = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the internalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInternalTaxAmount() {
        return internalTaxAmount;
    }

    /**
     * Sets the value of the internalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInternalTaxAmount(BigDecimal value) {
        this.internalTaxAmount = value;
    }

    /**
     * Gets the value of the iseChannelShopForMyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIseChannelShopForMyAccount() {
        return iseChannelShopForMyAccount;
    }

    /**
     * Sets the value of the iseChannelShopForMyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIseChannelShopForMyAccount(Boolean value) {
        this.iseChannelShopForMyAccount = value;
    }

    /**
     * Gets the value of the isAdminMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdminMode() {
        return isAdminMode;
    }

    /**
     * Sets the value of the isAdminMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdminMode(Boolean value) {
        this.isAdminMode = value;
    }

    /**
     * Gets the value of the loadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoadNumber() {
        return loadNumber;
    }

    /**
     * Sets the value of the loadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoadNumber(Integer value) {
        this.loadNumber = value;
    }

    /**
     * Gets the value of the mrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRCTotal() {
        return mrcTotal;
    }

    /**
     * Sets the value of the mrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRCTotal(BigDecimal value) {
        this.mrcTotal = value;
    }

    /**
     * Gets the value of the maxRevisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRevisionNumber() {
        return maxRevisionNumber;
    }

    /**
     * Sets the value of the maxRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRevisionNumber(String value) {
        this.maxRevisionNumber = value;
    }

    /**
     * Gets the value of the mediaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets the value of the mediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaId(String value) {
        this.mediaId = value;
    }

    /**
     * Gets the value of the movedToTransactionWorkbook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMovedToTransactionWorkbook() {
        return movedToTransactionWorkbook;
    }

    /**
     * Sets the value of the movedToTransactionWorkbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMovedToTransactionWorkbook(Boolean value) {
        this.movedToTransactionWorkbook = value;
    }

    /**
     * Gets the value of the nrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCTotal() {
        return nrcTotal;
    }

    /**
     * Sets the value of the nrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCTotal(BigDecimal value) {
        this.nrcTotal = value;
    }

    /**
     * Gets the value of the numberofShipments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberofShipments() {
        return numberofShipments;
    }

    /**
     * Sets the value of the numberofShipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberofShipments(String value) {
        this.numberofShipments = value;
    }

    /**
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity(String value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyId(String value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the optyIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyIntegrationId() {
        return optyIntegrationId;
    }

    /**
     * Sets the value of the optyIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyIntegrationId(String value) {
        this.optyIntegrationId = value;
    }

    /**
     * Gets the value of the optyPrimaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyPrimaryPositionId() {
        return optyPrimaryPositionId;
    }

    /**
     * Sets the value of the optyPrimaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyPrimaryPositionId(String value) {
        this.optyPrimaryPositionId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemQuantity() {
        return orderItemQuantity;
    }

    /**
     * Sets the value of the orderItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemQuantity(String value) {
        this.orderItemQuantity = value;
    }

    /**
     * Gets the value of the orderLateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderLateFlag() {
        return orderLateFlag;
    }

    /**
     * Sets the value of the orderLateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderLateFlag(Boolean value) {
        this.orderLateFlag = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPriority(String value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderTotal(BigDecimal value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * Sets the value of the orderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeCode(String value) {
        this.orderTypeCode = value;
    }

    /**
     * Gets the value of the orderTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeId() {
        return orderTypeId;
    }

    /**
     * Sets the value of the orderTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeId(String value) {
        this.orderTypeId = value;
    }

    /**
     * Gets the value of the orderTypeLIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeLIC() {
        return orderTypeLIC;
    }

    /**
     * Sets the value of the orderTypeLIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeLIC(String value) {
        this.orderTypeLIC = value;
    }

    /**
     * Gets the value of the organizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationIntegrationId() {
        return organizationIntegrationId;
    }

    /**
     * Sets the value of the organizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationIntegrationId(String value) {
        this.organizationIntegrationId = value;
    }

    /**
     * Gets the value of the overrideOwnerinReorderProcess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideOwnerinReorderProcess() {
        return overrideOwnerinReorderProcess;
    }

    /**
     * Sets the value of the overrideOwnerinReorderProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideOwnerinReorderProcess(Boolean value) {
        this.overrideOwnerinReorderProcess = value;
    }

    /**
     * Gets the value of the poAutoApproveLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOAutoApproveLimit() {
        return poAutoApproveLimit;
    }

    /**
     * Sets the value of the poAutoApproveLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOAutoApproveLimit(BigDecimal value) {
        this.poAutoApproveLimit = value;
    }

    /**
     * Gets the value of the poEditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOEditable() {
        return poEditable;
    }

    /**
     * Sets the value of the poEditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOEditable(Boolean value) {
        this.poEditable = value;
    }

    /**
     * Gets the value of the poEditableStatus1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOEditableStatus1() {
        return poEditableStatus1;
    }

    /**
     * Sets the value of the poEditableStatus1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOEditableStatus1(Boolean value) {
        this.poEditableStatus1 = value;
    }

    /**
     * Gets the value of the poEditableStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOEditableStatus2() {
        return poEditableStatus2;
    }

    /**
     * Sets the value of the poEditableStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOEditableStatus2(Boolean value) {
        this.poEditableStatus2 = value;
    }

    /**
     * Gets the value of the parentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderId() {
        return parentOrderId;
    }

    /**
     * Sets the value of the parentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderId(String value) {
        this.parentOrderId = value;
    }

    /**
     * Gets the value of the partialShip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialShip() {
        return partialShip;
    }

    /**
     * Sets the value of the partialShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialShip(Boolean value) {
        this.partialShip = value;
    }

    /**
     * Gets the value of the payToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccount() {
        return payToAccount;
    }

    /**
     * Sets the value of the payToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccount(String value) {
        this.payToAccount = value;
    }

    /**
     * Gets the value of the payToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccountId() {
        return payToAccountId;
    }

    /**
     * Sets the value of the payToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccountId(String value) {
        this.payToAccountId = value;
    }

    /**
     * Gets the value of the payToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccountIntegrationId() {
        return payToAccountIntegrationId;
    }

    /**
     * Sets the value of the payToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccountIntegrationId(String value) {
        this.payToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the payToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccountLocation() {
        return payToAccountLocation;
    }

    /**
     * Sets the value of the payToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccountLocation(String value) {
        this.payToAccountLocation = value;
    }

    /**
     * Gets the value of the payToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAddressId() {
        return payToAddressId;
    }

    /**
     * Sets the value of the payToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAddressId(String value) {
        this.payToAddressId = value;
    }

    /**
     * Gets the value of the payToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAddressIntegrationId() {
        return payToAddressIntegrationId;
    }

    /**
     * Sets the value of the payToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAddressIntegrationId(String value) {
        this.payToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the payToContactFirstLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactFirstLastName() {
        return payToContactFirstLastName;
    }

    /**
     * Sets the value of the payToContactFirstLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactFirstLastName(String value) {
        this.payToContactFirstLastName = value;
    }

    /**
     * Gets the value of the payToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactId() {
        return payToContactId;
    }

    /**
     * Sets the value of the payToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactId(String value) {
        this.payToContactId = value;
    }

    /**
     * Gets the value of the payToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactIntegrationId() {
        return payToContactIntegrationId;
    }

    /**
     * Sets the value of the payToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactIntegrationId(String value) {
        this.payToContactIntegrationId = value;
    }

    /**
     * Gets the value of the payToContactLastFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactLastFirstName() {
        return payToContactLastFirstName;
    }

    /**
     * Sets the value of the payToContactLastFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactLastFirstName(String value) {
        this.payToContactLastFirstName = value;
    }

    /**
     * Gets the value of the payToContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactName() {
        return payToContactName;
    }

    /**
     * Sets the value of the payToContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactName(String value) {
        this.payToContactName = value;
    }

    /**
     * Gets the value of the payerAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAccountIntegrationId() {
        return payerAccountIntegrationId;
    }

    /**
     * Sets the value of the payerAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAccountIntegrationId(String value) {
        this.payerAccountIntegrationId = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerm(String value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the paymentTermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermId() {
        return paymentTermId;
    }

    /**
     * Sets the value of the paymentTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermId(String value) {
        this.paymentTermId = value;
    }

    /**
     * Gets the value of the paymentTermIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermIntegrationId() {
        return paymentTermIntegrationId;
    }

    /**
     * Sets the value of the paymentTermIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermIntegrationId(String value) {
        this.paymentTermIntegrationId = value;
    }

    /**
     * Gets the value of the personalBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToAddressId() {
        return personalBillToAddressId;
    }

    /**
     * Sets the value of the personalBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToAddressId(String value) {
        this.personalBillToAddressId = value;
    }

    /**
     * Gets the value of the personalBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToCity() {
        return personalBillToCity;
    }

    /**
     * Sets the value of the personalBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToCity(String value) {
        this.personalBillToCity = value;
    }

    /**
     * Gets the value of the personalBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToCountry() {
        return personalBillToCountry;
    }

    /**
     * Sets the value of the personalBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToCountry(String value) {
        this.personalBillToCountry = value;
    }

    /**
     * Gets the value of the personalBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToPostalCode() {
        return personalBillToPostalCode;
    }

    /**
     * Sets the value of the personalBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToPostalCode(String value) {
        this.personalBillToPostalCode = value;
    }

    /**
     * Gets the value of the personalBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToState() {
        return personalBillToState;
    }

    /**
     * Sets the value of the personalBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToState(String value) {
        this.personalBillToState = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToStreetAddress() {
        return personalBillToStreetAddress;
    }

    /**
     * Sets the value of the personalBillToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToStreetAddress(String value) {
        this.personalBillToStreetAddress = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToStreetAddress2() {
        return personalBillToStreetAddress2;
    }

    /**
     * Sets the value of the personalBillToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToStreetAddress2(String value) {
        this.personalBillToStreetAddress2 = value;
    }

    /**
     * Gets the value of the personalShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddressId() {
        return personalShipToAddressId;
    }

    /**
     * Sets the value of the personalShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddressId(String value) {
        this.personalShipToAddressId = value;
    }

    /**
     * Gets the value of the personalShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCity() {
        return personalShipToCity;
    }

    /**
     * Sets the value of the personalShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCity(String value) {
        this.personalShipToCity = value;
    }

    /**
     * Gets the value of the personalShipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCityState() {
        return personalShipToCityState;
    }

    /**
     * Sets the value of the personalShipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCityState(String value) {
        this.personalShipToCityState = value;
    }

    /**
     * Gets the value of the personalShipToCityStateENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCityStateENU() {
        return personalShipToCityStateENU;
    }

    /**
     * Sets the value of the personalShipToCityStateENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCityStateENU(String value) {
        this.personalShipToCityStateENU = value;
    }

    /**
     * Gets the value of the personalShipToCityStateJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCityStateJPN() {
        return personalShipToCityStateJPN;
    }

    /**
     * Sets the value of the personalShipToCityStateJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCityStateJPN(String value) {
        this.personalShipToCityStateJPN = value;
    }

    /**
     * Gets the value of the personalShipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCityStateZip() {
        return personalShipToCityStateZip;
    }

    /**
     * Sets the value of the personalShipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCityStateZip(String value) {
        this.personalShipToCityStateZip = value;
    }

    /**
     * Gets the value of the personalShipToCityStateZipENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCityStateZipENU() {
        return personalShipToCityStateZipENU;
    }

    /**
     * Sets the value of the personalShipToCityStateZipENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCityStateZipENU(String value) {
        this.personalShipToCityStateZipENU = value;
    }

    /**
     * Gets the value of the personalShipToCityStateZipJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCityStateZipJPN() {
        return personalShipToCityStateZipJPN;
    }

    /**
     * Sets the value of the personalShipToCityStateZipJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCityStateZipJPN(String value) {
        this.personalShipToCityStateZipJPN = value;
    }

    /**
     * Gets the value of the personalShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCountry() {
        return personalShipToCountry;
    }

    /**
     * Sets the value of the personalShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCountry(String value) {
        this.personalShipToCountry = value;
    }

    /**
     * Gets the value of the personalShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToPostalCode() {
        return personalShipToPostalCode;
    }

    /**
     * Sets the value of the personalShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToPostalCode(String value) {
        this.personalShipToPostalCode = value;
    }

    /**
     * Gets the value of the personalShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToState() {
        return personalShipToState;
    }

    /**
     * Sets the value of the personalShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToState(String value) {
        this.personalShipToState = value;
    }

    /**
     * Gets the value of the personalShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToStreetAddress() {
        return personalShipToStreetAddress;
    }

    /**
     * Sets the value of the personalShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToStreetAddress(String value) {
        this.personalShipToStreetAddress = value;
    }

    /**
     * Gets the value of the personalShipToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToStreetAddress2() {
        return personalShipToStreetAddress2;
    }

    /**
     * Sets the value of the personalShipToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToStreetAddress2(String value) {
        this.personalShipToStreetAddress2 = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the priceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIntegrationId() {
        return priceListIntegrationId;
    }

    /**
     * Sets the value of the priceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIntegrationId(String value) {
        this.priceListIntegrationId = value;
    }

    /**
     * Gets the value of the priceModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceModelId() {
        return priceModelId;
    }

    /**
     * Sets the value of the priceModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceModelId(String value) {
        this.priceModelId = value;
    }

    /**
     * Gets the value of the pricingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricingDate() {
        return pricingDate;
    }

    /**
     * Sets the value of the pricingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricingDate(XMLGregorianCalendar value) {
        this.pricingDate = value;
    }

    /**
     * Gets the value of the pricingProcedureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingProcedureName() {
        return pricingProcedureName;
    }

    /**
     * Sets the value of the pricingProcedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingProcedureName(String value) {
        this.pricingProcedureName = value;
    }

    /**
     * Gets the value of the primaryBillToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddress() {
        return primaryBillToAddress;
    }

    /**
     * Sets the value of the primaryBillToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddress(String value) {
        this.primaryBillToAddress = value;
    }

    /**
     * Gets the value of the primaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressId() {
        return primaryBillToAddressId;
    }

    /**
     * Sets the value of the primaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressId(String value) {
        this.primaryBillToAddressId = value;
    }

    /**
     * Gets the value of the primaryBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToCity() {
        return primaryBillToCity;
    }

    /**
     * Sets the value of the primaryBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToCity(String value) {
        this.primaryBillToCity = value;
    }

    /**
     * Gets the value of the primaryBillToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToContactId() {
        return primaryBillToContactId;
    }

    /**
     * Sets the value of the primaryBillToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToContactId(String value) {
        this.primaryBillToContactId = value;
    }

    /**
     * Gets the value of the primaryBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToCountry() {
        return primaryBillToCountry;
    }

    /**
     * Sets the value of the primaryBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToCountry(String value) {
        this.primaryBillToCountry = value;
    }

    /**
     * Gets the value of the primaryBillToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToFirstName() {
        return primaryBillToFirstName;
    }

    /**
     * Sets the value of the primaryBillToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToFirstName(String value) {
        this.primaryBillToFirstName = value;
    }

    /**
     * Gets the value of the primaryBillToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToLastName() {
        return primaryBillToLastName;
    }

    /**
     * Sets the value of the primaryBillToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToLastName(String value) {
        this.primaryBillToLastName = value;
    }

    /**
     * Gets the value of the primaryBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToPostalCode() {
        return primaryBillToPostalCode;
    }

    /**
     * Sets the value of the primaryBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToPostalCode(String value) {
        this.primaryBillToPostalCode = value;
    }

    /**
     * Gets the value of the primaryBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToState() {
        return primaryBillToState;
    }

    /**
     * Sets the value of the primaryBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToState(String value) {
        this.primaryBillToState = value;
    }

    /**
     * Gets the value of the primaryFulfillInvlocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryFulfillInvlocId() {
        return primaryFulfillInvlocId;
    }

    /**
     * Sets the value of the primaryFulfillInvlocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryFulfillInvlocId(String value) {
        this.primaryFulfillInvlocId = value;
    }

    /**
     * Gets the value of the primaryOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOfferId() {
        return primaryOfferId;
    }

    /**
     * Sets the value of the primaryOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOfferId(String value) {
        this.primaryOfferId = value;
    }

    /**
     * Gets the value of the primaryOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOfferName() {
        return primaryOfferName;
    }

    /**
     * Sets the value of the primaryOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOfferName(String value) {
        this.primaryOfferName = value;
    }

    /**
     * Gets the value of the primaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization() {
        return primaryOrganization;
    }

    /**
     * Sets the value of the primaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization(String value) {
        this.primaryOrganization = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationId(String value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPartnerId() {
        return primaryPartnerId;
    }

    /**
     * Sets the value of the primaryPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPartnerId(String value) {
        this.primaryPartnerId = value;
    }

    /**
     * Gets the value of the primaryPayerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPayerAccount() {
        return primaryPayerAccount;
    }

    /**
     * Sets the value of the primaryPayerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPayerAccount(String value) {
        this.primaryPayerAccount = value;
    }

    /**
     * Gets the value of the primaryPayerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPayerAccountId() {
        return primaryPayerAccountId;
    }

    /**
     * Sets the value of the primaryPayerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPayerAccountId(String value) {
        this.primaryPayerAccountId = value;
    }

    /**
     * Gets the value of the primaryPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaryPaymentAmount() {
        return primaryPaymentAmount;
    }

    /**
     * Sets the value of the primaryPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaryPaymentAmount(BigDecimal value) {
        this.primaryPaymentAmount = value;
    }

    /**
     * Gets the value of the primaryPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPaymentId() {
        return primaryPaymentId;
    }

    /**
     * Sets the value of the primaryPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPaymentId(String value) {
        this.primaryPaymentId = value;
    }

    /**
     * Gets the value of the primaryPositionContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPositionContactId() {
        return primaryPositionContactId;
    }

    /**
     * Sets the value of the primaryPositionContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPositionContactId(String value) {
        this.primaryPositionContactId = value;
    }

    /**
     * Gets the value of the primaryPositionContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPositionContactIntegrationId() {
        return primaryPositionContactIntegrationId;
    }

    /**
     * Sets the value of the primaryPositionContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPositionContactIntegrationId(String value) {
        this.primaryPositionContactIntegrationId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPositionId(String value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the primaryShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddress() {
        return primaryShipToAddress;
    }

    /**
     * Sets the value of the primaryShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddress(String value) {
        this.primaryShipToAddress = value;
    }

    /**
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressId(String value) {
        this.primaryShipToAddressId = value;
    }

    /**
     * Gets the value of the primaryShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToCity() {
        return primaryShipToCity;
    }

    /**
     * Sets the value of the primaryShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToCity(String value) {
        this.primaryShipToCity = value;
    }

    /**
     * Gets the value of the primaryShipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToContactId() {
        return primaryShipToContactId;
    }

    /**
     * Sets the value of the primaryShipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToContactId(String value) {
        this.primaryShipToContactId = value;
    }

    /**
     * Gets the value of the primaryShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToCountry() {
        return primaryShipToCountry;
    }

    /**
     * Sets the value of the primaryShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToCountry(String value) {
        this.primaryShipToCountry = value;
    }

    /**
     * Gets the value of the primaryShipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToFirstName() {
        return primaryShipToFirstName;
    }

    /**
     * Sets the value of the primaryShipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToFirstName(String value) {
        this.primaryShipToFirstName = value;
    }

    /**
     * Gets the value of the primaryShipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToLastName() {
        return primaryShipToLastName;
    }

    /**
     * Sets the value of the primaryShipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToLastName(String value) {
        this.primaryShipToLastName = value;
    }

    /**
     * Gets the value of the primaryShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToPostalCode() {
        return primaryShipToPostalCode;
    }

    /**
     * Sets the value of the primaryShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToPostalCode(String value) {
        this.primaryShipToPostalCode = value;
    }

    /**
     * Gets the value of the primaryShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToState() {
        return primaryShipToState;
    }

    /**
     * Sets the value of the primaryShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToState(String value) {
        this.primaryShipToState = value;
    }

    /**
     * Gets the value of the primaryShipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipmentId() {
        return primaryShipmentId;
    }

    /**
     * Sets the value of the primaryShipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipmentId(String value) {
        this.primaryShipmentId = value;
    }

    /**
     * Gets the value of the priorityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityStatus() {
        return priorityStatus;
    }

    /**
     * Sets the value of the priorityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityStatus(String value) {
        this.priorityStatus = value;
    }

    /**
     * Gets the value of the productTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductTotal() {
        return productTotal;
    }

    /**
     * Sets the value of the productTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductTotal(BigDecimal value) {
        this.productTotal = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIntegrationId() {
        return projectIntegrationId;
    }

    /**
     * Sets the value of the projectIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIntegrationId(String value) {
        this.projectIntegrationId = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId(String value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the prospectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProspectId() {
        return prospectId;
    }

    /**
     * Sets the value of the prospectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProspectId(String value) {
        this.prospectId = value;
    }

    /**
     * Gets the value of the purchMgrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchMgrComments() {
        return purchMgrComments;
    }

    /**
     * Sets the value of the purchMgrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchMgrComments(String value) {
        this.purchMgrComments = value;
    }

    /**
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the quoteIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteIntegrationId() {
        return quoteIntegrationId;
    }

    /**
     * Sets the value of the quoteIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteIntegrationId(String value) {
        this.quoteIntegrationId = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedShipDate(XMLGregorianCalendar value) {
        this.requestedShipDate = value;
    }

    /**
     * Gets the value of the reserveTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReserveTime() {
        return reserveTime;
    }

    /**
     * Sets the value of the reserveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReserveTime(BigDecimal value) {
        this.reserveTime = value;
    }

    /**
     * Gets the value of the reserveTimeUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveTimeUoM() {
        return reserveTimeUoM;
    }

    /**
     * Sets the value of the reserveTimeUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveTimeUoM(String value) {
        this.reserveTimeUoM = value;
    }

    /**
     * Gets the value of the returnReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReason() {
        return returnReason;
    }

    /**
     * Sets the value of the returnReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReason(String value) {
        this.returnReason = value;
    }

    /**
     * Gets the value of the returnToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccount() {
        return returnToAccount;
    }

    /**
     * Sets the value of the returnToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccount(String value) {
        this.returnToAccount = value;
    }

    /**
     * Gets the value of the returnToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccountId() {
        return returnToAccountId;
    }

    /**
     * Sets the value of the returnToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccountId(String value) {
        this.returnToAccountId = value;
    }

    /**
     * Gets the value of the returnToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccountIntegrationId() {
        return returnToAccountIntegrationId;
    }

    /**
     * Sets the value of the returnToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccountIntegrationId(String value) {
        this.returnToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the returnToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccountLocation() {
        return returnToAccountLocation;
    }

    /**
     * Sets the value of the returnToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccountLocation(String value) {
        this.returnToAccountLocation = value;
    }

    /**
     * Gets the value of the returnToAddrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddrId() {
        return returnToAddrId;
    }

    /**
     * Sets the value of the returnToAddrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddrId(String value) {
        this.returnToAddrId = value;
    }

    /**
     * Gets the value of the returnToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddressIntegrationId() {
        return returnToAddressIntegrationId;
    }

    /**
     * Sets the value of the returnToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddressIntegrationId(String value) {
        this.returnToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the returnToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToContactId() {
        return returnToContactId;
    }

    /**
     * Sets the value of the returnToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToContactId(String value) {
        this.returnToContactId = value;
    }

    /**
     * Gets the value of the returnToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToContactIntegrationId() {
        return returnToContactIntegrationId;
    }

    /**
     * Sets the value of the returnToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToContactIntegrationId(String value) {
        this.returnToContactIntegrationId = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevision(Integer value) {
        this.revision = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputBillToCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputBillToCustomerNumber() {
        return sapCreateOrderOutputBillToCustomerNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputBillToCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputBillToCustomerNumber(String value) {
        this.sapCreateOrderOutputBillToCustomerNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputBillToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputBillToName() {
        return sapCreateOrderOutputBillToName;
    }

    /**
     * Sets the value of the sapCreateOrderOutputBillToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputBillToName(String value) {
        this.sapCreateOrderOutputBillToName = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputOrderNumber() {
        return sapCreateOrderOutputOrderNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputOrderNumber(String value) {
        this.sapCreateOrderOutputOrderNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputReturnCode() {
        return sapCreateOrderOutputReturnCode;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputReturnCode(String value) {
        this.sapCreateOrderOutputReturnCode = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputReturnMessage() {
        return sapCreateOrderOutputReturnMessage;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputReturnMessage(String value) {
        this.sapCreateOrderOutputReturnMessage = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnMessageFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputReturnMessageFull() {
        return sapCreateOrderOutputReturnMessageFull;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnMessageFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputReturnMessageFull(String value) {
        this.sapCreateOrderOutputReturnMessageFull = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputReturnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputReturnType() {
        return sapCreateOrderOutputReturnType;
    }

    /**
     * Sets the value of the sapCreateOrderOutputReturnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputReturnType(String value) {
        this.sapCreateOrderOutputReturnType = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputShipToCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputShipToCustomerNumber() {
        return sapCreateOrderOutputShipToCustomerNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputShipToCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputShipToCustomerNumber(String value) {
        this.sapCreateOrderOutputShipToCustomerNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputShipToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputShipToName() {
        return sapCreateOrderOutputShipToName;
    }

    /**
     * Sets the value of the sapCreateOrderOutputShipToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputShipToName(String value) {
        this.sapCreateOrderOutputShipToName = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputSoldToCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputSoldToCustomerNumber() {
        return sapCreateOrderOutputSoldToCustomerNumber;
    }

    /**
     * Sets the value of the sapCreateOrderOutputSoldToCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputSoldToCustomerNumber(String value) {
        this.sapCreateOrderOutputSoldToCustomerNumber = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputSoldToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCreateOrderOutputSoldToName() {
        return sapCreateOrderOutputSoldToName;
    }

    /**
     * Sets the value of the sapCreateOrderOutputSoldToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCreateOrderOutputSoldToName(String value) {
        this.sapCreateOrderOutputSoldToName = value;
    }

    /**
     * Gets the value of the sapCreateOrderOutputSubmitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSAPCreateOrderOutputSubmitDate() {
        return sapCreateOrderOutputSubmitDate;
    }

    /**
     * Sets the value of the sapCreateOrderOutputSubmitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSAPCreateOrderOutputSubmitDate(XMLGregorianCalendar value) {
        this.sapCreateOrderOutputSubmitDate = value;
    }

    /**
     * Gets the value of the sapDistributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPDistributionChannel() {
        return sapDistributionChannel;
    }

    /**
     * Sets the value of the sapDistributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPDistributionChannel(String value) {
        this.sapDistributionChannel = value;
    }

    /**
     * Gets the value of the sapDistributionChannelMO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPDistributionChannelMO() {
        return sapDistributionChannelMO;
    }

    /**
     * Sets the value of the sapDistributionChannelMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPDistributionChannelMO(String value) {
        this.sapDistributionChannelMO = value;
    }

    /**
     * Gets the value of the sapDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPDivision() {
        return sapDivision;
    }

    /**
     * Sets the value of the sapDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPDivision(String value) {
        this.sapDivision = value;
    }

    /**
     * Gets the value of the sapDivisionMO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPDivisionMO() {
        return sapDivisionMO;
    }

    /**
     * Sets the value of the sapDivisionMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPDivisionMO(String value) {
        this.sapDivisionMO = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderDeliveryBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusHeaderDeliveryBlock() {
        return sapOrderStatusHeaderDeliveryBlock;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderDeliveryBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusHeaderDeliveryBlock(String value) {
        this.sapOrderStatusHeaderDeliveryBlock = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusHeaderDeliveryStatus() {
        return sapOrderStatusHeaderDeliveryStatus;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusHeaderDeliveryStatus(String value) {
        this.sapOrderStatusHeaderDeliveryStatus = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderProcessingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusHeaderProcessingStatus() {
        return sapOrderStatusHeaderProcessingStatus;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderProcessingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusHeaderProcessingStatus(String value) {
        this.sapOrderStatusHeaderProcessingStatus = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderPurchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusHeaderPurchaseOrderNumber() {
        return sapOrderStatusHeaderPurchaseOrderNumber;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderPurchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusHeaderPurchaseOrderNumber(String value) {
        this.sapOrderStatusHeaderPurchaseOrderNumber = value;
    }

    /**
     * Gets the value of the sapOrderStatusHeaderRequestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSAPOrderStatusHeaderRequestedShipDate() {
        return sapOrderStatusHeaderRequestedShipDate;
    }

    /**
     * Sets the value of the sapOrderStatusHeaderRequestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSAPOrderStatusHeaderRequestedShipDate(XMLGregorianCalendar value) {
        this.sapOrderStatusHeaderRequestedShipDate = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusOutputId() {
        return sapOrderStatusOutputId;
    }

    /**
     * Sets the value of the sapOrderStatusOutputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusOutputId(String value) {
        this.sapOrderStatusOutputId = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusOutputReturnCode() {
        return sapOrderStatusOutputReturnCode;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusOutputReturnCode(String value) {
        this.sapOrderStatusOutputReturnCode = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusOutputReturnMessage() {
        return sapOrderStatusOutputReturnMessage;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusOutputReturnMessage(String value) {
        this.sapOrderStatusOutputReturnMessage = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnMessageFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusOutputReturnMessageFull() {
        return sapOrderStatusOutputReturnMessageFull;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnMessageFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusOutputReturnMessageFull(String value) {
        this.sapOrderStatusOutputReturnMessageFull = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputReturnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrderStatusOutputReturnType() {
        return sapOrderStatusOutputReturnType;
    }

    /**
     * Sets the value of the sapOrderStatusOutputReturnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrderStatusOutputReturnType(String value) {
        this.sapOrderStatusOutputReturnType = value;
    }

    /**
     * Gets the value of the sapOrderStatusOutputUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSAPOrderStatusOutputUpdateDate() {
        return sapOrderStatusOutputUpdateDate;
    }

    /**
     * Sets the value of the sapOrderStatusOutputUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSAPOrderStatusOutputUpdateDate(XMLGregorianCalendar value) {
        this.sapOrderStatusOutputUpdateDate = value;
    }

    /**
     * Gets the value of the sapOrganizationIdMO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPOrganizationIdMO() {
        return sapOrganizationIdMO;
    }

    /**
     * Sets the value of the sapOrganizationIdMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPOrganizationIdMO(String value) {
        this.sapOrganizationIdMO = value;
    }

    /**
     * Gets the value of the sapSalesArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPSalesArea() {
        return sapSalesArea;
    }

    /**
     * Sets the value of the sapSalesArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPSalesArea(String value) {
        this.sapSalesArea = value;
    }

    /**
     * Gets the value of the sapSalesAreaMO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPSalesAreaMO() {
        return sapSalesAreaMO;
    }

    /**
     * Sets the value of the sapSalesAreaMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPSalesAreaMO(String value) {
        this.sapSalesAreaMO = value;
    }

    /**
     * Gets the value of the sapSalesAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPSalesAreaId() {
        return sapSalesAreaId;
    }

    /**
     * Sets the value of the sapSalesAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPSalesAreaId(String value) {
        this.sapSalesAreaId = value;
    }

    /**
     * Gets the value of the sapSalesOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPSalesOrganization() {
        return sapSalesOrganization;
    }

    /**
     * Sets the value of the sapSalesOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPSalesOrganization(String value) {
        this.sapSalesOrganization = value;
    }

    /**
     * Gets the value of the sapSalesOrganizationMO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPSalesOrganizationMO() {
        return sapSalesOrganizationMO;
    }

    /**
     * Sets the value of the sapSalesOrganizationMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPSalesOrganizationMO(String value) {
        this.sapSalesOrganizationMO = value;
    }

    /**
     * Gets the value of the scenarioTestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScenarioTestFlag() {
        return scenarioTestFlag;
    }

    /**
     * Sets the value of the scenarioTestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScenarioTestFlag(Boolean value) {
        this.scenarioTestFlag = value;
    }

    /**
     * Gets the value of the serviceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Sets the value of the serviceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccount(String value) {
        this.serviceAccount = value;
    }

    /**
     * Gets the value of the serviceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * Sets the value of the serviceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountId(String value) {
        this.serviceAccountId = value;
    }

    /**
     * Gets the value of the serviceRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestId() {
        return serviceRequestId;
    }

    /**
     * Sets the value of the serviceRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestId(String value) {
        this.serviceRequestId = value;
    }

    /**
     * Gets the value of the serviceRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestNumber() {
        return serviceRequestNumber;
    }

    /**
     * Sets the value of the serviceRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestNumber(String value) {
        this.serviceRequestNumber = value;
    }

    /**
     * Gets the value of the serviceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceTotal() {
        return serviceTotal;
    }

    /**
     * Sets the value of the serviceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceTotal(BigDecimal value) {
        this.serviceTotal = value;
    }

    /**
     * Gets the value of the shipCompleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipCompleteFlag() {
        return shipCompleteFlag;
    }

    /**
     * Sets the value of the shipCompleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipCompleteFlag(Boolean value) {
        this.shipCompleteFlag = value;
    }

    /**
     * Gets the value of the shipInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInstructions() {
        return shipInstructions;
    }

    /**
     * Sets the value of the shipInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInstructions(String value) {
        this.shipInstructions = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccount(String value) {
        this.shipToAccount = value;
    }

    /**
     * Gets the value of the shipToAccountConstrained property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountConstrained() {
        return shipToAccountConstrained;
    }

    /**
     * Sets the value of the shipToAccountConstrained property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountConstrained(String value) {
        this.shipToAccountConstrained = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountId(String value) {
        this.shipToAccountId = value;
    }

    /**
     * Gets the value of the shipToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountIntegrationId() {
        return shipToAccountIntegrationId;
    }

    /**
     * Sets the value of the shipToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountIntegrationId(String value) {
        this.shipToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the shipToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountLocation() {
        return shipToAccountLocation;
    }

    /**
     * Sets the value of the shipToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountLocation(String value) {
        this.shipToAccountLocation = value;
    }

    /**
     * Gets the value of the shipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressId() {
        return shipToAddressId;
    }

    /**
     * Sets the value of the shipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressId(String value) {
        this.shipToAddressId = value;
    }

    /**
     * Gets the value of the shipToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressIntegrationId() {
        return shipToAddressIntegrationId;
    }

    /**
     * Sets the value of the shipToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressIntegrationId(String value) {
        this.shipToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the shipToAddressSiteUseIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressSiteUseIntegrationId() {
        return shipToAddressSiteUseIntegrationId;
    }

    /**
     * Sets the value of the shipToAddressSiteUseIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressSiteUseIntegrationId(String value) {
        this.shipToAddressSiteUseIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityState() {
        return shipToCityState;
    }

    /**
     * Sets the value of the shipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityState(String value) {
        this.shipToCityState = value;
    }

    /**
     * Gets the value of the shipToCityStateENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityStateENU() {
        return shipToCityStateENU;
    }

    /**
     * Sets the value of the shipToCityStateENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityStateENU(String value) {
        this.shipToCityStateENU = value;
    }

    /**
     * Gets the value of the shipToCityStateJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityStateJPN() {
        return shipToCityStateJPN;
    }

    /**
     * Sets the value of the shipToCityStateJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityStateJPN(String value) {
        this.shipToCityStateJPN = value;
    }

    /**
     * Gets the value of the shipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityStateZip() {
        return shipToCityStateZip;
    }

    /**
     * Sets the value of the shipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityStateZip(String value) {
        this.shipToCityStateZip = value;
    }

    /**
     * Gets the value of the shipToCityStateZipENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityStateZipENU() {
        return shipToCityStateZipENU;
    }

    /**
     * Sets the value of the shipToCityStateZipENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityStateZipENU(String value) {
        this.shipToCityStateZipENU = value;
    }

    /**
     * Gets the value of the shipToCityStateZipJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityStateZipJPN() {
        return shipToCityStateZipJPN;
    }

    /**
     * Sets the value of the shipToCityStateZipJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityStateZipJPN(String value) {
        this.shipToCityStateZipJPN = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactId(String value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactIntegrationId() {
        return shipToContactIntegrationId;
    }

    /**
     * Sets the value of the shipToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactIntegrationId(String value) {
        this.shipToContactIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
    }

    /**
     * Gets the value of the shipViaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipViaId() {
        return shipViaId;
    }

    /**
     * Sets the value of the shipViaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipViaId(String value) {
        this.shipViaId = value;
    }

    /**
     * Gets the value of the shopforSelfFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShopforSelfFlag() {
        return shopforSelfFlag;
    }

    /**
     * Sets the value of the shopforSelfFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShopforSelfFlag(Boolean value) {
        this.shopforSelfFlag = value;
    }

    /**
     * Gets the value of the singleSourceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleSourceFlag() {
        return singleSourceFlag;
    }

    /**
     * Sets the value of the singleSourceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleSourceFlag(Boolean value) {
        this.singleSourceFlag = value;
    }

    /**
     * Gets the value of the sourceInventoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryId() {
        return sourceInventoryId;
    }

    /**
     * Sets the value of the sourceInventoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryId(String value) {
        this.sourceInventoryId = value;
    }

    /**
     * Gets the value of the sourceInventoryLocIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocIntegrationId() {
        return sourceInventoryLocIntegrationId;
    }

    /**
     * Sets the value of the sourceInventoryLocIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocIntegrationId(String value) {
        this.sourceInventoryLocIntegrationId = value;
    }

    /**
     * Gets the value of the sourceInventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocation() {
        return sourceInventoryLocation;
    }

    /**
     * Sets the value of the sourceInventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocation(String value) {
        this.sourceInventoryLocation = value;
    }

    /**
     * Gets the value of the spreadDiscountAllProducts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpreadDiscountAllProducts() {
        return spreadDiscountAllProducts;
    }

    /**
     * Sets the value of the spreadDiscountAllProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpreadDiscountAllProducts(Boolean value) {
        this.spreadDiscountAllProducts = value;
    }

    /**
     * Gets the value of the spreadDiscountCurrentTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpreadDiscountCurrentTotal() {
        return spreadDiscountCurrentTotal;
    }

    /**
     * Sets the value of the spreadDiscountCurrentTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpreadDiscountCurrentTotal(BigDecimal value) {
        this.spreadDiscountCurrentTotal = value;
    }

    /**
     * Gets the value of the spreadDiscountProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpreadDiscountProductType() {
        return spreadDiscountProductType;
    }

    /**
     * Sets the value of the spreadDiscountProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpreadDiscountProductType(String value) {
        this.spreadDiscountProductType = value;
    }

    /**
     * Gets the value of the spreadDiscountSpreadTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpreadDiscountSpreadTotal() {
        return spreadDiscountSpreadTotal;
    }

    /**
     * Sets the value of the spreadDiscountSpreadTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpreadDiscountSpreadTotal(BigDecimal value) {
        this.spreadDiscountSpreadTotal = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDate(XMLGregorianCalendar value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxAmountFromRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmountFromRate() {
        return taxAmountFromRate;
    }

    /**
     * Sets the value of the taxAmountFromRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmountFromRate(String value) {
        this.taxAmountFromRate = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempt(Boolean value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the taxExemptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptNumber() {
        return taxExemptNumber;
    }

    /**
     * Sets the value of the taxExemptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptNumber(String value) {
        this.taxExemptNumber = value;
    }

    /**
     * Gets the value of the taxExemptReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptReason() {
        return taxExemptReason;
    }

    /**
     * Sets the value of the taxExemptReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptReason(String value) {
        this.taxExemptReason = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxRateFromAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateFromAmount() {
        return taxRateFromAmount;
    }

    /**
     * Sets the value of the taxRateFromAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateFromAmount(String value) {
        this.taxRateFromAmount = value;
    }

    /**
     * Gets the value of the thirdPartyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThirdPartyTaxAmount() {
        return thirdPartyTaxAmount;
    }

    /**
     * Sets the value of the thirdPartyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThirdPartyTaxAmount(BigDecimal value) {
        this.thirdPartyTaxAmount = value;
    }

    /**
     * Gets the value of the totalCurrentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentPrice() {
        return totalCurrentPrice;
    }

    /**
     * Sets the value of the totalCurrentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentPrice(BigDecimal value) {
        this.totalCurrentPrice = value;
    }

    /**
     * Gets the value of the totalFieldsActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFieldsActive() {
        return totalFieldsActive;
    }

    /**
     * Sets the value of the totalFieldsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFieldsActive(String value) {
        this.totalFieldsActive = value;
    }

    /**
     * Gets the value of the totalListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalListPrice() {
        return totalListPrice;
    }

    /**
     * Sets the value of the totalListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalListPrice(BigDecimal value) {
        this.totalListPrice = value;
    }

    /**
     * Gets the value of the totalVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * Sets the value of the totalVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVolume(BigDecimal value) {
        this.totalVolume = value;
    }

    /**
     * Gets the value of the totalVolumeUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVolumeUoM() {
        return totalVolumeUoM;
    }

    /**
     * Sets the value of the totalVolumeUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVolumeUoM(String value) {
        this.totalVolumeUoM = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWeight(BigDecimal value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the totalWeightUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalWeightUoM() {
        return totalWeightUoM;
    }

    /**
     * Sets the value of the totalWeightUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalWeightUoM(String value) {
        this.totalWeightUoM = value;
    }

    /**
     * Gets the value of the trainingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrainingTotal() {
        return trainingTotal;
    }

    /**
     * Sets the value of the trainingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrainingTotal(BigDecimal value) {
        this.trainingTotal = value;
    }

    /**
     * Gets the value of the ultimateParentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimateParentId() {
        return ultimateParentId;
    }

    /**
     * Sets the value of the ultimateParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimateParentId(String value) {
        this.ultimateParentId = value;
    }

    /**
     * Gets the value of the updatedByLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedByLogin() {
        return updatedByLogin;
    }

    /**
     * Sets the value of the updatedByLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedByLogin(String value) {
        this.updatedByLogin = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the userTypeBToB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTypeBToB() {
        return userTypeBToB;
    }

    /**
     * Sets the value of the userTypeBToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTypeBToB(String value) {
        this.userTypeBToB = value;
    }

    /**
     * Gets the value of the webphoneOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebphoneOrderNumber() {
        return webphoneOrderNumber;
    }

    /**
     * Sets the value of the webphoneOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebphoneOrderNumber(String value) {
        this.webphoneOrderNumber = value;
    }

    /**
     * Gets the value of the listOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPaymentsData }
     *     
     */
    public ListOfPaymentsData getListOfPayments() {
        return listOfPayments;
    }

    /**
     * Sets the value of the listOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPaymentsData }
     *     
     */
    public void setListOfPayments(ListOfPaymentsData value) {
        this.listOfPayments = value;
    }

    /**
     * Gets the value of the listOfOrderEntryLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderEntryLineItemsData }
     *     
     */
    public ListOfOrderEntryLineItemsData getListOfOrderEntryLineItems() {
        return listOfOrderEntryLineItems;
    }

    /**
     * Sets the value of the listOfOrderEntryLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderEntryLineItemsData }
     *     
     */
    public void setListOfOrderEntryLineItems(ListOfOrderEntryLineItemsData value) {
        this.listOfOrderEntryLineItems = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
