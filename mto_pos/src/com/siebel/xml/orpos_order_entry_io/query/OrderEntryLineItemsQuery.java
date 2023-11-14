
package com.siebel.xml.orpos_order_entry_io.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderEntry-LineItemsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderEntry-LineItemsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ATPMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ATPReserved" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ATPStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ATPStatusAsOfDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActivityRecommendedPartId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustCharge" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AggregrateTotalSkip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AmountExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AsOfDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetExternalIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AuctionItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AuctionItemName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AuctionItemReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AutoChargeFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AutoExplodeFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AutoReceiveFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AvailableDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AvailableQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BCReadOnlyFlag2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BackOfficeProcessStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BasePrice-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillableFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CDAPagesetId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedAssetStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedDueDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedExtendedLineTotal-RootsandPackageComponents" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedLineTotalUI" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedNetDiscountAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedNetDiscountPercent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedNetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedNetworkElementType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedNon-DiscountedLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedProductLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedServiceLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedTrainingLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedYourPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CancelledQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgActiveFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgEndDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgLatestReleasedFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefFirstVersion" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefLastVersion" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgReleasedFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgStartDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgVersion" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChangeCost" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChargeEndDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChargeTimingType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassDisplayName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassOfferId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassRegistrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassRegistrationStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConnectionReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConvertToAssetFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredAssetId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredAssetProduct" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredAssetProductId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredLineNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProduct" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductBasePrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductDiscount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductDiscountAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductDiscountPercent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice1" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice3" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductNetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductRollupAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredProductUnitPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CoveredQuoteItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedByLogin" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CumulativeConfQty" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCodePrecision" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DeleteClassRegistration" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocation2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocationIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Discount2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountPercent-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountSource" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DisplayPackageName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EAISyncDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EarliestTermDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveFrom" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectivePricingPeriodId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveTo" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EntitlementId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EntitlementName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExcludePricingFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExtendedLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExtendedLineTotal-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExtendedQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExternalFulfillLoc" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FixPriceFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ForcastableFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightTerms" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FunctionalCurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FunctionalExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FunctionalItemPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FunctionalLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FunctionalUnitPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="GrossWeight" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="GrossWeightUoM" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HasChildren" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HasGenericsFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderCurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderDiscount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderDiscountAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderRevision" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HoldFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HoldReason" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IncentiveCompensationStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IncentiveStatusChangedFlg" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InvoicedQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsExpanded" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProduct" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductBundleComponent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductComponent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductNotBundle" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductNotBundleRoot" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductORBundleComponent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductRoot" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsPackageProductComponent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsRootItem" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemDisplayName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemPrice-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemPriceList" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemPriceListId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemPriceListIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemType-LanguageIndependent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemIsProduct" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LabeledProductFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LateFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineItemNetTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineNumber2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineNumber22" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineTotal-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineTotalinHeaderCurrency" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LoanerFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MRCCxTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MRCCxTotalinHeaderCurrency" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MaxPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MaximumQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MinimumLot" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MinimumQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NOTWrite-InProductFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCCurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCCxTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCCxTotalinHeaderCurrency" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCNumberofBills" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCPlanId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCPlanName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCScheduleId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCScheduleName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCStartDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NeedRefreshBasePrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetDiscountAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetDiscountAmount-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetDiscountPercent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetDiscountPercent-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetPriceCalc" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetworkElementType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetworkReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Node" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NodeFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NodeReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Non-DiscountedLineTotal" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Non-DiscountedLineTotal-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NoteFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderAcctId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderActiveFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderCPN" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderFreightTermsCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderHeaderId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderPriority" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderQuoteId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderSourceInventoryLocId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderType2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTypeId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Organization22" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OriginalPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OriginalQty" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OutlineNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PACOrderAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PackageName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PackageNameReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentCurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentOrderItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentPackageName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentProductId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentTaxSubcomponentFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartialShip" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PostPickCD" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousAssetStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousBillingAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousBillingAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousSerialNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousServiceAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousServiceAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousServiceId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousUsageAssetId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PricingAdjustmentAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PricingComments" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PricingQuantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAssetChildId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProcessedFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPortId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLineId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductStatusCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductTaxableFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageFileExt" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageFileName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageFileRev" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductTypeCalc" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductTypeCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductUnitofMeasure" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductXAClassId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PromotionId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PromotionItemFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuantityReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuantityRequested" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuantityShipped" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuantityToInvoice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteId2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCAdjustAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCAdjustUM" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCCurrencyCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCExchangeDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCScheduleId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCScheduleName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RCStartDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReserveTime" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReserveTimeUoM" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToAddressIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReturnToContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RevenueType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RevisedLineItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RollupAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RollupItemPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RollupItemPrice-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootActionCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootAssetIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootBundleFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootCfgLatestReleasedFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootCfgType" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootItemPriceListId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootLineItemDueDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootOrderItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootPackageName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootProductDefTypeCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootProductId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootProductName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootProductTypeCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAP4xFreight" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAP4xNetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAP4xPlant" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAP4xTax" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAP4xUnitNetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPConditionPricingUnit" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPConditionUnit" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCumulativeConfirmedQty" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPCurrency" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPDeliveryStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPDeliveryStatusWide" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPInputId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPItemNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPItemShortText" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPMaterialPart" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPNetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPNetValue" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPParentId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPReferenceQty" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPRequestedQty" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPRequestedShipDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SAPSalesUnit" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SalesRepPosition" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SalesRepPostnId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SalesServiceFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SalesUnitofMeasure" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ScheduledShipDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Serialized" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServicePriceAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServicePriceMethod" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServicePricePercent" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipCompleteFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipInstrustions" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipMethod" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddress" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddress2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCity2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContact-FirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContact-LastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCountry2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToFirstName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToLastName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToState2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToZip2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipTogetherFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShiptoAddressIntegrationId2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipmentNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShippingMethod" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SingleSourceFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SkipPricingFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SkipValidationFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocation2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocationReceiveToAddressId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocationReceiveToPostalCode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxAmountHeaderCurrency" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxAmountInternalHeaderCurrency" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptReason" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxSubcomponentFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxableFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TerminationFee" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToNode" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToServiceAccount" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToServiceAccountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitNetPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitPrice-Display" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UpdatedByLogin2" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UsagePlanId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UsagePlanName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UsageScheduleId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UsageScheduleName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UsePlanId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UsePlanName" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UseStartDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VODRowId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ValidationDate" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ValidationStatus" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountIntegrationId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItem" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountMaxQty" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountMethod" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountMinQty" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeUoM" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItem" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItemId" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellMessage" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WarrantyRecoveryFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Write-InProduct" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Write-InProductFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Write-InProductReadOnlyFlag" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "OrderEntry-LineItemsQuery", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "atpMessage",
    "atpReserved",
    "atpStatus",
    "atpStatusAsOfDate",
    "actionCode",
    "activityId",
    "activityRecommendedPartId",
    "adjustCharge",
    "adjustDate",
    "adjustedListPrice",
    "adjustedListPriceDisplay",
    "aggregrateTotalSkip",
    "amountExchangeDate",
    "asOfDate",
    "assetExternalIntegrationId",
    "assetId",
    "assetIntegrationId",
    "assetNumber",
    "assetStatus",
    "auctionItemId",
    "auctionItemName",
    "auctionItemReadOnlyFlag",
    "autoChargeFlag",
    "autoExplodeFlag",
    "autoReceiveFlag",
    "availableDate",
    "availableQuantity",
    "bcReadOnlyFlag2",
    "backOfficeProcessStatus",
    "basePrice",
    "basePriceDisplay",
    "billableFlag",
    "billingAccount",
    "billingAccountId",
    "cdaPagesetId",
    "calculatedAssetStatus",
    "calculatedDueDate",
    "calculatedExtendedLineTotalRootsandPackageComponents",
    "calculatedLineTotal",
    "calculatedLineTotalUI",
    "calculatedNetDiscountAmount",
    "calculatedNetDiscountPercent",
    "calculatedNetPrice",
    "calculatedNetworkElementType",
    "calculatedNonDiscountedLineTotal",
    "calculatedProductLineTotal",
    "calculatedServiceLineTotal",
    "calculatedTrainingLineTotal",
    "calculatedYourPrice",
    "cancelledQuantity",
    "carrierCode",
    "carrierPriority",
    "cfgActiveFlag",
    "cfgEndDate",
    "cfgLatestReleasedFlag",
    "cfgObjectDefFirstVersion",
    "cfgObjectDefLastVersion",
    "cfgReleasedFlag",
    "cfgStartDate",
    "cfgStateCode",
    "cfgType",
    "cfgVersion",
    "changeCost",
    "chargeEndDate",
    "chargeTimingType",
    "classDisplayName",
    "className",
    "classOfferId",
    "classRegistrationId",
    "classRegistrationStatus",
    "classType",
    "compoundProductFlag",
    "compoundProductNumber",
    "configurationModelId",
    "connectionReadOnlyFlag",
    "contactFirstName",
    "contactId",
    "contactLastName",
    "convertToAssetFlag",
    "cost",
    "coveredAssetId",
    "coveredAssetProduct",
    "coveredAssetProductId",
    "coveredLineNumber",
    "coveredProduct",
    "coveredProductBasePrice",
    "coveredProductDiscount",
    "coveredProductDiscountAmount",
    "coveredProductDiscountPercent",
    "coveredProductId",
    "coveredProductItemPrice",
    "coveredProductItemPrice1",
    "coveredProductItemPrice2",
    "coveredProductItemPrice3",
    "coveredProductNetPrice",
    "coveredProductReadOnlyFlag",
    "coveredProductRollupAmount",
    "coveredProductUnitPrice",
    "coveredQuoteItemId",
    "createdByLogin",
    "cumulativeConfQty",
    "currencyCode",
    "currencyCodePrecision",
    "deleteClassRegistration",
    "deliveryStatus",
    "description2",
    "destinationInventoryLocId",
    "destinationInventoryLocation2",
    "destinationInventoryLocationIntegrationId",
    "discount2",
    "discountAmount",
    "discountAmountDisplay",
    "discountPercent",
    "discountPercentDisplay",
    "discountSource",
    "displayPackageName",
    "dueDate",
    "eaiSyncDate",
    "earliestTermDate",
    "effectiveFrom",
    "effectivePricingPeriodId",
    "effectiveTo",
    "eligibilityReason",
    "eligibilityStatus",
    "entitlementId",
    "entitlementName",
    "exchangeDate",
    "excludePricingFlag",
    "expectedDeliveryDate",
    "extendedLineTotal",
    "extendedLineTotalDisplay",
    "extendedQuantity",
    "externalFulfillLoc",
    "fixPriceFlag",
    "forcastableFlag",
    "freightAmount",
    "freightTerms",
    "functionalCurrencyCode",
    "functionalExchangeDate",
    "functionalItemPrice",
    "functionalLineTotal",
    "functionalUnitPrice",
    "grossWeight",
    "grossWeightUoM",
    "hasChildren",
    "hasGenericsFlag",
    "headerCurrencyCode",
    "headerDiscount",
    "headerDiscountAmount",
    "headerExchangeDate",
    "headerRevision",
    "holdFlag",
    "holdReason",
    "incentiveCompensationStatus",
    "incentiveStatusChangedFlg",
    "inclusiveEligibilityFlag",
    "integrationId",
    "invoicedQuantity",
    "isExpanded",
    "isComplexProduct",
    "isComplexProductBundleComponent",
    "isComplexProductComponent",
    "isComplexProductNotBundle",
    "isComplexProductNotBundleRoot",
    "isComplexProductORBundleComponent",
    "isComplexProductRoot",
    "isPackageProductComponent",
    "isRootItem",
    "itemDisplayName",
    "itemPrice",
    "itemPriceDisplay",
    "itemPriceList",
    "itemPriceListId",
    "itemPriceListIntegrationId",
    "itemType",
    "itemTypeLanguageIndependent",
    "itemIsProduct",
    "labeledProductFlag",
    "lateFlag",
    "lineItemNetTotal",
    "lineNumber2",
    "lineNumber22",
    "lineTotal",
    "lineTotalDisplay",
    "lineTotalinHeaderCurrency",
    "loanerFlag",
    "mrcCxTotal",
    "mrcCxTotalinHeaderCurrency",
    "maxPrice",
    "maximumQuantity",
    "minPrice",
    "minimumLot",
    "minimumQuantity",
    "notWriteInProductFlag",
    "nrcAmount",
    "nrcCurrencyCode",
    "nrcCxTotal",
    "nrcCxTotalinHeaderCurrency",
    "nrcExchangeDate",
    "nrcNumberofBills",
    "nrcPlanId",
    "nrcPlanName",
    "nrcScheduleId",
    "nrcScheduleName",
    "nrcStartDate",
    "needRefreshBasePrice",
    "netDiscountAmount",
    "netDiscountAmountDisplay",
    "netDiscountPercent",
    "netDiscountPercentDisplay",
    "netPrice",
    "netPriceCalc",
    "netType",
    "networkElementType",
    "networkReadOnlyFlag",
    "node",
    "nodeFlag",
    "nodeReadOnlyFlag",
    "nonDiscountedLineTotal",
    "nonDiscountedLineTotalDisplay",
    "note",
    "noteFlag",
    "options",
    "orderAcctId",
    "orderActiveFlag",
    "orderCPN",
    "orderFreightTermsCode",
    "orderHeaderId",
    "orderNumber",
    "orderPriority",
    "orderQuoteId",
    "orderSourceInventoryLocId",
    "orderStatus",
    "orderType2",
    "orderTypeId",
    "organization22",
    "organizationId",
    "originalPrice",
    "originalQty",
    "outlineNumber",
    "ownerAccountId",
    "pacOrderAccountId",
    "packageName",
    "packageNameReadOnlyFlag",
    "parentAccountId",
    "parentCurrencyCode",
    "parentExchangeDate",
    "parentOrderItemId",
    "parentPackageName",
    "parentProductId",
    "parentTaxSubcomponentFlag",
    "partNumber",
    "partialShip",
    "postPickCD",
    "prePickCD",
    "previousAssetStatus",
    "previousBillingAccount",
    "previousBillingAccountId",
    "previousSerialNumber",
    "previousServiceAccount",
    "previousServiceAccountId",
    "previousServiceId",
    "previousUsageAssetId",
    "priceListId",
    "priceType",
    "pricingAdjustmentAmount",
    "pricingComments",
    "pricingQuantity",
    "primaryAssetChildId",
    "processedFlag",
    "prodItemId",
    "prodPromId",
    "prodPromInstanceId",
    "prodPromName",
    "prodPromReadOnlyFlag",
    "prodPromRuleId",
    "prodPromSourceId",
    "product",
    "productDefTypeCode",
    "productId",
    "productIntegrationId",
    "productPortId",
    "productPrimaryProductLineId",
    "productReadOnlyFlag",
    "productStatusCode",
    "productTaxableFlag",
    "productThumbnailImageFileExt",
    "productThumbnailImageFileName",
    "productThumbnailImageFileRev",
    "productThumbnailImageId",
    "productTypeCalc",
    "productTypeCode",
    "productUnitofMeasure",
    "productXAClassId",
    "promotionId",
    "promotionItemFlag",
    "quantity",
    "quantityReadOnlyFlag",
    "quantityRequested",
    "quantityShipped",
    "quantityToInvoice",
    "quoteId2",
    "quoteItemId",
    "rcAdjustAmount",
    "rcAdjustUM",
    "rcAmount",
    "rcCurrencyCode",
    "rcExchangeDate",
    "rcScheduleId",
    "rcScheduleName",
    "rcStartDate",
    "reserveTime",
    "reserveTimeUoM",
    "returnToAccount",
    "returnToAccountId",
    "returnToAccountIntegrationId",
    "returnToAccountLocation",
    "returnToAddressId",
    "returnToAddressIntegrationId",
    "returnToContactId",
    "returnToContactIntegrationId",
    "revenueType",
    "revisedLineItemId",
    "rollupAmount",
    "rollupItemPrice",
    "rollupItemPriceDisplay",
    "rootActionCode",
    "rootAssetIntegrationId",
    "rootBundleFlag",
    "rootCfgLatestReleasedFlag",
    "rootCfgType",
    "rootItemPriceListId",
    "rootLineItemDueDate",
    "rootOrderItemId",
    "rootPackageName",
    "rootProductDefTypeCode",
    "rootProductId",
    "rootProductName",
    "rootProductTypeCode",
    "sap4XFreight",
    "sap4XNetPrice",
    "sap4XPlant",
    "sap4XTax",
    "sap4XUnitNetPrice",
    "sapConditionPricingUnit",
    "sapConditionUnit",
    "sapCumulativeConfirmedQty",
    "sapCurrency",
    "sapDeliveryStatus",
    "sapDeliveryStatusWide",
    "sapInputId",
    "sapItemNumber",
    "sapItemShortText",
    "sapMaterialPart",
    "sapNetPrice",
    "sapNetValue",
    "sapParentId",
    "sapReferenceQty",
    "sapRequestedQty",
    "sapRequestedShipDate",
    "sapSalesUnit",
    "salesRepPosition",
    "salesRepPostnId",
    "salesServiceFlag",
    "salesUnitofMeasure",
    "scheduledShipDate",
    "serialNumber",
    "serialized",
    "serviceAccount",
    "serviceAccountId",
    "serviceId",
    "servicePriceAmount",
    "servicePriceMethod",
    "servicePricePercent",
    "shipCompleteFlag",
    "shipInstrustions",
    "shipMethod",
    "shipToAccount",
    "shipToAccountId",
    "shipToAccountIntegrationId",
    "shipToAccountLocation",
    "shipToAddress",
    "shipToAddress2",
    "shipToAddressId",
    "shipToCity2",
    "shipToContactFirstName",
    "shipToContactLastName",
    "shipToContactId",
    "shipToContactIntegrationId",
    "shipToCountry2",
    "shipToFirstName",
    "shipToLastName",
    "shipToState2",
    "shipToZip2",
    "shipTogetherFlag",
    "shiptoAddressIntegrationId2",
    "shipmentNumber",
    "shippingMethod",
    "singleSourceFlag",
    "skipPricingFlag",
    "skipValidationFlag",
    "smartPartNumber",
    "sourceInventoryLocId",
    "sourceInventoryLocIntegrationId",
    "sourceInventoryLocation2",
    "sourceInventoryLocationReceiveToAddressId",
    "sourceInventoryLocationReceiveToPostalCode",
    "status",
    "taxAmount",
    "taxAmountHeaderCurrency",
    "taxAmountInternalHeaderCurrency",
    "taxExemptFlag",
    "taxExemptNumber",
    "taxExemptReason",
    "taxRate",
    "taxSubcomponentFlag",
    "taxableFlag",
    "terminationFee",
    "toNode",
    "toServiceAccount",
    "toServiceAccountId",
    "unitNetPrice",
    "unitPrice",
    "unitPriceDisplay",
    "unitofMeasure",
    "updatedByLogin2",
    "usagePlanId",
    "usagePlanName",
    "usageScheduleId",
    "usageScheduleName",
    "usePlanId",
    "usePlanName",
    "useStartDate",
    "vodRowId",
    "validationDate",
    "validationStatus",
    "volume",
    "volumeDiscountId",
    "volumeDiscountIntegrationId",
    "volumeDiscountItem",
    "volumeDiscountItemId",
    "volumeDiscountMaxQty",
    "volumeDiscountMethod",
    "volumeDiscountMinQty",
    "volumeUoM",
    "volumeUpsellItem",
    "volumeUpsellItemId",
    "volumeUpsellMessage",
    "warrantyRecoveryFlag",
    "writeInProduct",
    "writeInProductFlag",
    "writeInProductReadOnlyFlag"
})
public class OrderEntryLineItemsQuery {

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
    @XmlElement(name = "ATPReserved")
    protected QueryType atpReserved;
    @XmlElement(name = "ATPStatus")
    protected QueryType atpStatus;
    @XmlElement(name = "ATPStatusAsOfDate")
    protected QueryType atpStatusAsOfDate;
    @XmlElement(name = "ActionCode")
    protected QueryType actionCode;
    @XmlElement(name = "ActivityId")
    protected QueryType activityId;
    @XmlElement(name = "ActivityRecommendedPartId")
    protected QueryType activityRecommendedPartId;
    @XmlElement(name = "AdjustCharge")
    protected QueryType adjustCharge;
    @XmlElement(name = "AdjustDate")
    protected QueryType adjustDate;
    @XmlElement(name = "AdjustedListPrice")
    protected QueryType adjustedListPrice;
    @XmlElement(name = "AdjustedListPrice-Display")
    protected QueryType adjustedListPriceDisplay;
    @XmlElement(name = "AggregrateTotalSkip")
    protected QueryType aggregrateTotalSkip;
    @XmlElement(name = "AmountExchangeDate")
    protected QueryType amountExchangeDate;
    @XmlElement(name = "AsOfDate")
    protected QueryType asOfDate;
    @XmlElement(name = "AssetExternalIntegrationId")
    protected QueryType assetExternalIntegrationId;
    @XmlElement(name = "AssetId")
    protected QueryType assetId;
    @XmlElement(name = "AssetIntegrationId")
    protected QueryType assetIntegrationId;
    @XmlElement(name = "AssetNumber")
    protected QueryType assetNumber;
    @XmlElement(name = "AssetStatus")
    protected QueryType assetStatus;
    @XmlElement(name = "AuctionItemId")
    protected QueryType auctionItemId;
    @XmlElement(name = "AuctionItemName")
    protected QueryType auctionItemName;
    @XmlElement(name = "AuctionItemReadOnlyFlag")
    protected QueryType auctionItemReadOnlyFlag;
    @XmlElement(name = "AutoChargeFlag")
    protected QueryType autoChargeFlag;
    @XmlElement(name = "AutoExplodeFlag")
    protected QueryType autoExplodeFlag;
    @XmlElement(name = "AutoReceiveFlag")
    protected QueryType autoReceiveFlag;
    @XmlElement(name = "AvailableDate")
    protected QueryType availableDate;
    @XmlElement(name = "AvailableQuantity")
    protected QueryType availableQuantity;
    @XmlElement(name = "BCReadOnlyFlag2")
    protected QueryType bcReadOnlyFlag2;
    @XmlElement(name = "BackOfficeProcessStatus")
    protected QueryType backOfficeProcessStatus;
    @XmlElement(name = "BasePrice")
    protected QueryType basePrice;
    @XmlElement(name = "BasePrice-Display")
    protected QueryType basePriceDisplay;
    @XmlElement(name = "BillableFlag")
    protected QueryType billableFlag;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected QueryType billingAccountId;
    @XmlElement(name = "CDAPagesetId")
    protected QueryType cdaPagesetId;
    @XmlElement(name = "CalculatedAssetStatus")
    protected QueryType calculatedAssetStatus;
    @XmlElement(name = "CalculatedDueDate")
    protected QueryType calculatedDueDate;
    @XmlElement(name = "CalculatedExtendedLineTotal-RootsandPackageComponents")
    protected QueryType calculatedExtendedLineTotalRootsandPackageComponents;
    @XmlElement(name = "CalculatedLineTotal")
    protected QueryType calculatedLineTotal;
    @XmlElement(name = "CalculatedLineTotalUI")
    protected QueryType calculatedLineTotalUI;
    @XmlElement(name = "CalculatedNetDiscountAmount")
    protected QueryType calculatedNetDiscountAmount;
    @XmlElement(name = "CalculatedNetDiscountPercent")
    protected QueryType calculatedNetDiscountPercent;
    @XmlElement(name = "CalculatedNetPrice")
    protected QueryType calculatedNetPrice;
    @XmlElement(name = "CalculatedNetworkElementType")
    protected QueryType calculatedNetworkElementType;
    @XmlElement(name = "CalculatedNon-DiscountedLineTotal")
    protected QueryType calculatedNonDiscountedLineTotal;
    @XmlElement(name = "CalculatedProductLineTotal")
    protected QueryType calculatedProductLineTotal;
    @XmlElement(name = "CalculatedServiceLineTotal")
    protected QueryType calculatedServiceLineTotal;
    @XmlElement(name = "CalculatedTrainingLineTotal")
    protected QueryType calculatedTrainingLineTotal;
    @XmlElement(name = "CalculatedYourPrice")
    protected QueryType calculatedYourPrice;
    @XmlElement(name = "CancelledQuantity")
    protected QueryType cancelledQuantity;
    @XmlElement(name = "CarrierCode")
    protected QueryType carrierCode;
    @XmlElement(name = "CarrierPriority")
    protected QueryType carrierPriority;
    @XmlElement(name = "CfgActiveFlag")
    protected QueryType cfgActiveFlag;
    @XmlElement(name = "CfgEndDate")
    protected QueryType cfgEndDate;
    @XmlElement(name = "CfgLatestReleasedFlag")
    protected QueryType cfgLatestReleasedFlag;
    @XmlElement(name = "CfgObjectDefFirstVersion")
    protected QueryType cfgObjectDefFirstVersion;
    @XmlElement(name = "CfgObjectDefLastVersion")
    protected QueryType cfgObjectDefLastVersion;
    @XmlElement(name = "CfgReleasedFlag")
    protected QueryType cfgReleasedFlag;
    @XmlElement(name = "CfgStartDate")
    protected QueryType cfgStartDate;
    @XmlElement(name = "CfgStateCode")
    protected QueryType cfgStateCode;
    @XmlElement(name = "CfgType")
    protected QueryType cfgType;
    @XmlElement(name = "CfgVersion")
    protected QueryType cfgVersion;
    @XmlElement(name = "ChangeCost")
    protected QueryType changeCost;
    @XmlElement(name = "ChargeEndDate")
    protected QueryType chargeEndDate;
    @XmlElement(name = "ChargeTimingType")
    protected QueryType chargeTimingType;
    @XmlElement(name = "ClassDisplayName")
    protected QueryType classDisplayName;
    @XmlElement(name = "ClassName")
    protected QueryType className;
    @XmlElement(name = "ClassOfferId")
    protected QueryType classOfferId;
    @XmlElement(name = "ClassRegistrationId")
    protected QueryType classRegistrationId;
    @XmlElement(name = "ClassRegistrationStatus")
    protected QueryType classRegistrationStatus;
    @XmlElement(name = "ClassType")
    protected QueryType classType;
    @XmlElement(name = "CompoundProductFlag")
    protected QueryType compoundProductFlag;
    @XmlElement(name = "CompoundProductNumber")
    protected QueryType compoundProductNumber;
    @XmlElement(name = "ConfigurationModelId")
    protected QueryType configurationModelId;
    @XmlElement(name = "ConnectionReadOnlyFlag")
    protected QueryType connectionReadOnlyFlag;
    @XmlElement(name = "ContactFirstName")
    protected QueryType contactFirstName;
    @XmlElement(name = "ContactId")
    protected QueryType contactId;
    @XmlElement(name = "ContactLastName")
    protected QueryType contactLastName;
    @XmlElement(name = "ConvertToAssetFlag")
    protected QueryType convertToAssetFlag;
    @XmlElement(name = "Cost")
    protected QueryType cost;
    @XmlElement(name = "CoveredAssetId")
    protected QueryType coveredAssetId;
    @XmlElement(name = "CoveredAssetProduct")
    protected QueryType coveredAssetProduct;
    @XmlElement(name = "CoveredAssetProductId")
    protected QueryType coveredAssetProductId;
    @XmlElement(name = "CoveredLineNumber")
    protected QueryType coveredLineNumber;
    @XmlElement(name = "CoveredProduct")
    protected QueryType coveredProduct;
    @XmlElement(name = "CoveredProductBasePrice")
    protected QueryType coveredProductBasePrice;
    @XmlElement(name = "CoveredProductDiscount")
    protected QueryType coveredProductDiscount;
    @XmlElement(name = "CoveredProductDiscountAmount")
    protected QueryType coveredProductDiscountAmount;
    @XmlElement(name = "CoveredProductDiscountPercent")
    protected QueryType coveredProductDiscountPercent;
    @XmlElement(name = "CoveredProductId")
    protected QueryType coveredProductId;
    @XmlElement(name = "CoveredProductItemPrice")
    protected QueryType coveredProductItemPrice;
    @XmlElement(name = "CoveredProductItemPrice1")
    protected QueryType coveredProductItemPrice1;
    @XmlElement(name = "CoveredProductItemPrice2")
    protected QueryType coveredProductItemPrice2;
    @XmlElement(name = "CoveredProductItemPrice3")
    protected QueryType coveredProductItemPrice3;
    @XmlElement(name = "CoveredProductNetPrice")
    protected QueryType coveredProductNetPrice;
    @XmlElement(name = "CoveredProductReadOnlyFlag")
    protected QueryType coveredProductReadOnlyFlag;
    @XmlElement(name = "CoveredProductRollupAmount")
    protected QueryType coveredProductRollupAmount;
    @XmlElement(name = "CoveredProductUnitPrice")
    protected QueryType coveredProductUnitPrice;
    @XmlElement(name = "CoveredQuoteItemId")
    protected QueryType coveredQuoteItemId;
    @XmlElement(name = "CreatedByLogin")
    protected QueryType createdByLogin;
    @XmlElement(name = "CumulativeConfQty")
    protected QueryType cumulativeConfQty;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "CurrencyCodePrecision")
    protected QueryType currencyCodePrecision;
    @XmlElement(name = "DeleteClassRegistration")
    protected QueryType deleteClassRegistration;
    @XmlElement(name = "DeliveryStatus")
    protected QueryType deliveryStatus;
    @XmlElement(name = "Description2")
    protected QueryType description2;
    @XmlElement(name = "DestinationInventoryLocId")
    protected QueryType destinationInventoryLocId;
    @XmlElement(name = "DestinationInventoryLocation2")
    protected QueryType destinationInventoryLocation2;
    @XmlElement(name = "DestinationInventoryLocationIntegrationId")
    protected QueryType destinationInventoryLocationIntegrationId;
    @XmlElement(name = "Discount2")
    protected QueryType discount2;
    @XmlElement(name = "DiscountAmount")
    protected QueryType discountAmount;
    @XmlElement(name = "DiscountAmount-Display")
    protected QueryType discountAmountDisplay;
    @XmlElement(name = "DiscountPercent")
    protected QueryType discountPercent;
    @XmlElement(name = "DiscountPercent-Display")
    protected QueryType discountPercentDisplay;
    @XmlElement(name = "DiscountSource")
    protected QueryType discountSource;
    @XmlElement(name = "DisplayPackageName")
    protected QueryType displayPackageName;
    @XmlElement(name = "DueDate")
    protected QueryType dueDate;
    @XmlElement(name = "EAISyncDate")
    protected QueryType eaiSyncDate;
    @XmlElement(name = "EarliestTermDate")
    protected QueryType earliestTermDate;
    @XmlElement(name = "EffectiveFrom")
    protected QueryType effectiveFrom;
    @XmlElement(name = "EffectivePricingPeriodId")
    protected QueryType effectivePricingPeriodId;
    @XmlElement(name = "EffectiveTo")
    protected QueryType effectiveTo;
    @XmlElement(name = "EligibilityReason")
    protected QueryType eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected QueryType eligibilityStatus;
    @XmlElement(name = "EntitlementId")
    protected QueryType entitlementId;
    @XmlElement(name = "EntitlementName")
    protected QueryType entitlementName;
    @XmlElement(name = "ExchangeDate")
    protected QueryType exchangeDate;
    @XmlElement(name = "ExcludePricingFlag")
    protected QueryType excludePricingFlag;
    @XmlElement(name = "ExpectedDeliveryDate")
    protected QueryType expectedDeliveryDate;
    @XmlElement(name = "ExtendedLineTotal")
    protected QueryType extendedLineTotal;
    @XmlElement(name = "ExtendedLineTotal-Display")
    protected QueryType extendedLineTotalDisplay;
    @XmlElement(name = "ExtendedQuantity")
    protected QueryType extendedQuantity;
    @XmlElement(name = "ExternalFulfillLoc")
    protected QueryType externalFulfillLoc;
    @XmlElement(name = "FixPriceFlag")
    protected QueryType fixPriceFlag;
    @XmlElement(name = "ForcastableFlag")
    protected QueryType forcastableFlag;
    @XmlElement(name = "FreightAmount")
    protected QueryType freightAmount;
    @XmlElement(name = "FreightTerms")
    protected QueryType freightTerms;
    @XmlElement(name = "FunctionalCurrencyCode")
    protected QueryType functionalCurrencyCode;
    @XmlElement(name = "FunctionalExchangeDate")
    protected QueryType functionalExchangeDate;
    @XmlElement(name = "FunctionalItemPrice")
    protected QueryType functionalItemPrice;
    @XmlElement(name = "FunctionalLineTotal")
    protected QueryType functionalLineTotal;
    @XmlElement(name = "FunctionalUnitPrice")
    protected QueryType functionalUnitPrice;
    @XmlElement(name = "GrossWeight")
    protected QueryType grossWeight;
    @XmlElement(name = "GrossWeightUoM")
    protected QueryType grossWeightUoM;
    @XmlElement(name = "HasChildren")
    protected QueryType hasChildren;
    @XmlElement(name = "HasGenericsFlag")
    protected QueryType hasGenericsFlag;
    @XmlElement(name = "HeaderCurrencyCode")
    protected QueryType headerCurrencyCode;
    @XmlElement(name = "HeaderDiscount")
    protected QueryType headerDiscount;
    @XmlElement(name = "HeaderDiscountAmount")
    protected QueryType headerDiscountAmount;
    @XmlElement(name = "HeaderExchangeDate")
    protected QueryType headerExchangeDate;
    @XmlElement(name = "HeaderRevision")
    protected QueryType headerRevision;
    @XmlElement(name = "HoldFlag")
    protected QueryType holdFlag;
    @XmlElement(name = "HoldReason")
    protected QueryType holdReason;
    @XmlElement(name = "IncentiveCompensationStatus")
    protected QueryType incentiveCompensationStatus;
    @XmlElement(name = "IncentiveStatusChangedFlg")
    protected QueryType incentiveStatusChangedFlg;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected QueryType inclusiveEligibilityFlag;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "InvoicedQuantity")
    protected QueryType invoicedQuantity;
    @XmlElement(name = "IsExpanded")
    protected QueryType isExpanded;
    @XmlElement(name = "IsComplexProduct")
    protected QueryType isComplexProduct;
    @XmlElement(name = "IsComplexProductBundleComponent")
    protected QueryType isComplexProductBundleComponent;
    @XmlElement(name = "IsComplexProductComponent")
    protected QueryType isComplexProductComponent;
    @XmlElement(name = "IsComplexProductNotBundle")
    protected QueryType isComplexProductNotBundle;
    @XmlElement(name = "IsComplexProductNotBundleRoot")
    protected QueryType isComplexProductNotBundleRoot;
    @XmlElement(name = "IsComplexProductORBundleComponent")
    protected QueryType isComplexProductORBundleComponent;
    @XmlElement(name = "IsComplexProductRoot")
    protected QueryType isComplexProductRoot;
    @XmlElement(name = "IsPackageProductComponent")
    protected QueryType isPackageProductComponent;
    @XmlElement(name = "IsRootItem")
    protected QueryType isRootItem;
    @XmlElement(name = "ItemDisplayName")
    protected QueryType itemDisplayName;
    @XmlElement(name = "ItemPrice")
    protected QueryType itemPrice;
    @XmlElement(name = "ItemPrice-Display")
    protected QueryType itemPriceDisplay;
    @XmlElement(name = "ItemPriceList")
    protected QueryType itemPriceList;
    @XmlElement(name = "ItemPriceListId")
    protected QueryType itemPriceListId;
    @XmlElement(name = "ItemPriceListIntegrationId")
    protected QueryType itemPriceListIntegrationId;
    @XmlElement(name = "ItemType")
    protected QueryType itemType;
    @XmlElement(name = "ItemType-LanguageIndependent")
    protected QueryType itemTypeLanguageIndependent;
    @XmlElement(name = "ItemIsProduct")
    protected QueryType itemIsProduct;
    @XmlElement(name = "LabeledProductFlag")
    protected QueryType labeledProductFlag;
    @XmlElement(name = "LateFlag")
    protected QueryType lateFlag;
    @XmlElement(name = "LineItemNetTotal")
    protected QueryType lineItemNetTotal;
    @XmlElement(name = "LineNumber2")
    protected QueryType lineNumber2;
    @XmlElement(name = "LineNumber22")
    protected QueryType lineNumber22;
    @XmlElement(name = "LineTotal")
    protected QueryType lineTotal;
    @XmlElement(name = "LineTotal-Display")
    protected QueryType lineTotalDisplay;
    @XmlElement(name = "LineTotalinHeaderCurrency")
    protected QueryType lineTotalinHeaderCurrency;
    @XmlElement(name = "LoanerFlag")
    protected QueryType loanerFlag;
    @XmlElement(name = "MRCCxTotal")
    protected QueryType mrcCxTotal;
    @XmlElement(name = "MRCCxTotalinHeaderCurrency")
    protected QueryType mrcCxTotalinHeaderCurrency;
    @XmlElement(name = "MaxPrice")
    protected QueryType maxPrice;
    @XmlElement(name = "MaximumQuantity")
    protected QueryType maximumQuantity;
    @XmlElement(name = "MinPrice")
    protected QueryType minPrice;
    @XmlElement(name = "MinimumLot")
    protected QueryType minimumLot;
    @XmlElement(name = "MinimumQuantity")
    protected QueryType minimumQuantity;
    @XmlElement(name = "NOTWrite-InProductFlag")
    protected QueryType notWriteInProductFlag;
    @XmlElement(name = "NRCAmount")
    protected QueryType nrcAmount;
    @XmlElement(name = "NRCCurrencyCode")
    protected QueryType nrcCurrencyCode;
    @XmlElement(name = "NRCCxTotal")
    protected QueryType nrcCxTotal;
    @XmlElement(name = "NRCCxTotalinHeaderCurrency")
    protected QueryType nrcCxTotalinHeaderCurrency;
    @XmlElement(name = "NRCExchangeDate")
    protected QueryType nrcExchangeDate;
    @XmlElement(name = "NRCNumberofBills")
    protected QueryType nrcNumberofBills;
    @XmlElement(name = "NRCPlanId")
    protected QueryType nrcPlanId;
    @XmlElement(name = "NRCPlanName")
    protected QueryType nrcPlanName;
    @XmlElement(name = "NRCScheduleId")
    protected QueryType nrcScheduleId;
    @XmlElement(name = "NRCScheduleName")
    protected QueryType nrcScheduleName;
    @XmlElement(name = "NRCStartDate")
    protected QueryType nrcStartDate;
    @XmlElement(name = "NeedRefreshBasePrice")
    protected QueryType needRefreshBasePrice;
    @XmlElement(name = "NetDiscountAmount")
    protected QueryType netDiscountAmount;
    @XmlElement(name = "NetDiscountAmount-Display")
    protected QueryType netDiscountAmountDisplay;
    @XmlElement(name = "NetDiscountPercent")
    protected QueryType netDiscountPercent;
    @XmlElement(name = "NetDiscountPercent-Display")
    protected QueryType netDiscountPercentDisplay;
    @XmlElement(name = "NetPrice")
    protected QueryType netPrice;
    @XmlElement(name = "NetPriceCalc")
    protected QueryType netPriceCalc;
    @XmlElement(name = "NetType")
    protected QueryType netType;
    @XmlElement(name = "NetworkElementType")
    protected QueryType networkElementType;
    @XmlElement(name = "NetworkReadOnlyFlag")
    protected QueryType networkReadOnlyFlag;
    @XmlElement(name = "Node")
    protected QueryType node;
    @XmlElement(name = "NodeFlag")
    protected QueryType nodeFlag;
    @XmlElement(name = "NodeReadOnlyFlag")
    protected QueryType nodeReadOnlyFlag;
    @XmlElement(name = "Non-DiscountedLineTotal")
    protected QueryType nonDiscountedLineTotal;
    @XmlElement(name = "Non-DiscountedLineTotal-Display")
    protected QueryType nonDiscountedLineTotalDisplay;
    @XmlElement(name = "Note")
    protected QueryType note;
    @XmlElement(name = "NoteFlag")
    protected QueryType noteFlag;
    @XmlElement(name = "Options")
    protected QueryType options;
    @XmlElement(name = "OrderAcctId")
    protected QueryType orderAcctId;
    @XmlElement(name = "OrderActiveFlag")
    protected QueryType orderActiveFlag;
    @XmlElement(name = "OrderCPN")
    protected QueryType orderCPN;
    @XmlElement(name = "OrderFreightTermsCode")
    protected QueryType orderFreightTermsCode;
    @XmlElement(name = "OrderHeaderId")
    protected QueryType orderHeaderId;
    @XmlElement(name = "OrderNumber")
    protected QueryType orderNumber;
    @XmlElement(name = "OrderPriority")
    protected QueryType orderPriority;
    @XmlElement(name = "OrderQuoteId")
    protected QueryType orderQuoteId;
    @XmlElement(name = "OrderSourceInventoryLocId")
    protected QueryType orderSourceInventoryLocId;
    @XmlElement(name = "OrderStatus")
    protected QueryType orderStatus;
    @XmlElement(name = "OrderType2")
    protected QueryType orderType2;
    @XmlElement(name = "OrderTypeId")
    protected QueryType orderTypeId;
    @XmlElement(name = "Organization22")
    protected QueryType organization22;
    @XmlElement(name = "OrganizationId")
    protected QueryType organizationId;
    @XmlElement(name = "OriginalPrice")
    protected QueryType originalPrice;
    @XmlElement(name = "OriginalQty")
    protected QueryType originalQty;
    @XmlElement(name = "OutlineNumber")
    protected QueryType outlineNumber;
    @XmlElement(name = "OwnerAccountId")
    protected QueryType ownerAccountId;
    @XmlElement(name = "PACOrderAccountId")
    protected QueryType pacOrderAccountId;
    @XmlElement(name = "PackageName")
    protected QueryType packageName;
    @XmlElement(name = "PackageNameReadOnlyFlag")
    protected QueryType packageNameReadOnlyFlag;
    @XmlElement(name = "ParentAccountId")
    protected QueryType parentAccountId;
    @XmlElement(name = "ParentCurrencyCode")
    protected QueryType parentCurrencyCode;
    @XmlElement(name = "ParentExchangeDate")
    protected QueryType parentExchangeDate;
    @XmlElement(name = "ParentOrderItemId")
    protected QueryType parentOrderItemId;
    @XmlElement(name = "ParentPackageName")
    protected QueryType parentPackageName;
    @XmlElement(name = "ParentProductId")
    protected QueryType parentProductId;
    @XmlElement(name = "ParentTaxSubcomponentFlag")
    protected QueryType parentTaxSubcomponentFlag;
    @XmlElement(name = "PartNumber")
    protected QueryType partNumber;
    @XmlElement(name = "PartialShip")
    protected QueryType partialShip;
    @XmlElement(name = "PostPickCD")
    protected QueryType postPickCD;
    @XmlElement(name = "PrePickCD")
    protected QueryType prePickCD;
    @XmlElement(name = "PreviousAssetStatus")
    protected QueryType previousAssetStatus;
    @XmlElement(name = "PreviousBillingAccount")
    protected QueryType previousBillingAccount;
    @XmlElement(name = "PreviousBillingAccountId")
    protected QueryType previousBillingAccountId;
    @XmlElement(name = "PreviousSerialNumber")
    protected QueryType previousSerialNumber;
    @XmlElement(name = "PreviousServiceAccount")
    protected QueryType previousServiceAccount;
    @XmlElement(name = "PreviousServiceAccountId")
    protected QueryType previousServiceAccountId;
    @XmlElement(name = "PreviousServiceId")
    protected QueryType previousServiceId;
    @XmlElement(name = "PreviousUsageAssetId")
    protected QueryType previousUsageAssetId;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "PriceType")
    protected QueryType priceType;
    @XmlElement(name = "PricingAdjustmentAmount")
    protected QueryType pricingAdjustmentAmount;
    @XmlElement(name = "PricingComments")
    protected QueryType pricingComments;
    @XmlElement(name = "PricingQuantity")
    protected QueryType pricingQuantity;
    @XmlElement(name = "PrimaryAssetChildId")
    protected QueryType primaryAssetChildId;
    @XmlElement(name = "ProcessedFlag")
    protected QueryType processedFlag;
    @XmlElement(name = "ProdItemId")
    protected QueryType prodItemId;
    @XmlElement(name = "ProdPromId")
    protected QueryType prodPromId;
    @XmlElement(name = "ProdPromInstanceId")
    protected QueryType prodPromInstanceId;
    @XmlElement(name = "ProdPromName")
    protected QueryType prodPromName;
    @XmlElement(name = "ProdPromReadOnlyFlag")
    protected QueryType prodPromReadOnlyFlag;
    @XmlElement(name = "ProdPromRuleId")
    protected QueryType prodPromRuleId;
    @XmlElement(name = "ProdPromSourceId")
    protected QueryType prodPromSourceId;
    @XmlElement(name = "Product")
    protected QueryType product;
    @XmlElement(name = "ProductDefTypeCode")
    protected QueryType productDefTypeCode;
    @XmlElement(name = "ProductId")
    protected QueryType productId;
    @XmlElement(name = "ProductIntegrationId")
    protected QueryType productIntegrationId;
    @XmlElement(name = "ProductPortId")
    protected QueryType productPortId;
    @XmlElement(name = "ProductPrimaryProductLineId")
    protected QueryType productPrimaryProductLineId;
    @XmlElement(name = "ProductReadOnlyFlag")
    protected QueryType productReadOnlyFlag;
    @XmlElement(name = "ProductStatusCode")
    protected QueryType productStatusCode;
    @XmlElement(name = "ProductTaxableFlag")
    protected QueryType productTaxableFlag;
    @XmlElement(name = "ProductThumbnailImageFileExt")
    protected QueryType productThumbnailImageFileExt;
    @XmlElement(name = "ProductThumbnailImageFileName")
    protected QueryType productThumbnailImageFileName;
    @XmlElement(name = "ProductThumbnailImageFileRev")
    protected QueryType productThumbnailImageFileRev;
    @XmlElement(name = "ProductThumbnailImageId")
    protected QueryType productThumbnailImageId;
    @XmlElement(name = "ProductTypeCalc")
    protected QueryType productTypeCalc;
    @XmlElement(name = "ProductTypeCode")
    protected QueryType productTypeCode;
    @XmlElement(name = "ProductUnitofMeasure")
    protected QueryType productUnitofMeasure;
    @XmlElement(name = "ProductXAClassId")
    protected QueryType productXAClassId;
    @XmlElement(name = "PromotionId")
    protected QueryType promotionId;
    @XmlElement(name = "PromotionItemFlag")
    protected QueryType promotionItemFlag;
    @XmlElement(name = "Quantity")
    protected QueryType quantity;
    @XmlElement(name = "QuantityReadOnlyFlag")
    protected QueryType quantityReadOnlyFlag;
    @XmlElement(name = "QuantityRequested")
    protected QueryType quantityRequested;
    @XmlElement(name = "QuantityShipped")
    protected QueryType quantityShipped;
    @XmlElement(name = "QuantityToInvoice")
    protected QueryType quantityToInvoice;
    @XmlElement(name = "QuoteId2")
    protected QueryType quoteId2;
    @XmlElement(name = "QuoteItemId")
    protected QueryType quoteItemId;
    @XmlElement(name = "RCAdjustAmount")
    protected QueryType rcAdjustAmount;
    @XmlElement(name = "RCAdjustUM")
    protected QueryType rcAdjustUM;
    @XmlElement(name = "RCAmount")
    protected QueryType rcAmount;
    @XmlElement(name = "RCCurrencyCode")
    protected QueryType rcCurrencyCode;
    @XmlElement(name = "RCExchangeDate")
    protected QueryType rcExchangeDate;
    @XmlElement(name = "RCScheduleId")
    protected QueryType rcScheduleId;
    @XmlElement(name = "RCScheduleName")
    protected QueryType rcScheduleName;
    @XmlElement(name = "RCStartDate")
    protected QueryType rcStartDate;
    @XmlElement(name = "ReserveTime")
    protected QueryType reserveTime;
    @XmlElement(name = "ReserveTimeUoM")
    protected QueryType reserveTimeUoM;
    @XmlElement(name = "ReturnToAccount")
    protected QueryType returnToAccount;
    @XmlElement(name = "ReturnToAccountId")
    protected QueryType returnToAccountId;
    @XmlElement(name = "ReturnToAccountIntegrationId")
    protected QueryType returnToAccountIntegrationId;
    @XmlElement(name = "ReturnToAccountLocation")
    protected QueryType returnToAccountLocation;
    @XmlElement(name = "ReturnToAddressId")
    protected QueryType returnToAddressId;
    @XmlElement(name = "ReturnToAddressIntegrationId")
    protected QueryType returnToAddressIntegrationId;
    @XmlElement(name = "ReturnToContactId")
    protected QueryType returnToContactId;
    @XmlElement(name = "ReturnToContactIntegrationId")
    protected QueryType returnToContactIntegrationId;
    @XmlElement(name = "RevenueType")
    protected QueryType revenueType;
    @XmlElement(name = "RevisedLineItemId")
    protected QueryType revisedLineItemId;
    @XmlElement(name = "RollupAmount")
    protected QueryType rollupAmount;
    @XmlElement(name = "RollupItemPrice")
    protected QueryType rollupItemPrice;
    @XmlElement(name = "RollupItemPrice-Display")
    protected QueryType rollupItemPriceDisplay;
    @XmlElement(name = "RootActionCode")
    protected QueryType rootActionCode;
    @XmlElement(name = "RootAssetIntegrationId")
    protected QueryType rootAssetIntegrationId;
    @XmlElement(name = "RootBundleFlag")
    protected QueryType rootBundleFlag;
    @XmlElement(name = "RootCfgLatestReleasedFlag")
    protected QueryType rootCfgLatestReleasedFlag;
    @XmlElement(name = "RootCfgType")
    protected QueryType rootCfgType;
    @XmlElement(name = "RootItemPriceListId")
    protected QueryType rootItemPriceListId;
    @XmlElement(name = "RootLineItemDueDate")
    protected QueryType rootLineItemDueDate;
    @XmlElement(name = "RootOrderItemId")
    protected QueryType rootOrderItemId;
    @XmlElement(name = "RootPackageName")
    protected QueryType rootPackageName;
    @XmlElement(name = "RootProductDefTypeCode")
    protected QueryType rootProductDefTypeCode;
    @XmlElement(name = "RootProductId")
    protected QueryType rootProductId;
    @XmlElement(name = "RootProductName")
    protected QueryType rootProductName;
    @XmlElement(name = "RootProductTypeCode")
    protected QueryType rootProductTypeCode;
    @XmlElement(name = "SAP4xFreight")
    protected QueryType sap4XFreight;
    @XmlElement(name = "SAP4xNetPrice")
    protected QueryType sap4XNetPrice;
    @XmlElement(name = "SAP4xPlant")
    protected QueryType sap4XPlant;
    @XmlElement(name = "SAP4xTax")
    protected QueryType sap4XTax;
    @XmlElement(name = "SAP4xUnitNetPrice")
    protected QueryType sap4XUnitNetPrice;
    @XmlElement(name = "SAPConditionPricingUnit")
    protected QueryType sapConditionPricingUnit;
    @XmlElement(name = "SAPConditionUnit")
    protected QueryType sapConditionUnit;
    @XmlElement(name = "SAPCumulativeConfirmedQty")
    protected QueryType sapCumulativeConfirmedQty;
    @XmlElement(name = "SAPCurrency")
    protected QueryType sapCurrency;
    @XmlElement(name = "SAPDeliveryStatus")
    protected QueryType sapDeliveryStatus;
    @XmlElement(name = "SAPDeliveryStatusWide")
    protected QueryType sapDeliveryStatusWide;
    @XmlElement(name = "SAPInputId")
    protected QueryType sapInputId;
    @XmlElement(name = "SAPItemNumber")
    protected QueryType sapItemNumber;
    @XmlElement(name = "SAPItemShortText")
    protected QueryType sapItemShortText;
    @XmlElement(name = "SAPMaterialPart")
    protected QueryType sapMaterialPart;
    @XmlElement(name = "SAPNetPrice")
    protected QueryType sapNetPrice;
    @XmlElement(name = "SAPNetValue")
    protected QueryType sapNetValue;
    @XmlElement(name = "SAPParentId")
    protected QueryType sapParentId;
    @XmlElement(name = "SAPReferenceQty")
    protected QueryType sapReferenceQty;
    @XmlElement(name = "SAPRequestedQty")
    protected QueryType sapRequestedQty;
    @XmlElement(name = "SAPRequestedShipDate")
    protected QueryType sapRequestedShipDate;
    @XmlElement(name = "SAPSalesUnit")
    protected QueryType sapSalesUnit;
    @XmlElement(name = "SalesRepPosition")
    protected QueryType salesRepPosition;
    @XmlElement(name = "SalesRepPostnId")
    protected QueryType salesRepPostnId;
    @XmlElement(name = "SalesServiceFlag")
    protected QueryType salesServiceFlag;
    @XmlElement(name = "SalesUnitofMeasure")
    protected QueryType salesUnitofMeasure;
    @XmlElement(name = "ScheduledShipDate")
    protected QueryType scheduledShipDate;
    @XmlElement(name = "SerialNumber")
    protected QueryType serialNumber;
    @XmlElement(name = "Serialized")
    protected QueryType serialized;
    @XmlElement(name = "ServiceAccount")
    protected QueryType serviceAccount;
    @XmlElement(name = "ServiceAccountId")
    protected QueryType serviceAccountId;
    @XmlElement(name = "ServiceId")
    protected QueryType serviceId;
    @XmlElement(name = "ServicePriceAmount")
    protected QueryType servicePriceAmount;
    @XmlElement(name = "ServicePriceMethod")
    protected QueryType servicePriceMethod;
    @XmlElement(name = "ServicePricePercent")
    protected QueryType servicePricePercent;
    @XmlElement(name = "ShipCompleteFlag")
    protected QueryType shipCompleteFlag;
    @XmlElement(name = "ShipInstrustions")
    protected QueryType shipInstrustions;
    @XmlElement(name = "ShipMethod")
    protected QueryType shipMethod;
    @XmlElement(name = "ShipToAccount")
    protected QueryType shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected QueryType shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected QueryType shipToAccountIntegrationId;
    @XmlElement(name = "ShipToAccountLocation")
    protected QueryType shipToAccountLocation;
    @XmlElement(name = "ShipToAddress")
    protected QueryType shipToAddress;
    @XmlElement(name = "ShipToAddress2")
    protected QueryType shipToAddress2;
    @XmlElement(name = "ShipToAddressId")
    protected QueryType shipToAddressId;
    @XmlElement(name = "ShipToCity2")
    protected QueryType shipToCity2;
    @XmlElement(name = "ShipToContact-FirstName")
    protected QueryType shipToContactFirstName;
    @XmlElement(name = "ShipToContact-LastName")
    protected QueryType shipToContactLastName;
    @XmlElement(name = "ShipToContactId")
    protected QueryType shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected QueryType shipToContactIntegrationId;
    @XmlElement(name = "ShipToCountry2")
    protected QueryType shipToCountry2;
    @XmlElement(name = "ShipToFirstName")
    protected QueryType shipToFirstName;
    @XmlElement(name = "ShipToLastName")
    protected QueryType shipToLastName;
    @XmlElement(name = "ShipToState2")
    protected QueryType shipToState2;
    @XmlElement(name = "ShipToZip2")
    protected QueryType shipToZip2;
    @XmlElement(name = "ShipTogetherFlag")
    protected QueryType shipTogetherFlag;
    @XmlElement(name = "ShiptoAddressIntegrationId2")
    protected QueryType shiptoAddressIntegrationId2;
    @XmlElement(name = "ShipmentNumber")
    protected QueryType shipmentNumber;
    @XmlElement(name = "ShippingMethod")
    protected QueryType shippingMethod;
    @XmlElement(name = "SingleSourceFlag")
    protected QueryType singleSourceFlag;
    @XmlElement(name = "SkipPricingFlag")
    protected QueryType skipPricingFlag;
    @XmlElement(name = "SkipValidationFlag")
    protected QueryType skipValidationFlag;
    @XmlElement(name = "SmartPartNumber")
    protected QueryType smartPartNumber;
    @XmlElement(name = "SourceInventoryLocId")
    protected QueryType sourceInventoryLocId;
    @XmlElement(name = "SourceInventoryLocIntegrationId")
    protected QueryType sourceInventoryLocIntegrationId;
    @XmlElement(name = "SourceInventoryLocation2")
    protected QueryType sourceInventoryLocation2;
    @XmlElement(name = "SourceInventoryLocationReceiveToAddressId")
    protected QueryType sourceInventoryLocationReceiveToAddressId;
    @XmlElement(name = "SourceInventoryLocationReceiveToPostalCode")
    protected QueryType sourceInventoryLocationReceiveToPostalCode;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "TaxAmount")
    protected QueryType taxAmount;
    @XmlElement(name = "TaxAmountHeaderCurrency")
    protected QueryType taxAmountHeaderCurrency;
    @XmlElement(name = "TaxAmountInternalHeaderCurrency")
    protected QueryType taxAmountInternalHeaderCurrency;
    @XmlElement(name = "TaxExemptFlag")
    protected QueryType taxExemptFlag;
    @XmlElement(name = "TaxExemptNumber")
    protected QueryType taxExemptNumber;
    @XmlElement(name = "TaxExemptReason")
    protected QueryType taxExemptReason;
    @XmlElement(name = "TaxRate")
    protected QueryType taxRate;
    @XmlElement(name = "TaxSubcomponentFlag")
    protected QueryType taxSubcomponentFlag;
    @XmlElement(name = "TaxableFlag")
    protected QueryType taxableFlag;
    @XmlElement(name = "TerminationFee")
    protected QueryType terminationFee;
    @XmlElement(name = "ToNode")
    protected QueryType toNode;
    @XmlElement(name = "ToServiceAccount")
    protected QueryType toServiceAccount;
    @XmlElement(name = "ToServiceAccountId")
    protected QueryType toServiceAccountId;
    @XmlElement(name = "UnitNetPrice")
    protected QueryType unitNetPrice;
    @XmlElement(name = "UnitPrice")
    protected QueryType unitPrice;
    @XmlElement(name = "UnitPrice-Display")
    protected QueryType unitPriceDisplay;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "UpdatedByLogin2")
    protected QueryType updatedByLogin2;
    @XmlElement(name = "UsagePlanId")
    protected QueryType usagePlanId;
    @XmlElement(name = "UsagePlanName")
    protected QueryType usagePlanName;
    @XmlElement(name = "UsageScheduleId")
    protected QueryType usageScheduleId;
    @XmlElement(name = "UsageScheduleName")
    protected QueryType usageScheduleName;
    @XmlElement(name = "UsePlanId")
    protected QueryType usePlanId;
    @XmlElement(name = "UsePlanName")
    protected QueryType usePlanName;
    @XmlElement(name = "UseStartDate")
    protected QueryType useStartDate;
    @XmlElement(name = "VODRowId")
    protected QueryType vodRowId;
    @XmlElement(name = "ValidationDate")
    protected QueryType validationDate;
    @XmlElement(name = "ValidationStatus")
    protected QueryType validationStatus;
    @XmlElement(name = "Volume")
    protected QueryType volume;
    @XmlElement(name = "VolumeDiscountId")
    protected QueryType volumeDiscountId;
    @XmlElement(name = "VolumeDiscountIntegrationId")
    protected QueryType volumeDiscountIntegrationId;
    @XmlElement(name = "VolumeDiscountItem")
    protected QueryType volumeDiscountItem;
    @XmlElement(name = "VolumeDiscountItemId")
    protected QueryType volumeDiscountItemId;
    @XmlElement(name = "VolumeDiscountMaxQty")
    protected QueryType volumeDiscountMaxQty;
    @XmlElement(name = "VolumeDiscountMethod")
    protected QueryType volumeDiscountMethod;
    @XmlElement(name = "VolumeDiscountMinQty")
    protected QueryType volumeDiscountMinQty;
    @XmlElement(name = "VolumeUoM")
    protected QueryType volumeUoM;
    @XmlElement(name = "VolumeUpsellItem")
    protected QueryType volumeUpsellItem;
    @XmlElement(name = "VolumeUpsellItemId")
    protected QueryType volumeUpsellItemId;
    @XmlElement(name = "VolumeUpsellMessage")
    protected QueryType volumeUpsellMessage;
    @XmlElement(name = "WarrantyRecoveryFlag")
    protected QueryType warrantyRecoveryFlag;
    @XmlElement(name = "Write-InProduct")
    protected QueryType writeInProduct;
    @XmlElement(name = "Write-InProductFlag")
    protected QueryType writeInProductFlag;
    @XmlElement(name = "Write-InProductReadOnlyFlag")
    protected QueryType writeInProductReadOnlyFlag;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

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
     * Gets the value of the atpReserved property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getATPReserved() {
        return atpReserved;
    }

    /**
     * Sets the value of the atpReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setATPReserved(QueryType value) {
        this.atpReserved = value;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActionCode(QueryType value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActivityId(QueryType value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the activityRecommendedPartId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActivityRecommendedPartId() {
        return activityRecommendedPartId;
    }

    /**
     * Sets the value of the activityRecommendedPartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActivityRecommendedPartId(QueryType value) {
        this.activityRecommendedPartId = value;
    }

    /**
     * Gets the value of the adjustCharge property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustCharge() {
        return adjustCharge;
    }

    /**
     * Sets the value of the adjustCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustCharge(QueryType value) {
        this.adjustCharge = value;
    }

    /**
     * Gets the value of the adjustDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustDate() {
        return adjustDate;
    }

    /**
     * Sets the value of the adjustDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustDate(QueryType value) {
        this.adjustDate = value;
    }

    /**
     * Gets the value of the adjustedListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustedListPrice() {
        return adjustedListPrice;
    }

    /**
     * Sets the value of the adjustedListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustedListPrice(QueryType value) {
        this.adjustedListPrice = value;
    }

    /**
     * Gets the value of the adjustedListPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustedListPriceDisplay() {
        return adjustedListPriceDisplay;
    }

    /**
     * Sets the value of the adjustedListPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustedListPriceDisplay(QueryType value) {
        this.adjustedListPriceDisplay = value;
    }

    /**
     * Gets the value of the aggregrateTotalSkip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAggregrateTotalSkip() {
        return aggregrateTotalSkip;
    }

    /**
     * Sets the value of the aggregrateTotalSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAggregrateTotalSkip(QueryType value) {
        this.aggregrateTotalSkip = value;
    }

    /**
     * Gets the value of the amountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAmountExchangeDate() {
        return amountExchangeDate;
    }

    /**
     * Sets the value of the amountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAmountExchangeDate(QueryType value) {
        this.amountExchangeDate = value;
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
     * Gets the value of the assetExternalIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetExternalIntegrationId() {
        return assetExternalIntegrationId;
    }

    /**
     * Sets the value of the assetExternalIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetExternalIntegrationId(QueryType value) {
        this.assetExternalIntegrationId = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetId(QueryType value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetIntegrationId(QueryType value) {
        this.assetIntegrationId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetNumber(QueryType value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetStatus(QueryType value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the auctionItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAuctionItemId() {
        return auctionItemId;
    }

    /**
     * Sets the value of the auctionItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAuctionItemId(QueryType value) {
        this.auctionItemId = value;
    }

    /**
     * Gets the value of the auctionItemName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAuctionItemName() {
        return auctionItemName;
    }

    /**
     * Sets the value of the auctionItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAuctionItemName(QueryType value) {
        this.auctionItemName = value;
    }

    /**
     * Gets the value of the auctionItemReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAuctionItemReadOnlyFlag() {
        return auctionItemReadOnlyFlag;
    }

    /**
     * Sets the value of the auctionItemReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAuctionItemReadOnlyFlag(QueryType value) {
        this.auctionItemReadOnlyFlag = value;
    }

    /**
     * Gets the value of the autoChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAutoChargeFlag() {
        return autoChargeFlag;
    }

    /**
     * Sets the value of the autoChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAutoChargeFlag(QueryType value) {
        this.autoChargeFlag = value;
    }

    /**
     * Gets the value of the autoExplodeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAutoExplodeFlag() {
        return autoExplodeFlag;
    }

    /**
     * Sets the value of the autoExplodeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAutoExplodeFlag(QueryType value) {
        this.autoExplodeFlag = value;
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
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAvailableQuantity(QueryType value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the bcReadOnlyFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBCReadOnlyFlag2() {
        return bcReadOnlyFlag2;
    }

    /**
     * Sets the value of the bcReadOnlyFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBCReadOnlyFlag2(QueryType value) {
        this.bcReadOnlyFlag2 = value;
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
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBasePrice(QueryType value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the basePriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBasePriceDisplay() {
        return basePriceDisplay;
    }

    /**
     * Sets the value of the basePriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBasePriceDisplay(QueryType value) {
        this.basePriceDisplay = value;
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
     * Gets the value of the cdaPagesetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCDAPagesetId() {
        return cdaPagesetId;
    }

    /**
     * Sets the value of the cdaPagesetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCDAPagesetId(QueryType value) {
        this.cdaPagesetId = value;
    }

    /**
     * Gets the value of the calculatedAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAssetStatus() {
        return calculatedAssetStatus;
    }

    /**
     * Sets the value of the calculatedAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAssetStatus(QueryType value) {
        this.calculatedAssetStatus = value;
    }

    /**
     * Gets the value of the calculatedDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedDueDate() {
        return calculatedDueDate;
    }

    /**
     * Sets the value of the calculatedDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedDueDate(QueryType value) {
        this.calculatedDueDate = value;
    }

    /**
     * Gets the value of the calculatedExtendedLineTotalRootsandPackageComponents property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedExtendedLineTotalRootsandPackageComponents() {
        return calculatedExtendedLineTotalRootsandPackageComponents;
    }

    /**
     * Sets the value of the calculatedExtendedLineTotalRootsandPackageComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedExtendedLineTotalRootsandPackageComponents(QueryType value) {
        this.calculatedExtendedLineTotalRootsandPackageComponents = value;
    }

    /**
     * Gets the value of the calculatedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedLineTotal() {
        return calculatedLineTotal;
    }

    /**
     * Sets the value of the calculatedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedLineTotal(QueryType value) {
        this.calculatedLineTotal = value;
    }

    /**
     * Gets the value of the calculatedLineTotalUI property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedLineTotalUI() {
        return calculatedLineTotalUI;
    }

    /**
     * Sets the value of the calculatedLineTotalUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedLineTotalUI(QueryType value) {
        this.calculatedLineTotalUI = value;
    }

    /**
     * Gets the value of the calculatedNetDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedNetDiscountAmount() {
        return calculatedNetDiscountAmount;
    }

    /**
     * Sets the value of the calculatedNetDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedNetDiscountAmount(QueryType value) {
        this.calculatedNetDiscountAmount = value;
    }

    /**
     * Gets the value of the calculatedNetDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedNetDiscountPercent() {
        return calculatedNetDiscountPercent;
    }

    /**
     * Sets the value of the calculatedNetDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedNetDiscountPercent(QueryType value) {
        this.calculatedNetDiscountPercent = value;
    }

    /**
     * Gets the value of the calculatedNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedNetPrice() {
        return calculatedNetPrice;
    }

    /**
     * Sets the value of the calculatedNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedNetPrice(QueryType value) {
        this.calculatedNetPrice = value;
    }

    /**
     * Gets the value of the calculatedNetworkElementType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedNetworkElementType() {
        return calculatedNetworkElementType;
    }

    /**
     * Sets the value of the calculatedNetworkElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedNetworkElementType(QueryType value) {
        this.calculatedNetworkElementType = value;
    }

    /**
     * Gets the value of the calculatedNonDiscountedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedNonDiscountedLineTotal() {
        return calculatedNonDiscountedLineTotal;
    }

    /**
     * Sets the value of the calculatedNonDiscountedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedNonDiscountedLineTotal(QueryType value) {
        this.calculatedNonDiscountedLineTotal = value;
    }

    /**
     * Gets the value of the calculatedProductLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedProductLineTotal() {
        return calculatedProductLineTotal;
    }

    /**
     * Sets the value of the calculatedProductLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedProductLineTotal(QueryType value) {
        this.calculatedProductLineTotal = value;
    }

    /**
     * Gets the value of the calculatedServiceLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedServiceLineTotal() {
        return calculatedServiceLineTotal;
    }

    /**
     * Sets the value of the calculatedServiceLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedServiceLineTotal(QueryType value) {
        this.calculatedServiceLineTotal = value;
    }

    /**
     * Gets the value of the calculatedTrainingLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedTrainingLineTotal() {
        return calculatedTrainingLineTotal;
    }

    /**
     * Sets the value of the calculatedTrainingLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedTrainingLineTotal(QueryType value) {
        this.calculatedTrainingLineTotal = value;
    }

    /**
     * Gets the value of the calculatedYourPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedYourPrice() {
        return calculatedYourPrice;
    }

    /**
     * Sets the value of the calculatedYourPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedYourPrice(QueryType value) {
        this.calculatedYourPrice = value;
    }

    /**
     * Gets the value of the cancelledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCancelledQuantity() {
        return cancelledQuantity;
    }

    /**
     * Sets the value of the cancelledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCancelledQuantity(QueryType value) {
        this.cancelledQuantity = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrierCode(QueryType value) {
        this.carrierCode = value;
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
     * Gets the value of the cfgActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgActiveFlag() {
        return cfgActiveFlag;
    }

    /**
     * Sets the value of the cfgActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgActiveFlag(QueryType value) {
        this.cfgActiveFlag = value;
    }

    /**
     * Gets the value of the cfgEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgEndDate() {
        return cfgEndDate;
    }

    /**
     * Sets the value of the cfgEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgEndDate(QueryType value) {
        this.cfgEndDate = value;
    }

    /**
     * Gets the value of the cfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgLatestReleasedFlag() {
        return cfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the cfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgLatestReleasedFlag(QueryType value) {
        this.cfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgObjectDefFirstVersion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgObjectDefFirstVersion() {
        return cfgObjectDefFirstVersion;
    }

    /**
     * Sets the value of the cfgObjectDefFirstVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgObjectDefFirstVersion(QueryType value) {
        this.cfgObjectDefFirstVersion = value;
    }

    /**
     * Gets the value of the cfgObjectDefLastVersion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgObjectDefLastVersion() {
        return cfgObjectDefLastVersion;
    }

    /**
     * Sets the value of the cfgObjectDefLastVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgObjectDefLastVersion(QueryType value) {
        this.cfgObjectDefLastVersion = value;
    }

    /**
     * Gets the value of the cfgReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgReleasedFlag() {
        return cfgReleasedFlag;
    }

    /**
     * Sets the value of the cfgReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgReleasedFlag(QueryType value) {
        this.cfgReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgStartDate() {
        return cfgStartDate;
    }

    /**
     * Sets the value of the cfgStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgStartDate(QueryType value) {
        this.cfgStartDate = value;
    }

    /**
     * Gets the value of the cfgStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgStateCode() {
        return cfgStateCode;
    }

    /**
     * Sets the value of the cfgStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgStateCode(QueryType value) {
        this.cfgStateCode = value;
    }

    /**
     * Gets the value of the cfgType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgType() {
        return cfgType;
    }

    /**
     * Sets the value of the cfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgType(QueryType value) {
        this.cfgType = value;
    }

    /**
     * Gets the value of the cfgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgVersion() {
        return cfgVersion;
    }

    /**
     * Sets the value of the cfgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgVersion(QueryType value) {
        this.cfgVersion = value;
    }

    /**
     * Gets the value of the changeCost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChangeCost() {
        return changeCost;
    }

    /**
     * Sets the value of the changeCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChangeCost(QueryType value) {
        this.changeCost = value;
    }

    /**
     * Gets the value of the chargeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChargeEndDate() {
        return chargeEndDate;
    }

    /**
     * Sets the value of the chargeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChargeEndDate(QueryType value) {
        this.chargeEndDate = value;
    }

    /**
     * Gets the value of the chargeTimingType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChargeTimingType() {
        return chargeTimingType;
    }

    /**
     * Sets the value of the chargeTimingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChargeTimingType(QueryType value) {
        this.chargeTimingType = value;
    }

    /**
     * Gets the value of the classDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassDisplayName() {
        return classDisplayName;
    }

    /**
     * Sets the value of the classDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassDisplayName(QueryType value) {
        this.classDisplayName = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassName(QueryType value) {
        this.className = value;
    }

    /**
     * Gets the value of the classOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassOfferId() {
        return classOfferId;
    }

    /**
     * Sets the value of the classOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassOfferId(QueryType value) {
        this.classOfferId = value;
    }

    /**
     * Gets the value of the classRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassRegistrationId() {
        return classRegistrationId;
    }

    /**
     * Sets the value of the classRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassRegistrationId(QueryType value) {
        this.classRegistrationId = value;
    }

    /**
     * Gets the value of the classRegistrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassRegistrationStatus() {
        return classRegistrationStatus;
    }

    /**
     * Sets the value of the classRegistrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassRegistrationStatus(QueryType value) {
        this.classRegistrationStatus = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassType(QueryType value) {
        this.classType = value;
    }

    /**
     * Gets the value of the compoundProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCompoundProductFlag() {
        return compoundProductFlag;
    }

    /**
     * Sets the value of the compoundProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCompoundProductFlag(QueryType value) {
        this.compoundProductFlag = value;
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
     * Gets the value of the configurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConfigurationModelId() {
        return configurationModelId;
    }

    /**
     * Sets the value of the configurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConfigurationModelId(QueryType value) {
        this.configurationModelId = value;
    }

    /**
     * Gets the value of the connectionReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConnectionReadOnlyFlag() {
        return connectionReadOnlyFlag;
    }

    /**
     * Sets the value of the connectionReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConnectionReadOnlyFlag(QueryType value) {
        this.connectionReadOnlyFlag = value;
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
     * Gets the value of the convertToAssetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConvertToAssetFlag() {
        return convertToAssetFlag;
    }

    /**
     * Sets the value of the convertToAssetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConvertToAssetFlag(QueryType value) {
        this.convertToAssetFlag = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCost(QueryType value) {
        this.cost = value;
    }

    /**
     * Gets the value of the coveredAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredAssetId() {
        return coveredAssetId;
    }

    /**
     * Sets the value of the coveredAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredAssetId(QueryType value) {
        this.coveredAssetId = value;
    }

    /**
     * Gets the value of the coveredAssetProduct property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredAssetProduct() {
        return coveredAssetProduct;
    }

    /**
     * Sets the value of the coveredAssetProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredAssetProduct(QueryType value) {
        this.coveredAssetProduct = value;
    }

    /**
     * Gets the value of the coveredAssetProductId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredAssetProductId() {
        return coveredAssetProductId;
    }

    /**
     * Sets the value of the coveredAssetProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredAssetProductId(QueryType value) {
        this.coveredAssetProductId = value;
    }

    /**
     * Gets the value of the coveredLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredLineNumber() {
        return coveredLineNumber;
    }

    /**
     * Sets the value of the coveredLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredLineNumber(QueryType value) {
        this.coveredLineNumber = value;
    }

    /**
     * Gets the value of the coveredProduct property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProduct() {
        return coveredProduct;
    }

    /**
     * Sets the value of the coveredProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProduct(QueryType value) {
        this.coveredProduct = value;
    }

    /**
     * Gets the value of the coveredProductBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductBasePrice() {
        return coveredProductBasePrice;
    }

    /**
     * Sets the value of the coveredProductBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductBasePrice(QueryType value) {
        this.coveredProductBasePrice = value;
    }

    /**
     * Gets the value of the coveredProductDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductDiscount() {
        return coveredProductDiscount;
    }

    /**
     * Sets the value of the coveredProductDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductDiscount(QueryType value) {
        this.coveredProductDiscount = value;
    }

    /**
     * Gets the value of the coveredProductDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductDiscountAmount() {
        return coveredProductDiscountAmount;
    }

    /**
     * Sets the value of the coveredProductDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductDiscountAmount(QueryType value) {
        this.coveredProductDiscountAmount = value;
    }

    /**
     * Gets the value of the coveredProductDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductDiscountPercent() {
        return coveredProductDiscountPercent;
    }

    /**
     * Sets the value of the coveredProductDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductDiscountPercent(QueryType value) {
        this.coveredProductDiscountPercent = value;
    }

    /**
     * Gets the value of the coveredProductId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductId() {
        return coveredProductId;
    }

    /**
     * Sets the value of the coveredProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductId(QueryType value) {
        this.coveredProductId = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductItemPrice() {
        return coveredProductItemPrice;
    }

    /**
     * Sets the value of the coveredProductItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductItemPrice(QueryType value) {
        this.coveredProductItemPrice = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice1 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductItemPrice1() {
        return coveredProductItemPrice1;
    }

    /**
     * Sets the value of the coveredProductItemPrice1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductItemPrice1(QueryType value) {
        this.coveredProductItemPrice1 = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductItemPrice2() {
        return coveredProductItemPrice2;
    }

    /**
     * Sets the value of the coveredProductItemPrice2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductItemPrice2(QueryType value) {
        this.coveredProductItemPrice2 = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductItemPrice3() {
        return coveredProductItemPrice3;
    }

    /**
     * Sets the value of the coveredProductItemPrice3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductItemPrice3(QueryType value) {
        this.coveredProductItemPrice3 = value;
    }

    /**
     * Gets the value of the coveredProductNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductNetPrice() {
        return coveredProductNetPrice;
    }

    /**
     * Sets the value of the coveredProductNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductNetPrice(QueryType value) {
        this.coveredProductNetPrice = value;
    }

    /**
     * Gets the value of the coveredProductReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductReadOnlyFlag() {
        return coveredProductReadOnlyFlag;
    }

    /**
     * Sets the value of the coveredProductReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductReadOnlyFlag(QueryType value) {
        this.coveredProductReadOnlyFlag = value;
    }

    /**
     * Gets the value of the coveredProductRollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductRollupAmount() {
        return coveredProductRollupAmount;
    }

    /**
     * Sets the value of the coveredProductRollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductRollupAmount(QueryType value) {
        this.coveredProductRollupAmount = value;
    }

    /**
     * Gets the value of the coveredProductUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredProductUnitPrice() {
        return coveredProductUnitPrice;
    }

    /**
     * Sets the value of the coveredProductUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredProductUnitPrice(QueryType value) {
        this.coveredProductUnitPrice = value;
    }

    /**
     * Gets the value of the coveredQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCoveredQuoteItemId() {
        return coveredQuoteItemId;
    }

    /**
     * Sets the value of the coveredQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCoveredQuoteItemId(QueryType value) {
        this.coveredQuoteItemId = value;
    }

    /**
     * Gets the value of the createdByLogin property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreatedByLogin() {
        return createdByLogin;
    }

    /**
     * Sets the value of the createdByLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreatedByLogin(QueryType value) {
        this.createdByLogin = value;
    }

    /**
     * Gets the value of the cumulativeConfQty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCumulativeConfQty() {
        return cumulativeConfQty;
    }

    /**
     * Sets the value of the cumulativeConfQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCumulativeConfQty(QueryType value) {
        this.cumulativeConfQty = value;
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
     * Gets the value of the currencyCodePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrencyCodePrecision() {
        return currencyCodePrecision;
    }

    /**
     * Sets the value of the currencyCodePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrencyCodePrecision(QueryType value) {
        this.currencyCodePrecision = value;
    }

    /**
     * Gets the value of the deleteClassRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDeleteClassRegistration() {
        return deleteClassRegistration;
    }

    /**
     * Sets the value of the deleteClassRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDeleteClassRegistration(QueryType value) {
        this.deleteClassRegistration = value;
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
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescription2(QueryType value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the destinationInventoryLocId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDestinationInventoryLocId() {
        return destinationInventoryLocId;
    }

    /**
     * Sets the value of the destinationInventoryLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDestinationInventoryLocId(QueryType value) {
        this.destinationInventoryLocId = value;
    }

    /**
     * Gets the value of the destinationInventoryLocation2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDestinationInventoryLocation2() {
        return destinationInventoryLocation2;
    }

    /**
     * Sets the value of the destinationInventoryLocation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDestinationInventoryLocation2(QueryType value) {
        this.destinationInventoryLocation2 = value;
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
     * Gets the value of the discount2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscount2() {
        return discount2;
    }

    /**
     * Sets the value of the discount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscount2(QueryType value) {
        this.discount2 = value;
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
     * Gets the value of the discountAmountDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountAmountDisplay() {
        return discountAmountDisplay;
    }

    /**
     * Sets the value of the discountAmountDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountAmountDisplay(QueryType value) {
        this.discountAmountDisplay = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountPercent(QueryType value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountPercentDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountPercentDisplay() {
        return discountPercentDisplay;
    }

    /**
     * Sets the value of the discountPercentDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountPercentDisplay(QueryType value) {
        this.discountPercentDisplay = value;
    }

    /**
     * Gets the value of the discountSource property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountSource() {
        return discountSource;
    }

    /**
     * Sets the value of the discountSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountSource(QueryType value) {
        this.discountSource = value;
    }

    /**
     * Gets the value of the displayPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDisplayPackageName() {
        return displayPackageName;
    }

    /**
     * Sets the value of the displayPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDisplayPackageName(QueryType value) {
        this.displayPackageName = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDueDate(QueryType value) {
        this.dueDate = value;
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
     * Gets the value of the earliestTermDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEarliestTermDate() {
        return earliestTermDate;
    }

    /**
     * Sets the value of the earliestTermDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEarliestTermDate(QueryType value) {
        this.earliestTermDate = value;
    }

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectiveFrom(QueryType value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the effectivePricingPeriodId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectivePricingPeriodId() {
        return effectivePricingPeriodId;
    }

    /**
     * Sets the value of the effectivePricingPeriodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectivePricingPeriodId(QueryType value) {
        this.effectivePricingPeriodId = value;
    }

    /**
     * Gets the value of the effectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectiveTo() {
        return effectiveTo;
    }

    /**
     * Sets the value of the effectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectiveTo(QueryType value) {
        this.effectiveTo = value;
    }

    /**
     * Gets the value of the eligibilityReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEligibilityReason() {
        return eligibilityReason;
    }

    /**
     * Sets the value of the eligibilityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEligibilityReason(QueryType value) {
        this.eligibilityReason = value;
    }

    /**
     * Gets the value of the eligibilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Sets the value of the eligibilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEligibilityStatus(QueryType value) {
        this.eligibilityStatus = value;
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
     * Gets the value of the excludePricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExcludePricingFlag() {
        return excludePricingFlag;
    }

    /**
     * Sets the value of the excludePricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExcludePricingFlag(QueryType value) {
        this.excludePricingFlag = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExpectedDeliveryDate(QueryType value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the extendedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExtendedLineTotal() {
        return extendedLineTotal;
    }

    /**
     * Sets the value of the extendedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExtendedLineTotal(QueryType value) {
        this.extendedLineTotal = value;
    }

    /**
     * Gets the value of the extendedLineTotalDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExtendedLineTotalDisplay() {
        return extendedLineTotalDisplay;
    }

    /**
     * Sets the value of the extendedLineTotalDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExtendedLineTotalDisplay(QueryType value) {
        this.extendedLineTotalDisplay = value;
    }

    /**
     * Gets the value of the extendedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExtendedQuantity() {
        return extendedQuantity;
    }

    /**
     * Sets the value of the extendedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExtendedQuantity(QueryType value) {
        this.extendedQuantity = value;
    }

    /**
     * Gets the value of the externalFulfillLoc property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExternalFulfillLoc() {
        return externalFulfillLoc;
    }

    /**
     * Sets the value of the externalFulfillLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExternalFulfillLoc(QueryType value) {
        this.externalFulfillLoc = value;
    }

    /**
     * Gets the value of the fixPriceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFixPriceFlag() {
        return fixPriceFlag;
    }

    /**
     * Sets the value of the fixPriceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFixPriceFlag(QueryType value) {
        this.fixPriceFlag = value;
    }

    /**
     * Gets the value of the forcastableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getForcastableFlag() {
        return forcastableFlag;
    }

    /**
     * Sets the value of the forcastableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setForcastableFlag(QueryType value) {
        this.forcastableFlag = value;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreightAmount(QueryType value) {
        this.freightAmount = value;
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
     * Gets the value of the functionalCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFunctionalCurrencyCode() {
        return functionalCurrencyCode;
    }

    /**
     * Sets the value of the functionalCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFunctionalCurrencyCode(QueryType value) {
        this.functionalCurrencyCode = value;
    }

    /**
     * Gets the value of the functionalExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFunctionalExchangeDate() {
        return functionalExchangeDate;
    }

    /**
     * Sets the value of the functionalExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFunctionalExchangeDate(QueryType value) {
        this.functionalExchangeDate = value;
    }

    /**
     * Gets the value of the functionalItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFunctionalItemPrice() {
        return functionalItemPrice;
    }

    /**
     * Sets the value of the functionalItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFunctionalItemPrice(QueryType value) {
        this.functionalItemPrice = value;
    }

    /**
     * Gets the value of the functionalLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFunctionalLineTotal() {
        return functionalLineTotal;
    }

    /**
     * Sets the value of the functionalLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFunctionalLineTotal(QueryType value) {
        this.functionalLineTotal = value;
    }

    /**
     * Gets the value of the functionalUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFunctionalUnitPrice() {
        return functionalUnitPrice;
    }

    /**
     * Sets the value of the functionalUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFunctionalUnitPrice(QueryType value) {
        this.functionalUnitPrice = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setGrossWeight(QueryType value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the grossWeightUoM property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getGrossWeightUoM() {
        return grossWeightUoM;
    }

    /**
     * Sets the value of the grossWeightUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setGrossWeightUoM(QueryType value) {
        this.grossWeightUoM = value;
    }

    /**
     * Gets the value of the hasChildren property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHasChildren(QueryType value) {
        this.hasChildren = value;
    }

    /**
     * Gets the value of the hasGenericsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHasGenericsFlag() {
        return hasGenericsFlag;
    }

    /**
     * Sets the value of the hasGenericsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHasGenericsFlag(QueryType value) {
        this.hasGenericsFlag = value;
    }

    /**
     * Gets the value of the headerCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderCurrencyCode() {
        return headerCurrencyCode;
    }

    /**
     * Sets the value of the headerCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderCurrencyCode(QueryType value) {
        this.headerCurrencyCode = value;
    }

    /**
     * Gets the value of the headerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderDiscount() {
        return headerDiscount;
    }

    /**
     * Sets the value of the headerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderDiscount(QueryType value) {
        this.headerDiscount = value;
    }

    /**
     * Gets the value of the headerDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderDiscountAmount() {
        return headerDiscountAmount;
    }

    /**
     * Sets the value of the headerDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderDiscountAmount(QueryType value) {
        this.headerDiscountAmount = value;
    }

    /**
     * Gets the value of the headerExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderExchangeDate() {
        return headerExchangeDate;
    }

    /**
     * Sets the value of the headerExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderExchangeDate(QueryType value) {
        this.headerExchangeDate = value;
    }

    /**
     * Gets the value of the headerRevision property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderRevision() {
        return headerRevision;
    }

    /**
     * Sets the value of the headerRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderRevision(QueryType value) {
        this.headerRevision = value;
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
     * Gets the value of the holdReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHoldReason() {
        return holdReason;
    }

    /**
     * Sets the value of the holdReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHoldReason(QueryType value) {
        this.holdReason = value;
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
     * Gets the value of the incentiveStatusChangedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIncentiveStatusChangedFlg() {
        return incentiveStatusChangedFlg;
    }

    /**
     * Sets the value of the incentiveStatusChangedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIncentiveStatusChangedFlg(QueryType value) {
        this.incentiveStatusChangedFlg = value;
    }

    /**
     * Gets the value of the inclusiveEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInclusiveEligibilityFlag() {
        return inclusiveEligibilityFlag;
    }

    /**
     * Sets the value of the inclusiveEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInclusiveEligibilityFlag(QueryType value) {
        this.inclusiveEligibilityFlag = value;
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
     * Gets the value of the invoicedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Sets the value of the invoicedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInvoicedQuantity(QueryType value) {
        this.invoicedQuantity = value;
    }

    /**
     * Gets the value of the isExpanded property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsExpanded() {
        return isExpanded;
    }

    /**
     * Sets the value of the isExpanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsExpanded(QueryType value) {
        this.isExpanded = value;
    }

    /**
     * Gets the value of the isComplexProduct property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProduct() {
        return isComplexProduct;
    }

    /**
     * Sets the value of the isComplexProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProduct(QueryType value) {
        this.isComplexProduct = value;
    }

    /**
     * Gets the value of the isComplexProductBundleComponent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductBundleComponent() {
        return isComplexProductBundleComponent;
    }

    /**
     * Sets the value of the isComplexProductBundleComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductBundleComponent(QueryType value) {
        this.isComplexProductBundleComponent = value;
    }

    /**
     * Gets the value of the isComplexProductComponent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductComponent() {
        return isComplexProductComponent;
    }

    /**
     * Sets the value of the isComplexProductComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductComponent(QueryType value) {
        this.isComplexProductComponent = value;
    }

    /**
     * Gets the value of the isComplexProductNotBundle property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductNotBundle() {
        return isComplexProductNotBundle;
    }

    /**
     * Sets the value of the isComplexProductNotBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductNotBundle(QueryType value) {
        this.isComplexProductNotBundle = value;
    }

    /**
     * Gets the value of the isComplexProductNotBundleRoot property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductNotBundleRoot() {
        return isComplexProductNotBundleRoot;
    }

    /**
     * Sets the value of the isComplexProductNotBundleRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductNotBundleRoot(QueryType value) {
        this.isComplexProductNotBundleRoot = value;
    }

    /**
     * Gets the value of the isComplexProductORBundleComponent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductORBundleComponent() {
        return isComplexProductORBundleComponent;
    }

    /**
     * Sets the value of the isComplexProductORBundleComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductORBundleComponent(QueryType value) {
        this.isComplexProductORBundleComponent = value;
    }

    /**
     * Gets the value of the isComplexProductRoot property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductRoot() {
        return isComplexProductRoot;
    }

    /**
     * Sets the value of the isComplexProductRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductRoot(QueryType value) {
        this.isComplexProductRoot = value;
    }

    /**
     * Gets the value of the isPackageProductComponent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsPackageProductComponent() {
        return isPackageProductComponent;
    }

    /**
     * Sets the value of the isPackageProductComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsPackageProductComponent(QueryType value) {
        this.isPackageProductComponent = value;
    }

    /**
     * Gets the value of the isRootItem property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsRootItem() {
        return isRootItem;
    }

    /**
     * Sets the value of the isRootItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsRootItem(QueryType value) {
        this.isRootItem = value;
    }

    /**
     * Gets the value of the itemDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemDisplayName() {
        return itemDisplayName;
    }

    /**
     * Sets the value of the itemDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemDisplayName(QueryType value) {
        this.itemDisplayName = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemPrice(QueryType value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemPriceDisplay() {
        return itemPriceDisplay;
    }

    /**
     * Sets the value of the itemPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemPriceDisplay(QueryType value) {
        this.itemPriceDisplay = value;
    }

    /**
     * Gets the value of the itemPriceList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemPriceList() {
        return itemPriceList;
    }

    /**
     * Sets the value of the itemPriceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemPriceList(QueryType value) {
        this.itemPriceList = value;
    }

    /**
     * Gets the value of the itemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemPriceListId() {
        return itemPriceListId;
    }

    /**
     * Sets the value of the itemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemPriceListId(QueryType value) {
        this.itemPriceListId = value;
    }

    /**
     * Gets the value of the itemPriceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemPriceListIntegrationId() {
        return itemPriceListIntegrationId;
    }

    /**
     * Sets the value of the itemPriceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemPriceListIntegrationId(QueryType value) {
        this.itemPriceListIntegrationId = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemType(QueryType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the itemTypeLanguageIndependent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemTypeLanguageIndependent() {
        return itemTypeLanguageIndependent;
    }

    /**
     * Sets the value of the itemTypeLanguageIndependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemTypeLanguageIndependent(QueryType value) {
        this.itemTypeLanguageIndependent = value;
    }

    /**
     * Gets the value of the itemIsProduct property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemIsProduct() {
        return itemIsProduct;
    }

    /**
     * Sets the value of the itemIsProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemIsProduct(QueryType value) {
        this.itemIsProduct = value;
    }

    /**
     * Gets the value of the labeledProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLabeledProductFlag() {
        return labeledProductFlag;
    }

    /**
     * Sets the value of the labeledProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLabeledProductFlag(QueryType value) {
        this.labeledProductFlag = value;
    }

    /**
     * Gets the value of the lateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLateFlag() {
        return lateFlag;
    }

    /**
     * Sets the value of the lateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLateFlag(QueryType value) {
        this.lateFlag = value;
    }

    /**
     * Gets the value of the lineItemNetTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineItemNetTotal() {
        return lineItemNetTotal;
    }

    /**
     * Sets the value of the lineItemNetTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineItemNetTotal(QueryType value) {
        this.lineItemNetTotal = value;
    }

    /**
     * Gets the value of the lineNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineNumber2() {
        return lineNumber2;
    }

    /**
     * Sets the value of the lineNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineNumber2(QueryType value) {
        this.lineNumber2 = value;
    }

    /**
     * Gets the value of the lineNumber22 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineNumber22() {
        return lineNumber22;
    }

    /**
     * Sets the value of the lineNumber22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineNumber22(QueryType value) {
        this.lineNumber22 = value;
    }

    /**
     * Gets the value of the lineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineTotal() {
        return lineTotal;
    }

    /**
     * Sets the value of the lineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineTotal(QueryType value) {
        this.lineTotal = value;
    }

    /**
     * Gets the value of the lineTotalDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineTotalDisplay() {
        return lineTotalDisplay;
    }

    /**
     * Sets the value of the lineTotalDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineTotalDisplay(QueryType value) {
        this.lineTotalDisplay = value;
    }

    /**
     * Gets the value of the lineTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineTotalinHeaderCurrency() {
        return lineTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the lineTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineTotalinHeaderCurrency(QueryType value) {
        this.lineTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the loanerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLoanerFlag() {
        return loanerFlag;
    }

    /**
     * Sets the value of the loanerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLoanerFlag(QueryType value) {
        this.loanerFlag = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMRCCxTotal(QueryType value) {
        this.mrcCxTotal = value;
    }

    /**
     * Gets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMRCCxTotalinHeaderCurrency() {
        return mrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMRCCxTotalinHeaderCurrency(QueryType value) {
        this.mrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMaxPrice(QueryType value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMaximumQuantity(QueryType value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMinPrice(QueryType value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the minimumLot property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMinimumLot() {
        return minimumLot;
    }

    /**
     * Sets the value of the minimumLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMinimumLot(QueryType value) {
        this.minimumLot = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMinimumQuantity(QueryType value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the notWriteInProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNOTWriteInProductFlag() {
        return notWriteInProductFlag;
    }

    /**
     * Sets the value of the notWriteInProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNOTWriteInProductFlag(QueryType value) {
        this.notWriteInProductFlag = value;
    }

    /**
     * Gets the value of the nrcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCAmount() {
        return nrcAmount;
    }

    /**
     * Sets the value of the nrcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCAmount(QueryType value) {
        this.nrcAmount = value;
    }

    /**
     * Gets the value of the nrcCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCCurrencyCode() {
        return nrcCurrencyCode;
    }

    /**
     * Sets the value of the nrcCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCCurrencyCode(QueryType value) {
        this.nrcCurrencyCode = value;
    }

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCCxTotal(QueryType value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCCxTotalinHeaderCurrency() {
        return nrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCCxTotalinHeaderCurrency(QueryType value) {
        this.nrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the nrcExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCExchangeDate() {
        return nrcExchangeDate;
    }

    /**
     * Sets the value of the nrcExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCExchangeDate(QueryType value) {
        this.nrcExchangeDate = value;
    }

    /**
     * Gets the value of the nrcNumberofBills property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCNumberofBills() {
        return nrcNumberofBills;
    }

    /**
     * Sets the value of the nrcNumberofBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCNumberofBills(QueryType value) {
        this.nrcNumberofBills = value;
    }

    /**
     * Gets the value of the nrcPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCPlanId() {
        return nrcPlanId;
    }

    /**
     * Sets the value of the nrcPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCPlanId(QueryType value) {
        this.nrcPlanId = value;
    }

    /**
     * Gets the value of the nrcPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCPlanName() {
        return nrcPlanName;
    }

    /**
     * Sets the value of the nrcPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCPlanName(QueryType value) {
        this.nrcPlanName = value;
    }

    /**
     * Gets the value of the nrcScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCScheduleId() {
        return nrcScheduleId;
    }

    /**
     * Sets the value of the nrcScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCScheduleId(QueryType value) {
        this.nrcScheduleId = value;
    }

    /**
     * Gets the value of the nrcScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCScheduleName() {
        return nrcScheduleName;
    }

    /**
     * Sets the value of the nrcScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCScheduleName(QueryType value) {
        this.nrcScheduleName = value;
    }

    /**
     * Gets the value of the nrcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCStartDate() {
        return nrcStartDate;
    }

    /**
     * Sets the value of the nrcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCStartDate(QueryType value) {
        this.nrcStartDate = value;
    }

    /**
     * Gets the value of the needRefreshBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNeedRefreshBasePrice() {
        return needRefreshBasePrice;
    }

    /**
     * Sets the value of the needRefreshBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNeedRefreshBasePrice(QueryType value) {
        this.needRefreshBasePrice = value;
    }

    /**
     * Gets the value of the netDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetDiscountAmount() {
        return netDiscountAmount;
    }

    /**
     * Sets the value of the netDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetDiscountAmount(QueryType value) {
        this.netDiscountAmount = value;
    }

    /**
     * Gets the value of the netDiscountAmountDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetDiscountAmountDisplay() {
        return netDiscountAmountDisplay;
    }

    /**
     * Sets the value of the netDiscountAmountDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetDiscountAmountDisplay(QueryType value) {
        this.netDiscountAmountDisplay = value;
    }

    /**
     * Gets the value of the netDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetDiscountPercent() {
        return netDiscountPercent;
    }

    /**
     * Sets the value of the netDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetDiscountPercent(QueryType value) {
        this.netDiscountPercent = value;
    }

    /**
     * Gets the value of the netDiscountPercentDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetDiscountPercentDisplay() {
        return netDiscountPercentDisplay;
    }

    /**
     * Sets the value of the netDiscountPercentDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetDiscountPercentDisplay(QueryType value) {
        this.netDiscountPercentDisplay = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetPrice(QueryType value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the netPriceCalc property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetPriceCalc() {
        return netPriceCalc;
    }

    /**
     * Sets the value of the netPriceCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetPriceCalc(QueryType value) {
        this.netPriceCalc = value;
    }

    /**
     * Gets the value of the netType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetType() {
        return netType;
    }

    /**
     * Sets the value of the netType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetType(QueryType value) {
        this.netType = value;
    }

    /**
     * Gets the value of the networkElementType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetworkElementType() {
        return networkElementType;
    }

    /**
     * Sets the value of the networkElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetworkElementType(QueryType value) {
        this.networkElementType = value;
    }

    /**
     * Gets the value of the networkReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetworkReadOnlyFlag() {
        return networkReadOnlyFlag;
    }

    /**
     * Sets the value of the networkReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetworkReadOnlyFlag(QueryType value) {
        this.networkReadOnlyFlag = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNode(QueryType value) {
        this.node = value;
    }

    /**
     * Gets the value of the nodeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNodeFlag() {
        return nodeFlag;
    }

    /**
     * Sets the value of the nodeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNodeFlag(QueryType value) {
        this.nodeFlag = value;
    }

    /**
     * Gets the value of the nodeReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNodeReadOnlyFlag() {
        return nodeReadOnlyFlag;
    }

    /**
     * Sets the value of the nodeReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNodeReadOnlyFlag(QueryType value) {
        this.nodeReadOnlyFlag = value;
    }

    /**
     * Gets the value of the nonDiscountedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNonDiscountedLineTotal() {
        return nonDiscountedLineTotal;
    }

    /**
     * Sets the value of the nonDiscountedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNonDiscountedLineTotal(QueryType value) {
        this.nonDiscountedLineTotal = value;
    }

    /**
     * Gets the value of the nonDiscountedLineTotalDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNonDiscountedLineTotalDisplay() {
        return nonDiscountedLineTotalDisplay;
    }

    /**
     * Sets the value of the nonDiscountedLineTotalDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNonDiscountedLineTotalDisplay(QueryType value) {
        this.nonDiscountedLineTotalDisplay = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNote(QueryType value) {
        this.note = value;
    }

    /**
     * Gets the value of the noteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNoteFlag() {
        return noteFlag;
    }

    /**
     * Sets the value of the noteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNoteFlag(QueryType value) {
        this.noteFlag = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOptions(QueryType value) {
        this.options = value;
    }

    /**
     * Gets the value of the orderAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderAcctId() {
        return orderAcctId;
    }

    /**
     * Sets the value of the orderAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderAcctId(QueryType value) {
        this.orderAcctId = value;
    }

    /**
     * Gets the value of the orderActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderActiveFlag() {
        return orderActiveFlag;
    }

    /**
     * Sets the value of the orderActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderActiveFlag(QueryType value) {
        this.orderActiveFlag = value;
    }

    /**
     * Gets the value of the orderCPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderCPN() {
        return orderCPN;
    }

    /**
     * Sets the value of the orderCPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderCPN(QueryType value) {
        this.orderCPN = value;
    }

    /**
     * Gets the value of the orderFreightTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderFreightTermsCode() {
        return orderFreightTermsCode;
    }

    /**
     * Sets the value of the orderFreightTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderFreightTermsCode(QueryType value) {
        this.orderFreightTermsCode = value;
    }

    /**
     * Gets the value of the orderHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderHeaderId() {
        return orderHeaderId;
    }

    /**
     * Sets the value of the orderHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderHeaderId(QueryType value) {
        this.orderHeaderId = value;
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
     * Gets the value of the orderQuoteId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderQuoteId() {
        return orderQuoteId;
    }

    /**
     * Sets the value of the orderQuoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderQuoteId(QueryType value) {
        this.orderQuoteId = value;
    }

    /**
     * Gets the value of the orderSourceInventoryLocId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderSourceInventoryLocId() {
        return orderSourceInventoryLocId;
    }

    /**
     * Sets the value of the orderSourceInventoryLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderSourceInventoryLocId(QueryType value) {
        this.orderSourceInventoryLocId = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderStatus(QueryType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the orderType2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderType2() {
        return orderType2;
    }

    /**
     * Sets the value of the orderType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderType2(QueryType value) {
        this.orderType2 = value;
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
     * Gets the value of the organization22 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganization22() {
        return organization22;
    }

    /**
     * Sets the value of the organization22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganization22(QueryType value) {
        this.organization22 = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganizationId(QueryType value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOriginalPrice(QueryType value) {
        this.originalPrice = value;
    }

    /**
     * Gets the value of the originalQty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOriginalQty() {
        return originalQty;
    }

    /**
     * Sets the value of the originalQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOriginalQty(QueryType value) {
        this.originalQty = value;
    }

    /**
     * Gets the value of the outlineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOutlineNumber() {
        return outlineNumber;
    }

    /**
     * Sets the value of the outlineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOutlineNumber(QueryType value) {
        this.outlineNumber = value;
    }

    /**
     * Gets the value of the ownerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerAccountId() {
        return ownerAccountId;
    }

    /**
     * Sets the value of the ownerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerAccountId(QueryType value) {
        this.ownerAccountId = value;
    }

    /**
     * Gets the value of the pacOrderAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPACOrderAccountId() {
        return pacOrderAccountId;
    }

    /**
     * Sets the value of the pacOrderAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPACOrderAccountId(QueryType value) {
        this.pacOrderAccountId = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPackageName(QueryType value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the packageNameReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPackageNameReadOnlyFlag() {
        return packageNameReadOnlyFlag;
    }

    /**
     * Sets the value of the packageNameReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPackageNameReadOnlyFlag(QueryType value) {
        this.packageNameReadOnlyFlag = value;
    }

    /**
     * Gets the value of the parentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAccountId() {
        return parentAccountId;
    }

    /**
     * Sets the value of the parentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAccountId(QueryType value) {
        this.parentAccountId = value;
    }

    /**
     * Gets the value of the parentCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentCurrencyCode() {
        return parentCurrencyCode;
    }

    /**
     * Sets the value of the parentCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentCurrencyCode(QueryType value) {
        this.parentCurrencyCode = value;
    }

    /**
     * Gets the value of the parentExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentExchangeDate() {
        return parentExchangeDate;
    }

    /**
     * Sets the value of the parentExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentExchangeDate(QueryType value) {
        this.parentExchangeDate = value;
    }

    /**
     * Gets the value of the parentOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentOrderItemId() {
        return parentOrderItemId;
    }

    /**
     * Sets the value of the parentOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentOrderItemId(QueryType value) {
        this.parentOrderItemId = value;
    }

    /**
     * Gets the value of the parentPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentPackageName() {
        return parentPackageName;
    }

    /**
     * Sets the value of the parentPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentPackageName(QueryType value) {
        this.parentPackageName = value;
    }

    /**
     * Gets the value of the parentProductId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentProductId() {
        return parentProductId;
    }

    /**
     * Sets the value of the parentProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentProductId(QueryType value) {
        this.parentProductId = value;
    }

    /**
     * Gets the value of the parentTaxSubcomponentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentTaxSubcomponentFlag() {
        return parentTaxSubcomponentFlag;
    }

    /**
     * Sets the value of the parentTaxSubcomponentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentTaxSubcomponentFlag(QueryType value) {
        this.parentTaxSubcomponentFlag = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartNumber(QueryType value) {
        this.partNumber = value;
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
     * Gets the value of the postPickCD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPostPickCD() {
        return postPickCD;
    }

    /**
     * Sets the value of the postPickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPostPickCD(QueryType value) {
        this.postPickCD = value;
    }

    /**
     * Gets the value of the prePickCD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrePickCD() {
        return prePickCD;
    }

    /**
     * Sets the value of the prePickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrePickCD(QueryType value) {
        this.prePickCD = value;
    }

    /**
     * Gets the value of the previousAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousAssetStatus() {
        return previousAssetStatus;
    }

    /**
     * Sets the value of the previousAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousAssetStatus(QueryType value) {
        this.previousAssetStatus = value;
    }

    /**
     * Gets the value of the previousBillingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousBillingAccount() {
        return previousBillingAccount;
    }

    /**
     * Sets the value of the previousBillingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousBillingAccount(QueryType value) {
        this.previousBillingAccount = value;
    }

    /**
     * Gets the value of the previousBillingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousBillingAccountId() {
        return previousBillingAccountId;
    }

    /**
     * Sets the value of the previousBillingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousBillingAccountId(QueryType value) {
        this.previousBillingAccountId = value;
    }

    /**
     * Gets the value of the previousSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousSerialNumber() {
        return previousSerialNumber;
    }

    /**
     * Sets the value of the previousSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousSerialNumber(QueryType value) {
        this.previousSerialNumber = value;
    }

    /**
     * Gets the value of the previousServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousServiceAccount() {
        return previousServiceAccount;
    }

    /**
     * Sets the value of the previousServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousServiceAccount(QueryType value) {
        this.previousServiceAccount = value;
    }

    /**
     * Gets the value of the previousServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousServiceAccountId() {
        return previousServiceAccountId;
    }

    /**
     * Sets the value of the previousServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousServiceAccountId(QueryType value) {
        this.previousServiceAccountId = value;
    }

    /**
     * Gets the value of the previousServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousServiceId() {
        return previousServiceId;
    }

    /**
     * Sets the value of the previousServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousServiceId(QueryType value) {
        this.previousServiceId = value;
    }

    /**
     * Gets the value of the previousUsageAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousUsageAssetId() {
        return previousUsageAssetId;
    }

    /**
     * Sets the value of the previousUsageAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousUsageAssetId(QueryType value) {
        this.previousUsageAssetId = value;
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
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceType(QueryType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the pricingAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPricingAdjustmentAmount() {
        return pricingAdjustmentAmount;
    }

    /**
     * Sets the value of the pricingAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPricingAdjustmentAmount(QueryType value) {
        this.pricingAdjustmentAmount = value;
    }

    /**
     * Gets the value of the pricingComments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPricingComments() {
        return pricingComments;
    }

    /**
     * Sets the value of the pricingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPricingComments(QueryType value) {
        this.pricingComments = value;
    }

    /**
     * Gets the value of the pricingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPricingQuantity() {
        return pricingQuantity;
    }

    /**
     * Sets the value of the pricingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPricingQuantity(QueryType value) {
        this.pricingQuantity = value;
    }

    /**
     * Gets the value of the primaryAssetChildId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAssetChildId() {
        return primaryAssetChildId;
    }

    /**
     * Sets the value of the primaryAssetChildId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAssetChildId(QueryType value) {
        this.primaryAssetChildId = value;
    }

    /**
     * Gets the value of the processedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProcessedFlag() {
        return processedFlag;
    }

    /**
     * Sets the value of the processedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProcessedFlag(QueryType value) {
        this.processedFlag = value;
    }

    /**
     * Gets the value of the prodItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdItemId() {
        return prodItemId;
    }

    /**
     * Sets the value of the prodItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdItemId(QueryType value) {
        this.prodItemId = value;
    }

    /**
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromId(QueryType value) {
        this.prodPromId = value;
    }

    /**
     * Gets the value of the prodPromInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromInstanceId() {
        return prodPromInstanceId;
    }

    /**
     * Sets the value of the prodPromInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromInstanceId(QueryType value) {
        this.prodPromInstanceId = value;
    }

    /**
     * Gets the value of the prodPromName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromName() {
        return prodPromName;
    }

    /**
     * Sets the value of the prodPromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromName(QueryType value) {
        this.prodPromName = value;
    }

    /**
     * Gets the value of the prodPromReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromReadOnlyFlag() {
        return prodPromReadOnlyFlag;
    }

    /**
     * Sets the value of the prodPromReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromReadOnlyFlag(QueryType value) {
        this.prodPromReadOnlyFlag = value;
    }

    /**
     * Gets the value of the prodPromRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromRuleId() {
        return prodPromRuleId;
    }

    /**
     * Sets the value of the prodPromRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromRuleId(QueryType value) {
        this.prodPromRuleId = value;
    }

    /**
     * Gets the value of the prodPromSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromSourceId() {
        return prodPromSourceId;
    }

    /**
     * Sets the value of the prodPromSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromSourceId(QueryType value) {
        this.prodPromSourceId = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProduct(QueryType value) {
        this.product = value;
    }

    /**
     * Gets the value of the productDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductDefTypeCode() {
        return productDefTypeCode;
    }

    /**
     * Sets the value of the productDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductDefTypeCode(QueryType value) {
        this.productDefTypeCode = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductId(QueryType value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductIntegrationId() {
        return productIntegrationId;
    }

    /**
     * Sets the value of the productIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductIntegrationId(QueryType value) {
        this.productIntegrationId = value;
    }

    /**
     * Gets the value of the productPortId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductPortId() {
        return productPortId;
    }

    /**
     * Sets the value of the productPortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductPortId(QueryType value) {
        this.productPortId = value;
    }

    /**
     * Gets the value of the productPrimaryProductLineId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductPrimaryProductLineId() {
        return productPrimaryProductLineId;
    }

    /**
     * Sets the value of the productPrimaryProductLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductPrimaryProductLineId(QueryType value) {
        this.productPrimaryProductLineId = value;
    }

    /**
     * Gets the value of the productReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductReadOnlyFlag() {
        return productReadOnlyFlag;
    }

    /**
     * Sets the value of the productReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductReadOnlyFlag(QueryType value) {
        this.productReadOnlyFlag = value;
    }

    /**
     * Gets the value of the productStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductStatusCode() {
        return productStatusCode;
    }

    /**
     * Sets the value of the productStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductStatusCode(QueryType value) {
        this.productStatusCode = value;
    }

    /**
     * Gets the value of the productTaxableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductTaxableFlag() {
        return productTaxableFlag;
    }

    /**
     * Sets the value of the productTaxableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductTaxableFlag(QueryType value) {
        this.productTaxableFlag = value;
    }

    /**
     * Gets the value of the productThumbnailImageFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductThumbnailImageFileExt() {
        return productThumbnailImageFileExt;
    }

    /**
     * Sets the value of the productThumbnailImageFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductThumbnailImageFileExt(QueryType value) {
        this.productThumbnailImageFileExt = value;
    }

    /**
     * Gets the value of the productThumbnailImageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductThumbnailImageFileName() {
        return productThumbnailImageFileName;
    }

    /**
     * Sets the value of the productThumbnailImageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductThumbnailImageFileName(QueryType value) {
        this.productThumbnailImageFileName = value;
    }

    /**
     * Gets the value of the productThumbnailImageFileRev property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductThumbnailImageFileRev() {
        return productThumbnailImageFileRev;
    }

    /**
     * Sets the value of the productThumbnailImageFileRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductThumbnailImageFileRev(QueryType value) {
        this.productThumbnailImageFileRev = value;
    }

    /**
     * Gets the value of the productThumbnailImageId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductThumbnailImageId() {
        return productThumbnailImageId;
    }

    /**
     * Sets the value of the productThumbnailImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductThumbnailImageId(QueryType value) {
        this.productThumbnailImageId = value;
    }

    /**
     * Gets the value of the productTypeCalc property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductTypeCalc() {
        return productTypeCalc;
    }

    /**
     * Sets the value of the productTypeCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductTypeCalc(QueryType value) {
        this.productTypeCalc = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductTypeCode(QueryType value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the productUnitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductUnitofMeasure() {
        return productUnitofMeasure;
    }

    /**
     * Sets the value of the productUnitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductUnitofMeasure(QueryType value) {
        this.productUnitofMeasure = value;
    }

    /**
     * Gets the value of the productXAClassId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductXAClassId() {
        return productXAClassId;
    }

    /**
     * Sets the value of the productXAClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductXAClassId(QueryType value) {
        this.productXAClassId = value;
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
     * Gets the value of the promotionItemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPromotionItemFlag() {
        return promotionItemFlag;
    }

    /**
     * Sets the value of the promotionItemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPromotionItemFlag(QueryType value) {
        this.promotionItemFlag = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantity(QueryType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantityReadOnlyFlag() {
        return quantityReadOnlyFlag;
    }

    /**
     * Sets the value of the quantityReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantityReadOnlyFlag(QueryType value) {
        this.quantityReadOnlyFlag = value;
    }

    /**
     * Gets the value of the quantityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantityRequested() {
        return quantityRequested;
    }

    /**
     * Sets the value of the quantityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantityRequested(QueryType value) {
        this.quantityRequested = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantityShipped(QueryType value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the quantityToInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantityToInvoice() {
        return quantityToInvoice;
    }

    /**
     * Sets the value of the quantityToInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantityToInvoice(QueryType value) {
        this.quantityToInvoice = value;
    }

    /**
     * Gets the value of the quoteId2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteId2() {
        return quoteId2;
    }

    /**
     * Sets the value of the quoteId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteId2(QueryType value) {
        this.quoteId2 = value;
    }

    /**
     * Gets the value of the quoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteItemId() {
        return quoteItemId;
    }

    /**
     * Sets the value of the quoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteItemId(QueryType value) {
        this.quoteItemId = value;
    }

    /**
     * Gets the value of the rcAdjustAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCAdjustAmount() {
        return rcAdjustAmount;
    }

    /**
     * Sets the value of the rcAdjustAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCAdjustAmount(QueryType value) {
        this.rcAdjustAmount = value;
    }

    /**
     * Gets the value of the rcAdjustUM property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCAdjustUM() {
        return rcAdjustUM;
    }

    /**
     * Sets the value of the rcAdjustUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCAdjustUM(QueryType value) {
        this.rcAdjustUM = value;
    }

    /**
     * Gets the value of the rcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCAmount() {
        return rcAmount;
    }

    /**
     * Sets the value of the rcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCAmount(QueryType value) {
        this.rcAmount = value;
    }

    /**
     * Gets the value of the rcCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCCurrencyCode() {
        return rcCurrencyCode;
    }

    /**
     * Sets the value of the rcCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCCurrencyCode(QueryType value) {
        this.rcCurrencyCode = value;
    }

    /**
     * Gets the value of the rcExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCExchangeDate() {
        return rcExchangeDate;
    }

    /**
     * Sets the value of the rcExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCExchangeDate(QueryType value) {
        this.rcExchangeDate = value;
    }

    /**
     * Gets the value of the rcScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCScheduleId() {
        return rcScheduleId;
    }

    /**
     * Sets the value of the rcScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCScheduleId(QueryType value) {
        this.rcScheduleId = value;
    }

    /**
     * Gets the value of the rcScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCScheduleName() {
        return rcScheduleName;
    }

    /**
     * Sets the value of the rcScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCScheduleName(QueryType value) {
        this.rcScheduleName = value;
    }

    /**
     * Gets the value of the rcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRCStartDate() {
        return rcStartDate;
    }

    /**
     * Sets the value of the rcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRCStartDate(QueryType value) {
        this.rcStartDate = value;
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
     * Gets the value of the returnToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReturnToAddressId() {
        return returnToAddressId;
    }

    /**
     * Sets the value of the returnToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReturnToAddressId(QueryType value) {
        this.returnToAddressId = value;
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
     * Gets the value of the revenueType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRevenueType() {
        return revenueType;
    }

    /**
     * Sets the value of the revenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRevenueType(QueryType value) {
        this.revenueType = value;
    }

    /**
     * Gets the value of the revisedLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRevisedLineItemId() {
        return revisedLineItemId;
    }

    /**
     * Sets the value of the revisedLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRevisedLineItemId(QueryType value) {
        this.revisedLineItemId = value;
    }

    /**
     * Gets the value of the rollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRollupAmount() {
        return rollupAmount;
    }

    /**
     * Sets the value of the rollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRollupAmount(QueryType value) {
        this.rollupAmount = value;
    }

    /**
     * Gets the value of the rollupItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRollupItemPrice() {
        return rollupItemPrice;
    }

    /**
     * Sets the value of the rollupItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRollupItemPrice(QueryType value) {
        this.rollupItemPrice = value;
    }

    /**
     * Gets the value of the rollupItemPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRollupItemPriceDisplay() {
        return rollupItemPriceDisplay;
    }

    /**
     * Sets the value of the rollupItemPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRollupItemPriceDisplay(QueryType value) {
        this.rollupItemPriceDisplay = value;
    }

    /**
     * Gets the value of the rootActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootActionCode() {
        return rootActionCode;
    }

    /**
     * Sets the value of the rootActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootActionCode(QueryType value) {
        this.rootActionCode = value;
    }

    /**
     * Gets the value of the rootAssetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootAssetIntegrationId() {
        return rootAssetIntegrationId;
    }

    /**
     * Sets the value of the rootAssetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootAssetIntegrationId(QueryType value) {
        this.rootAssetIntegrationId = value;
    }

    /**
     * Gets the value of the rootBundleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootBundleFlag() {
        return rootBundleFlag;
    }

    /**
     * Sets the value of the rootBundleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootBundleFlag(QueryType value) {
        this.rootBundleFlag = value;
    }

    /**
     * Gets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootCfgLatestReleasedFlag() {
        return rootCfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootCfgLatestReleasedFlag(QueryType value) {
        this.rootCfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the rootCfgType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootCfgType() {
        return rootCfgType;
    }

    /**
     * Sets the value of the rootCfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootCfgType(QueryType value) {
        this.rootCfgType = value;
    }

    /**
     * Gets the value of the rootItemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootItemPriceListId() {
        return rootItemPriceListId;
    }

    /**
     * Sets the value of the rootItemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootItemPriceListId(QueryType value) {
        this.rootItemPriceListId = value;
    }

    /**
     * Gets the value of the rootLineItemDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootLineItemDueDate() {
        return rootLineItemDueDate;
    }

    /**
     * Sets the value of the rootLineItemDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootLineItemDueDate(QueryType value) {
        this.rootLineItemDueDate = value;
    }

    /**
     * Gets the value of the rootOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootOrderItemId() {
        return rootOrderItemId;
    }

    /**
     * Sets the value of the rootOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootOrderItemId(QueryType value) {
        this.rootOrderItemId = value;
    }

    /**
     * Gets the value of the rootPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootPackageName() {
        return rootPackageName;
    }

    /**
     * Sets the value of the rootPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootPackageName(QueryType value) {
        this.rootPackageName = value;
    }

    /**
     * Gets the value of the rootProductDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootProductDefTypeCode() {
        return rootProductDefTypeCode;
    }

    /**
     * Sets the value of the rootProductDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootProductDefTypeCode(QueryType value) {
        this.rootProductDefTypeCode = value;
    }

    /**
     * Gets the value of the rootProductId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootProductId() {
        return rootProductId;
    }

    /**
     * Sets the value of the rootProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootProductId(QueryType value) {
        this.rootProductId = value;
    }

    /**
     * Gets the value of the rootProductName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootProductName() {
        return rootProductName;
    }

    /**
     * Sets the value of the rootProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootProductName(QueryType value) {
        this.rootProductName = value;
    }

    /**
     * Gets the value of the rootProductTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootProductTypeCode() {
        return rootProductTypeCode;
    }

    /**
     * Sets the value of the rootProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootProductTypeCode(QueryType value) {
        this.rootProductTypeCode = value;
    }

    /**
     * Gets the value of the sap4XFreight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAP4XFreight() {
        return sap4XFreight;
    }

    /**
     * Sets the value of the sap4XFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAP4XFreight(QueryType value) {
        this.sap4XFreight = value;
    }

    /**
     * Gets the value of the sap4XNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAP4XNetPrice() {
        return sap4XNetPrice;
    }

    /**
     * Sets the value of the sap4XNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAP4XNetPrice(QueryType value) {
        this.sap4XNetPrice = value;
    }

    /**
     * Gets the value of the sap4XPlant property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAP4XPlant() {
        return sap4XPlant;
    }

    /**
     * Sets the value of the sap4XPlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAP4XPlant(QueryType value) {
        this.sap4XPlant = value;
    }

    /**
     * Gets the value of the sap4XTax property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAP4XTax() {
        return sap4XTax;
    }

    /**
     * Sets the value of the sap4XTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAP4XTax(QueryType value) {
        this.sap4XTax = value;
    }

    /**
     * Gets the value of the sap4XUnitNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAP4XUnitNetPrice() {
        return sap4XUnitNetPrice;
    }

    /**
     * Sets the value of the sap4XUnitNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAP4XUnitNetPrice(QueryType value) {
        this.sap4XUnitNetPrice = value;
    }

    /**
     * Gets the value of the sapConditionPricingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPConditionPricingUnit() {
        return sapConditionPricingUnit;
    }

    /**
     * Sets the value of the sapConditionPricingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPConditionPricingUnit(QueryType value) {
        this.sapConditionPricingUnit = value;
    }

    /**
     * Gets the value of the sapConditionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPConditionUnit() {
        return sapConditionUnit;
    }

    /**
     * Sets the value of the sapConditionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPConditionUnit(QueryType value) {
        this.sapConditionUnit = value;
    }

    /**
     * Gets the value of the sapCumulativeConfirmedQty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCumulativeConfirmedQty() {
        return sapCumulativeConfirmedQty;
    }

    /**
     * Sets the value of the sapCumulativeConfirmedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCumulativeConfirmedQty(QueryType value) {
        this.sapCumulativeConfirmedQty = value;
    }

    /**
     * Gets the value of the sapCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPCurrency() {
        return sapCurrency;
    }

    /**
     * Sets the value of the sapCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPCurrency(QueryType value) {
        this.sapCurrency = value;
    }

    /**
     * Gets the value of the sapDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPDeliveryStatus() {
        return sapDeliveryStatus;
    }

    /**
     * Sets the value of the sapDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPDeliveryStatus(QueryType value) {
        this.sapDeliveryStatus = value;
    }

    /**
     * Gets the value of the sapDeliveryStatusWide property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPDeliveryStatusWide() {
        return sapDeliveryStatusWide;
    }

    /**
     * Sets the value of the sapDeliveryStatusWide property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPDeliveryStatusWide(QueryType value) {
        this.sapDeliveryStatusWide = value;
    }

    /**
     * Gets the value of the sapInputId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPInputId() {
        return sapInputId;
    }

    /**
     * Sets the value of the sapInputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPInputId(QueryType value) {
        this.sapInputId = value;
    }

    /**
     * Gets the value of the sapItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPItemNumber() {
        return sapItemNumber;
    }

    /**
     * Sets the value of the sapItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPItemNumber(QueryType value) {
        this.sapItemNumber = value;
    }

    /**
     * Gets the value of the sapItemShortText property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPItemShortText() {
        return sapItemShortText;
    }

    /**
     * Sets the value of the sapItemShortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPItemShortText(QueryType value) {
        this.sapItemShortText = value;
    }

    /**
     * Gets the value of the sapMaterialPart property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPMaterialPart() {
        return sapMaterialPart;
    }

    /**
     * Sets the value of the sapMaterialPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPMaterialPart(QueryType value) {
        this.sapMaterialPart = value;
    }

    /**
     * Gets the value of the sapNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPNetPrice() {
        return sapNetPrice;
    }

    /**
     * Sets the value of the sapNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPNetPrice(QueryType value) {
        this.sapNetPrice = value;
    }

    /**
     * Gets the value of the sapNetValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPNetValue() {
        return sapNetValue;
    }

    /**
     * Sets the value of the sapNetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPNetValue(QueryType value) {
        this.sapNetValue = value;
    }

    /**
     * Gets the value of the sapParentId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPParentId() {
        return sapParentId;
    }

    /**
     * Sets the value of the sapParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPParentId(QueryType value) {
        this.sapParentId = value;
    }

    /**
     * Gets the value of the sapReferenceQty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPReferenceQty() {
        return sapReferenceQty;
    }

    /**
     * Sets the value of the sapReferenceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPReferenceQty(QueryType value) {
        this.sapReferenceQty = value;
    }

    /**
     * Gets the value of the sapRequestedQty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPRequestedQty() {
        return sapRequestedQty;
    }

    /**
     * Sets the value of the sapRequestedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPRequestedQty(QueryType value) {
        this.sapRequestedQty = value;
    }

    /**
     * Gets the value of the sapRequestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPRequestedShipDate() {
        return sapRequestedShipDate;
    }

    /**
     * Sets the value of the sapRequestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPRequestedShipDate(QueryType value) {
        this.sapRequestedShipDate = value;
    }

    /**
     * Gets the value of the sapSalesUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSAPSalesUnit() {
        return sapSalesUnit;
    }

    /**
     * Sets the value of the sapSalesUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSAPSalesUnit(QueryType value) {
        this.sapSalesUnit = value;
    }

    /**
     * Gets the value of the salesRepPosition property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSalesRepPosition() {
        return salesRepPosition;
    }

    /**
     * Sets the value of the salesRepPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSalesRepPosition(QueryType value) {
        this.salesRepPosition = value;
    }

    /**
     * Gets the value of the salesRepPostnId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSalesRepPostnId() {
        return salesRepPostnId;
    }

    /**
     * Sets the value of the salesRepPostnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSalesRepPostnId(QueryType value) {
        this.salesRepPostnId = value;
    }

    /**
     * Gets the value of the salesServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSalesServiceFlag() {
        return salesServiceFlag;
    }

    /**
     * Sets the value of the salesServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSalesServiceFlag(QueryType value) {
        this.salesServiceFlag = value;
    }

    /**
     * Gets the value of the salesUnitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSalesUnitofMeasure() {
        return salesUnitofMeasure;
    }

    /**
     * Sets the value of the salesUnitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSalesUnitofMeasure(QueryType value) {
        this.salesUnitofMeasure = value;
    }

    /**
     * Gets the value of the scheduledShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getScheduledShipDate() {
        return scheduledShipDate;
    }

    /**
     * Sets the value of the scheduledShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setScheduledShipDate(QueryType value) {
        this.scheduledShipDate = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSerialNumber(QueryType value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialized property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSerialized() {
        return serialized;
    }

    /**
     * Sets the value of the serialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSerialized(QueryType value) {
        this.serialized = value;
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
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceId(QueryType value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the servicePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServicePriceAmount() {
        return servicePriceAmount;
    }

    /**
     * Sets the value of the servicePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServicePriceAmount(QueryType value) {
        this.servicePriceAmount = value;
    }

    /**
     * Gets the value of the servicePriceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServicePriceMethod() {
        return servicePriceMethod;
    }

    /**
     * Sets the value of the servicePriceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServicePriceMethod(QueryType value) {
        this.servicePriceMethod = value;
    }

    /**
     * Gets the value of the servicePricePercent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServicePricePercent() {
        return servicePricePercent;
    }

    /**
     * Sets the value of the servicePricePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServicePricePercent(QueryType value) {
        this.servicePricePercent = value;
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
     * Gets the value of the shipInstrustions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipInstrustions() {
        return shipInstrustions;
    }

    /**
     * Sets the value of the shipInstrustions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipInstrustions(QueryType value) {
        this.shipInstrustions = value;
    }

    /**
     * Gets the value of the shipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipMethod() {
        return shipMethod;
    }

    /**
     * Sets the value of the shipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipMethod(QueryType value) {
        this.shipMethod = value;
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
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddress(QueryType value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddress2(QueryType value) {
        this.shipToAddress2 = value;
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
     * Gets the value of the shipToCity2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCity2() {
        return shipToCity2;
    }

    /**
     * Sets the value of the shipToCity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCity2(QueryType value) {
        this.shipToCity2 = value;
    }

    /**
     * Gets the value of the shipToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactFirstName() {
        return shipToContactFirstName;
    }

    /**
     * Sets the value of the shipToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactFirstName(QueryType value) {
        this.shipToContactFirstName = value;
    }

    /**
     * Gets the value of the shipToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactLastName() {
        return shipToContactLastName;
    }

    /**
     * Sets the value of the shipToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactLastName(QueryType value) {
        this.shipToContactLastName = value;
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
     * Gets the value of the shipToCountry2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCountry2() {
        return shipToCountry2;
    }

    /**
     * Sets the value of the shipToCountry2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCountry2(QueryType value) {
        this.shipToCountry2 = value;
    }

    /**
     * Gets the value of the shipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToFirstName() {
        return shipToFirstName;
    }

    /**
     * Sets the value of the shipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToFirstName(QueryType value) {
        this.shipToFirstName = value;
    }

    /**
     * Gets the value of the shipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToLastName() {
        return shipToLastName;
    }

    /**
     * Sets the value of the shipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToLastName(QueryType value) {
        this.shipToLastName = value;
    }

    /**
     * Gets the value of the shipToState2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToState2() {
        return shipToState2;
    }

    /**
     * Sets the value of the shipToState2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToState2(QueryType value) {
        this.shipToState2 = value;
    }

    /**
     * Gets the value of the shipToZip2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToZip2() {
        return shipToZip2;
    }

    /**
     * Sets the value of the shipToZip2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToZip2(QueryType value) {
        this.shipToZip2 = value;
    }

    /**
     * Gets the value of the shipTogetherFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipTogetherFlag() {
        return shipTogetherFlag;
    }

    /**
     * Sets the value of the shipTogetherFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipTogetherFlag(QueryType value) {
        this.shipTogetherFlag = value;
    }

    /**
     * Gets the value of the shiptoAddressIntegrationId2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShiptoAddressIntegrationId2() {
        return shiptoAddressIntegrationId2;
    }

    /**
     * Sets the value of the shiptoAddressIntegrationId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShiptoAddressIntegrationId2(QueryType value) {
        this.shiptoAddressIntegrationId2 = value;
    }

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Sets the value of the shipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipmentNumber(QueryType value) {
        this.shipmentNumber = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShippingMethod(QueryType value) {
        this.shippingMethod = value;
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
     * Gets the value of the skipPricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSkipPricingFlag() {
        return skipPricingFlag;
    }

    /**
     * Sets the value of the skipPricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSkipPricingFlag(QueryType value) {
        this.skipPricingFlag = value;
    }

    /**
     * Gets the value of the skipValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSkipValidationFlag() {
        return skipValidationFlag;
    }

    /**
     * Sets the value of the skipValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSkipValidationFlag(QueryType value) {
        this.skipValidationFlag = value;
    }

    /**
     * Gets the value of the smartPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSmartPartNumber() {
        return smartPartNumber;
    }

    /**
     * Sets the value of the smartPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSmartPartNumber(QueryType value) {
        this.smartPartNumber = value;
    }

    /**
     * Gets the value of the sourceInventoryLocId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSourceInventoryLocId() {
        return sourceInventoryLocId;
    }

    /**
     * Sets the value of the sourceInventoryLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSourceInventoryLocId(QueryType value) {
        this.sourceInventoryLocId = value;
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
     * Gets the value of the sourceInventoryLocation2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSourceInventoryLocation2() {
        return sourceInventoryLocation2;
    }

    /**
     * Sets the value of the sourceInventoryLocation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSourceInventoryLocation2(QueryType value) {
        this.sourceInventoryLocation2 = value;
    }

    /**
     * Gets the value of the sourceInventoryLocationReceiveToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSourceInventoryLocationReceiveToAddressId() {
        return sourceInventoryLocationReceiveToAddressId;
    }

    /**
     * Sets the value of the sourceInventoryLocationReceiveToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSourceInventoryLocationReceiveToAddressId(QueryType value) {
        this.sourceInventoryLocationReceiveToAddressId = value;
    }

    /**
     * Gets the value of the sourceInventoryLocationReceiveToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSourceInventoryLocationReceiveToPostalCode() {
        return sourceInventoryLocationReceiveToPostalCode;
    }

    /**
     * Sets the value of the sourceInventoryLocationReceiveToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSourceInventoryLocationReceiveToPostalCode(QueryType value) {
        this.sourceInventoryLocationReceiveToPostalCode = value;
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
     * Gets the value of the taxAmountHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxAmountHeaderCurrency() {
        return taxAmountHeaderCurrency;
    }

    /**
     * Sets the value of the taxAmountHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxAmountHeaderCurrency(QueryType value) {
        this.taxAmountHeaderCurrency = value;
    }

    /**
     * Gets the value of the taxAmountInternalHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxAmountInternalHeaderCurrency() {
        return taxAmountInternalHeaderCurrency;
    }

    /**
     * Sets the value of the taxAmountInternalHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxAmountInternalHeaderCurrency(QueryType value) {
        this.taxAmountInternalHeaderCurrency = value;
    }

    /**
     * Gets the value of the taxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExemptFlag() {
        return taxExemptFlag;
    }

    /**
     * Sets the value of the taxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExemptFlag(QueryType value) {
        this.taxExemptFlag = value;
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
     * Gets the value of the taxSubcomponentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxSubcomponentFlag() {
        return taxSubcomponentFlag;
    }

    /**
     * Sets the value of the taxSubcomponentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxSubcomponentFlag(QueryType value) {
        this.taxSubcomponentFlag = value;
    }

    /**
     * Gets the value of the taxableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxableFlag() {
        return taxableFlag;
    }

    /**
     * Sets the value of the taxableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxableFlag(QueryType value) {
        this.taxableFlag = value;
    }

    /**
     * Gets the value of the terminationFee property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTerminationFee() {
        return terminationFee;
    }

    /**
     * Sets the value of the terminationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTerminationFee(QueryType value) {
        this.terminationFee = value;
    }

    /**
     * Gets the value of the toNode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getToNode() {
        return toNode;
    }

    /**
     * Sets the value of the toNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setToNode(QueryType value) {
        this.toNode = value;
    }

    /**
     * Gets the value of the toServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getToServiceAccount() {
        return toServiceAccount;
    }

    /**
     * Sets the value of the toServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setToServiceAccount(QueryType value) {
        this.toServiceAccount = value;
    }

    /**
     * Gets the value of the toServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getToServiceAccountId() {
        return toServiceAccountId;
    }

    /**
     * Sets the value of the toServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setToServiceAccountId(QueryType value) {
        this.toServiceAccountId = value;
    }

    /**
     * Gets the value of the unitNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitNetPrice() {
        return unitNetPrice;
    }

    /**
     * Sets the value of the unitNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitNetPrice(QueryType value) {
        this.unitNetPrice = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitPrice(QueryType value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the unitPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitPriceDisplay() {
        return unitPriceDisplay;
    }

    /**
     * Sets the value of the unitPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitPriceDisplay(QueryType value) {
        this.unitPriceDisplay = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitofMeasure(QueryType value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the updatedByLogin2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdatedByLogin2() {
        return updatedByLogin2;
    }

    /**
     * Sets the value of the updatedByLogin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdatedByLogin2(QueryType value) {
        this.updatedByLogin2 = value;
    }

    /**
     * Gets the value of the usagePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUsagePlanId() {
        return usagePlanId;
    }

    /**
     * Sets the value of the usagePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUsagePlanId(QueryType value) {
        this.usagePlanId = value;
    }

    /**
     * Gets the value of the usagePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUsagePlanName() {
        return usagePlanName;
    }

    /**
     * Sets the value of the usagePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUsagePlanName(QueryType value) {
        this.usagePlanName = value;
    }

    /**
     * Gets the value of the usageScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUsageScheduleId() {
        return usageScheduleId;
    }

    /**
     * Sets the value of the usageScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUsageScheduleId(QueryType value) {
        this.usageScheduleId = value;
    }

    /**
     * Gets the value of the usageScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUsageScheduleName() {
        return usageScheduleName;
    }

    /**
     * Sets the value of the usageScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUsageScheduleName(QueryType value) {
        this.usageScheduleName = value;
    }

    /**
     * Gets the value of the usePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUsePlanId() {
        return usePlanId;
    }

    /**
     * Sets the value of the usePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUsePlanId(QueryType value) {
        this.usePlanId = value;
    }

    /**
     * Gets the value of the usePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUsePlanName() {
        return usePlanName;
    }

    /**
     * Sets the value of the usePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUsePlanName(QueryType value) {
        this.usePlanName = value;
    }

    /**
     * Gets the value of the useStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUseStartDate() {
        return useStartDate;
    }

    /**
     * Sets the value of the useStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUseStartDate(QueryType value) {
        this.useStartDate = value;
    }

    /**
     * Gets the value of the vodRowId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVODRowId() {
        return vodRowId;
    }

    /**
     * Sets the value of the vodRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVODRowId(QueryType value) {
        this.vodRowId = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValidationDate(QueryType value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValidationStatus(QueryType value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolume(QueryType value) {
        this.volume = value;
    }

    /**
     * Gets the value of the volumeDiscountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountId() {
        return volumeDiscountId;
    }

    /**
     * Sets the value of the volumeDiscountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountId(QueryType value) {
        this.volumeDiscountId = value;
    }

    /**
     * Gets the value of the volumeDiscountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountIntegrationId() {
        return volumeDiscountIntegrationId;
    }

    /**
     * Sets the value of the volumeDiscountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountIntegrationId(QueryType value) {
        this.volumeDiscountIntegrationId = value;
    }

    /**
     * Gets the value of the volumeDiscountItem property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountItem() {
        return volumeDiscountItem;
    }

    /**
     * Sets the value of the volumeDiscountItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountItem(QueryType value) {
        this.volumeDiscountItem = value;
    }

    /**
     * Gets the value of the volumeDiscountItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountItemId() {
        return volumeDiscountItemId;
    }

    /**
     * Sets the value of the volumeDiscountItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountItemId(QueryType value) {
        this.volumeDiscountItemId = value;
    }

    /**
     * Gets the value of the volumeDiscountMaxQty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountMaxQty() {
        return volumeDiscountMaxQty;
    }

    /**
     * Sets the value of the volumeDiscountMaxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountMaxQty(QueryType value) {
        this.volumeDiscountMaxQty = value;
    }

    /**
     * Gets the value of the volumeDiscountMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountMethod() {
        return volumeDiscountMethod;
    }

    /**
     * Sets the value of the volumeDiscountMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountMethod(QueryType value) {
        this.volumeDiscountMethod = value;
    }

    /**
     * Gets the value of the volumeDiscountMinQty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountMinQty() {
        return volumeDiscountMinQty;
    }

    /**
     * Sets the value of the volumeDiscountMinQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountMinQty(QueryType value) {
        this.volumeDiscountMinQty = value;
    }

    /**
     * Gets the value of the volumeUoM property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeUoM() {
        return volumeUoM;
    }

    /**
     * Sets the value of the volumeUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeUoM(QueryType value) {
        this.volumeUoM = value;
    }

    /**
     * Gets the value of the volumeUpsellItem property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeUpsellItem() {
        return volumeUpsellItem;
    }

    /**
     * Sets the value of the volumeUpsellItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeUpsellItem(QueryType value) {
        this.volumeUpsellItem = value;
    }

    /**
     * Gets the value of the volumeUpsellItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeUpsellItemId() {
        return volumeUpsellItemId;
    }

    /**
     * Sets the value of the volumeUpsellItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeUpsellItemId(QueryType value) {
        this.volumeUpsellItemId = value;
    }

    /**
     * Gets the value of the volumeUpsellMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeUpsellMessage() {
        return volumeUpsellMessage;
    }

    /**
     * Sets the value of the volumeUpsellMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeUpsellMessage(QueryType value) {
        this.volumeUpsellMessage = value;
    }

    /**
     * Gets the value of the warrantyRecoveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWarrantyRecoveryFlag() {
        return warrantyRecoveryFlag;
    }

    /**
     * Sets the value of the warrantyRecoveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWarrantyRecoveryFlag(QueryType value) {
        this.warrantyRecoveryFlag = value;
    }

    /**
     * Gets the value of the writeInProduct property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWriteInProduct() {
        return writeInProduct;
    }

    /**
     * Sets the value of the writeInProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWriteInProduct(QueryType value) {
        this.writeInProduct = value;
    }

    /**
     * Gets the value of the writeInProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWriteInProductFlag() {
        return writeInProductFlag;
    }

    /**
     * Sets the value of the writeInProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWriteInProductFlag(QueryType value) {
        this.writeInProductFlag = value;
    }

    /**
     * Gets the value of the writeInProductReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWriteInProductReadOnlyFlag() {
        return writeInProductReadOnlyFlag;
    }

    /**
     * Sets the value of the writeInProductReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWriteInProductReadOnlyFlag(QueryType value) {
        this.writeInProductReadOnlyFlag = value;
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
