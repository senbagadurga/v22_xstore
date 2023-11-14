
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
 * <p>Java class for OrderEntry-LineItemsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderEntry-LineItemsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ATPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityRecommendedPartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdjustDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AggregrateTotalSkip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AssetExternalIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuctionItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuctionItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuctionItemReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoChargeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoExplodeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoReceiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BCReadOnlyFlag2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BackOfficeProcessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BasePrice-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDAPagesetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculatedAssetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculatedDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CalculatedExtendedLineTotal-RootsandPackageComponents" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedLineTotalUI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedNetDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedNetDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedNetworkElementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculatedNon-DiscountedLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedProductLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedServiceLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedTrainingLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculatedYourPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CancelledQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CfgEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CfgLatestReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefFirstVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefLastVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CfgReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CfgStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgVersion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChangeCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ChargeTimingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassRegistrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassRegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompoundProductFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertToAssetFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredAssetProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredAssetProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredProductBasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredProductDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductItemPrice3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CoveredProductRollupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredProductUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoveredQuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CumulativeConfQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCodePrecision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeleteClassRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationInventoryLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayPackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EAISyncDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EarliestTermDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EffectivePricingPeriodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExcludePricingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExtendedLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExtendedLineTotal-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExtendedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExternalFulfillLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FixPriceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForcastableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FreightAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FreightTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FunctionalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FunctionalExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FunctionalItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FunctionalLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FunctionalUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GrossWeightUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasGenericsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HeaderCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HeaderDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HeaderExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HeaderRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncentiveCompensationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncentiveStatusChangedFlg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsExpanded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductBundleComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductNotBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductNotBundleRoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductORBundleComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductRoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPackageProductComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRootItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ItemPrice-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ItemPriceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPriceListIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemType-LanguageIndependent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemIsProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LabeledProductFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LineItemNetTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineNumber2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LineNumber22" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineTotal-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineTotalinHeaderCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LoanerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MRCCxTotalinHeaderCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumLot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NOTWrite-InProductFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NRCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NRCCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NRCCxTotalinHeaderCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NRCExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NRCNumberofBills" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NRCPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCPlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NeedRefreshBasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetDiscountAmount-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetDiscountPercent-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetPriceCalc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkElementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Non-DiscountedLineTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Non-DiscountedLineTotal-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderAcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderCPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderFreightTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderHeaderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderQuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderSourceInventoryLocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OutlineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PACOrderAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageNameReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ParentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentPackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentTaxSubcomponentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartialShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostPickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousAssetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousBillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousBillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousUsageAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PricingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryAssetChildId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTaxableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageFileExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageFileRev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductThumbnailImageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeCalc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductUnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductXAClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionItemFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuantityRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityShipped" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityToInvoice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuoteId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCAdjustAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RCAdjustUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RCCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RCScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReserveTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReserveTimeUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevenueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevisedLineItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RollupItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RollupItemPrice-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RootActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootAssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootBundleFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RootCfgLatestReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootCfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootItemPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootLineItemDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RootOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootPackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP4xFreight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAP4xNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAP4xPlant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP4xTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAP4xUnitNetPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPConditionPricingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SAPConditionUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPCumulativeConfirmedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAPCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPDeliveryStatusWide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPInputId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPItemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SAPItemShortText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPMaterialPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAPNetValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAPParentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPReferenceQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAPRequestedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SAPRequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SAPSalesUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepPostnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesServiceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesUnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serialized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicePriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ServicePriceMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicePricePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShipCompleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipInstrustions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCity2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContact-FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContact-LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCountry2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToState2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToZip2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipTogetherFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShiptoAddressIntegrationId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SingleSourceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkipPricingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkipValidationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocationReceiveToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceInventoryLocationReceiveToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmountHeaderCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmountInternalHeaderCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxExemptFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExemptReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxSubcomponentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminationFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ToNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitPrice-Display" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedByLogin2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsagePlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsagePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsePlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="VODRowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountMaxQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountMinQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VolumeUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyRecoveryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Write-InProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Write-InProductFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Write-InProductReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "OrderEntry-LineItemsData", propOrder = {
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
public class OrderEntryLineItemsData {

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
    @XmlElement(name = "ATPReserved")
    protected Boolean atpReserved;
    @XmlElement(name = "ATPStatus")
    protected String atpStatus;
    @XmlElement(name = "ATPStatusAsOfDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar atpStatusAsOfDate;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "ActivityId")
    protected String activityId;
    @XmlElement(name = "ActivityRecommendedPartId")
    protected String activityRecommendedPartId;
    @XmlElement(name = "AdjustCharge")
    protected BigDecimal adjustCharge;
    @XmlElement(name = "AdjustDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adjustDate;
    @XmlElement(name = "AdjustedListPrice")
    protected BigDecimal adjustedListPrice;
    @XmlElement(name = "AdjustedListPrice-Display")
    protected BigDecimal adjustedListPriceDisplay;
    @XmlElement(name = "AggregrateTotalSkip")
    protected String aggregrateTotalSkip;
    @XmlElement(name = "AmountExchangeDate")
    protected String amountExchangeDate;
    @XmlElement(name = "AsOfDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfDate;
    @XmlElement(name = "AssetExternalIntegrationId")
    protected String assetExternalIntegrationId;
    @XmlElement(name = "AssetId")
    protected String assetId;
    @XmlElement(name = "AssetIntegrationId")
    protected String assetIntegrationId;
    @XmlElement(name = "AssetNumber")
    protected String assetNumber;
    @XmlElement(name = "AssetStatus")
    protected String assetStatus;
    @XmlElement(name = "AuctionItemId")
    protected String auctionItemId;
    @XmlElement(name = "AuctionItemName")
    protected String auctionItemName;
    @XmlElement(name = "AuctionItemReadOnlyFlag")
    protected Boolean auctionItemReadOnlyFlag;
    @XmlElement(name = "AutoChargeFlag")
    protected Boolean autoChargeFlag;
    @XmlElement(name = "AutoExplodeFlag")
    protected Boolean autoExplodeFlag;
    @XmlElement(name = "AutoReceiveFlag")
    protected Boolean autoReceiveFlag;
    @XmlElement(name = "AvailableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availableDate;
    @XmlElement(name = "AvailableQuantity")
    protected BigDecimal availableQuantity;
    @XmlElement(name = "BCReadOnlyFlag2")
    protected Boolean bcReadOnlyFlag2;
    @XmlElement(name = "BackOfficeProcessStatus")
    protected String backOfficeProcessStatus;
    @XmlElement(name = "BasePrice")
    protected BigDecimal basePrice;
    @XmlElement(name = "BasePrice-Display")
    protected BigDecimal basePriceDisplay;
    @XmlElement(name = "BillableFlag")
    protected Boolean billableFlag;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "CDAPagesetId")
    protected String cdaPagesetId;
    @XmlElement(name = "CalculatedAssetStatus")
    protected String calculatedAssetStatus;
    @XmlElement(name = "CalculatedDueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculatedDueDate;
    @XmlElement(name = "CalculatedExtendedLineTotal-RootsandPackageComponents")
    protected BigDecimal calculatedExtendedLineTotalRootsandPackageComponents;
    @XmlElement(name = "CalculatedLineTotal")
    protected BigDecimal calculatedLineTotal;
    @XmlElement(name = "CalculatedLineTotalUI")
    protected BigDecimal calculatedLineTotalUI;
    @XmlElement(name = "CalculatedNetDiscountAmount")
    protected BigDecimal calculatedNetDiscountAmount;
    @XmlElement(name = "CalculatedNetDiscountPercent")
    protected BigDecimal calculatedNetDiscountPercent;
    @XmlElement(name = "CalculatedNetPrice")
    protected BigDecimal calculatedNetPrice;
    @XmlElement(name = "CalculatedNetworkElementType")
    protected String calculatedNetworkElementType;
    @XmlElement(name = "CalculatedNon-DiscountedLineTotal")
    protected BigDecimal calculatedNonDiscountedLineTotal;
    @XmlElement(name = "CalculatedProductLineTotal")
    protected BigDecimal calculatedProductLineTotal;
    @XmlElement(name = "CalculatedServiceLineTotal")
    protected BigDecimal calculatedServiceLineTotal;
    @XmlElement(name = "CalculatedTrainingLineTotal")
    protected BigDecimal calculatedTrainingLineTotal;
    @XmlElement(name = "CalculatedYourPrice")
    protected BigDecimal calculatedYourPrice;
    @XmlElement(name = "CancelledQuantity")
    protected BigDecimal cancelledQuantity;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "CfgActiveFlag")
    protected Boolean cfgActiveFlag;
    @XmlElement(name = "CfgEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cfgEndDate;
    @XmlElement(name = "CfgLatestReleasedFlag")
    protected String cfgLatestReleasedFlag;
    @XmlElement(name = "CfgObjectDefFirstVersion")
    protected Integer cfgObjectDefFirstVersion;
    @XmlElement(name = "CfgObjectDefLastVersion")
    protected Integer cfgObjectDefLastVersion;
    @XmlElement(name = "CfgReleasedFlag")
    protected Boolean cfgReleasedFlag;
    @XmlElement(name = "CfgStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cfgStartDate;
    @XmlElement(name = "CfgStateCode")
    protected String cfgStateCode;
    @XmlElement(name = "CfgType")
    protected String cfgType;
    @XmlElement(name = "CfgVersion")
    protected BigDecimal cfgVersion;
    @XmlElement(name = "ChangeCost")
    protected String changeCost;
    @XmlElement(name = "ChargeEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargeEndDate;
    @XmlElement(name = "ChargeTimingType")
    protected String chargeTimingType;
    @XmlElement(name = "ClassDisplayName")
    protected String classDisplayName;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "ClassOfferId")
    protected String classOfferId;
    @XmlElement(name = "ClassRegistrationId")
    protected String classRegistrationId;
    @XmlElement(name = "ClassRegistrationStatus")
    protected String classRegistrationStatus;
    @XmlElement(name = "ClassType")
    protected String classType;
    @XmlElement(name = "CompoundProductFlag")
    protected Boolean compoundProductFlag;
    @XmlElement(name = "CompoundProductNumber")
    protected String compoundProductNumber;
    @XmlElement(name = "ConfigurationModelId")
    protected String configurationModelId;
    @XmlElement(name = "ConnectionReadOnlyFlag")
    protected String connectionReadOnlyFlag;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "ConvertToAssetFlag")
    protected Boolean convertToAssetFlag;
    @XmlElement(name = "Cost")
    protected BigDecimal cost;
    @XmlElement(name = "CoveredAssetId")
    protected String coveredAssetId;
    @XmlElement(name = "CoveredAssetProduct")
    protected String coveredAssetProduct;
    @XmlElement(name = "CoveredAssetProductId")
    protected String coveredAssetProductId;
    @XmlElement(name = "CoveredLineNumber")
    protected BigDecimal coveredLineNumber;
    @XmlElement(name = "CoveredProduct")
    protected String coveredProduct;
    @XmlElement(name = "CoveredProductBasePrice")
    protected BigDecimal coveredProductBasePrice;
    @XmlElement(name = "CoveredProductDiscount")
    protected String coveredProductDiscount;
    @XmlElement(name = "CoveredProductDiscountAmount")
    protected BigDecimal coveredProductDiscountAmount;
    @XmlElement(name = "CoveredProductDiscountPercent")
    protected BigDecimal coveredProductDiscountPercent;
    @XmlElement(name = "CoveredProductId")
    protected String coveredProductId;
    @XmlElement(name = "CoveredProductItemPrice")
    protected BigDecimal coveredProductItemPrice;
    @XmlElement(name = "CoveredProductItemPrice1")
    protected BigDecimal coveredProductItemPrice1;
    @XmlElement(name = "CoveredProductItemPrice2")
    protected BigDecimal coveredProductItemPrice2;
    @XmlElement(name = "CoveredProductItemPrice3")
    protected BigDecimal coveredProductItemPrice3;
    @XmlElement(name = "CoveredProductNetPrice")
    protected BigDecimal coveredProductNetPrice;
    @XmlElement(name = "CoveredProductReadOnlyFlag")
    protected Boolean coveredProductReadOnlyFlag;
    @XmlElement(name = "CoveredProductRollupAmount")
    protected BigDecimal coveredProductRollupAmount;
    @XmlElement(name = "CoveredProductUnitPrice")
    protected BigDecimal coveredProductUnitPrice;
    @XmlElement(name = "CoveredQuoteItemId")
    protected String coveredQuoteItemId;
    @XmlElement(name = "CreatedByLogin")
    protected String createdByLogin;
    @XmlElement(name = "CumulativeConfQty")
    protected BigDecimal cumulativeConfQty;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CurrencyCodePrecision")
    protected BigDecimal currencyCodePrecision;
    @XmlElement(name = "DeleteClassRegistration")
    protected String deleteClassRegistration;
    @XmlElement(name = "DeliveryStatus")
    protected String deliveryStatus;
    @XmlElement(name = "Description2")
    protected String description2;
    @XmlElement(name = "DestinationInventoryLocId")
    protected String destinationInventoryLocId;
    @XmlElement(name = "DestinationInventoryLocation2")
    protected String destinationInventoryLocation2;
    @XmlElement(name = "DestinationInventoryLocationIntegrationId")
    protected String destinationInventoryLocationIntegrationId;
    @XmlElement(name = "Discount2")
    protected BigDecimal discount2;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountAmount-Display")
    protected BigDecimal discountAmountDisplay;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "DiscountPercent-Display")
    protected BigDecimal discountPercentDisplay;
    @XmlElement(name = "DiscountSource")
    protected String discountSource;
    @XmlElement(name = "DisplayPackageName")
    protected String displayPackageName;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "EAISyncDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eaiSyncDate;
    @XmlElement(name = "EarliestTermDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestTermDate;
    @XmlElement(name = "EffectiveFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveFrom;
    @XmlElement(name = "EffectivePricingPeriodId")
    protected String effectivePricingPeriodId;
    @XmlElement(name = "EffectiveTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveTo;
    @XmlElement(name = "EligibilityReason")
    protected String eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected String eligibilityStatus;
    @XmlElement(name = "EntitlementId")
    protected String entitlementId;
    @XmlElement(name = "EntitlementName")
    protected String entitlementName;
    @XmlElement(name = "ExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(name = "ExcludePricingFlag")
    protected Boolean excludePricingFlag;
    @XmlElement(name = "ExpectedDeliveryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDate;
    @XmlElement(name = "ExtendedLineTotal")
    protected BigDecimal extendedLineTotal;
    @XmlElement(name = "ExtendedLineTotal-Display")
    protected BigDecimal extendedLineTotalDisplay;
    @XmlElement(name = "ExtendedQuantity")
    protected BigDecimal extendedQuantity;
    @XmlElement(name = "ExternalFulfillLoc")
    protected String externalFulfillLoc;
    @XmlElement(name = "FixPriceFlag")
    protected Boolean fixPriceFlag;
    @XmlElement(name = "ForcastableFlag")
    protected Boolean forcastableFlag;
    @XmlElement(name = "FreightAmount")
    protected BigDecimal freightAmount;
    @XmlElement(name = "FreightTerms")
    protected String freightTerms;
    @XmlElement(name = "FunctionalCurrencyCode")
    protected String functionalCurrencyCode;
    @XmlElement(name = "FunctionalExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar functionalExchangeDate;
    @XmlElement(name = "FunctionalItemPrice")
    protected BigDecimal functionalItemPrice;
    @XmlElement(name = "FunctionalLineTotal")
    protected BigDecimal functionalLineTotal;
    @XmlElement(name = "FunctionalUnitPrice")
    protected BigDecimal functionalUnitPrice;
    @XmlElement(name = "GrossWeight")
    protected BigDecimal grossWeight;
    @XmlElement(name = "GrossWeightUoM")
    protected String grossWeightUoM;
    @XmlElement(name = "HasChildren")
    protected Boolean hasChildren;
    @XmlElement(name = "HasGenericsFlag")
    protected Boolean hasGenericsFlag;
    @XmlElement(name = "HeaderCurrencyCode")
    protected String headerCurrencyCode;
    @XmlElement(name = "HeaderDiscount")
    protected BigDecimal headerDiscount;
    @XmlElement(name = "HeaderDiscountAmount")
    protected BigDecimal headerDiscountAmount;
    @XmlElement(name = "HeaderExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar headerExchangeDate;
    @XmlElement(name = "HeaderRevision")
    protected String headerRevision;
    @XmlElement(name = "HoldFlag")
    protected Boolean holdFlag;
    @XmlElement(name = "HoldReason")
    protected String holdReason;
    @XmlElement(name = "IncentiveCompensationStatus")
    protected String incentiveCompensationStatus;
    @XmlElement(name = "IncentiveStatusChangedFlg")
    protected Boolean incentiveStatusChangedFlg;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected Boolean inclusiveEligibilityFlag;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "InvoicedQuantity")
    protected BigDecimal invoicedQuantity;
    @XmlElement(name = "IsExpanded")
    protected Boolean isExpanded;
    @XmlElement(name = "IsComplexProduct")
    protected Boolean isComplexProduct;
    @XmlElement(name = "IsComplexProductBundleComponent")
    protected Boolean isComplexProductBundleComponent;
    @XmlElement(name = "IsComplexProductComponent")
    protected Boolean isComplexProductComponent;
    @XmlElement(name = "IsComplexProductNotBundle")
    protected Boolean isComplexProductNotBundle;
    @XmlElement(name = "IsComplexProductNotBundleRoot")
    protected Boolean isComplexProductNotBundleRoot;
    @XmlElement(name = "IsComplexProductORBundleComponent")
    protected Boolean isComplexProductORBundleComponent;
    @XmlElement(name = "IsComplexProductRoot")
    protected Boolean isComplexProductRoot;
    @XmlElement(name = "IsPackageProductComponent")
    protected Boolean isPackageProductComponent;
    @XmlElement(name = "IsRootItem")
    protected Boolean isRootItem;
    @XmlElement(name = "ItemDisplayName")
    protected String itemDisplayName;
    @XmlElement(name = "ItemPrice")
    protected BigDecimal itemPrice;
    @XmlElement(name = "ItemPrice-Display")
    protected BigDecimal itemPriceDisplay;
    @XmlElement(name = "ItemPriceList")
    protected String itemPriceList;
    @XmlElement(name = "ItemPriceListId")
    protected String itemPriceListId;
    @XmlElement(name = "ItemPriceListIntegrationId")
    protected String itemPriceListIntegrationId;
    @XmlElement(name = "ItemType")
    protected String itemType;
    @XmlElement(name = "ItemType-LanguageIndependent")
    protected String itemTypeLanguageIndependent;
    @XmlElement(name = "ItemIsProduct")
    protected Boolean itemIsProduct;
    @XmlElement(name = "LabeledProductFlag")
    protected Boolean labeledProductFlag;
    @XmlElement(name = "LateFlag")
    protected Boolean lateFlag;
    @XmlElement(name = "LineItemNetTotal")
    protected BigDecimal lineItemNetTotal;
    @XmlElement(name = "LineNumber2")
    protected Integer lineNumber2;
    @XmlElement(name = "LineNumber22")
    protected BigDecimal lineNumber22;
    @XmlElement(name = "LineTotal")
    protected BigDecimal lineTotal;
    @XmlElement(name = "LineTotal-Display")
    protected BigDecimal lineTotalDisplay;
    @XmlElement(name = "LineTotalinHeaderCurrency")
    protected BigDecimal lineTotalinHeaderCurrency;
    @XmlElement(name = "LoanerFlag")
    protected Boolean loanerFlag;
    @XmlElement(name = "MRCCxTotal")
    protected BigDecimal mrcCxTotal;
    @XmlElement(name = "MRCCxTotalinHeaderCurrency")
    protected BigDecimal mrcCxTotalinHeaderCurrency;
    @XmlElement(name = "MaxPrice")
    protected BigDecimal maxPrice;
    @XmlElement(name = "MaximumQuantity")
    protected BigDecimal maximumQuantity;
    @XmlElement(name = "MinPrice")
    protected BigDecimal minPrice;
    @XmlElement(name = "MinimumLot")
    protected BigDecimal minimumLot;
    @XmlElement(name = "MinimumQuantity")
    protected BigDecimal minimumQuantity;
    @XmlElement(name = "NOTWrite-InProductFlag")
    protected Boolean notWriteInProductFlag;
    @XmlElement(name = "NRCAmount")
    protected BigDecimal nrcAmount;
    @XmlElement(name = "NRCCurrencyCode")
    protected String nrcCurrencyCode;
    @XmlElement(name = "NRCCxTotal")
    protected BigDecimal nrcCxTotal;
    @XmlElement(name = "NRCCxTotalinHeaderCurrency")
    protected BigDecimal nrcCxTotalinHeaderCurrency;
    @XmlElement(name = "NRCExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nrcExchangeDate;
    @XmlElement(name = "NRCNumberofBills")
    protected Integer nrcNumberofBills;
    @XmlElement(name = "NRCPlanId")
    protected String nrcPlanId;
    @XmlElement(name = "NRCPlanName")
    protected String nrcPlanName;
    @XmlElement(name = "NRCScheduleId")
    protected String nrcScheduleId;
    @XmlElement(name = "NRCScheduleName")
    protected String nrcScheduleName;
    @XmlElement(name = "NRCStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nrcStartDate;
    @XmlElement(name = "NeedRefreshBasePrice")
    protected Boolean needRefreshBasePrice;
    @XmlElement(name = "NetDiscountAmount")
    protected BigDecimal netDiscountAmount;
    @XmlElement(name = "NetDiscountAmount-Display")
    protected BigDecimal netDiscountAmountDisplay;
    @XmlElement(name = "NetDiscountPercent")
    protected BigDecimal netDiscountPercent;
    @XmlElement(name = "NetDiscountPercent-Display")
    protected BigDecimal netDiscountPercentDisplay;
    @XmlElement(name = "NetPrice")
    protected BigDecimal netPrice;
    @XmlElement(name = "NetPriceCalc")
    protected BigDecimal netPriceCalc;
    @XmlElement(name = "NetType")
    protected String netType;
    @XmlElement(name = "NetworkElementType")
    protected String networkElementType;
    @XmlElement(name = "NetworkReadOnlyFlag")
    protected String networkReadOnlyFlag;
    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "NodeFlag")
    protected String nodeFlag;
    @XmlElement(name = "NodeReadOnlyFlag")
    protected String nodeReadOnlyFlag;
    @XmlElement(name = "Non-DiscountedLineTotal")
    protected BigDecimal nonDiscountedLineTotal;
    @XmlElement(name = "Non-DiscountedLineTotal-Display")
    protected BigDecimal nonDiscountedLineTotalDisplay;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "NoteFlag")
    protected Boolean noteFlag;
    @XmlElement(name = "Options")
    protected String options;
    @XmlElement(name = "OrderAcctId")
    protected String orderAcctId;
    @XmlElement(name = "OrderActiveFlag")
    protected Boolean orderActiveFlag;
    @XmlElement(name = "OrderCPN")
    protected String orderCPN;
    @XmlElement(name = "OrderFreightTermsCode")
    protected String orderFreightTermsCode;
    @XmlElement(name = "OrderHeaderId")
    protected String orderHeaderId;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderPriority")
    protected String orderPriority;
    @XmlElement(name = "OrderQuoteId")
    protected String orderQuoteId;
    @XmlElement(name = "OrderSourceInventoryLocId")
    protected String orderSourceInventoryLocId;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "OrderType2")
    protected String orderType2;
    @XmlElement(name = "OrderTypeId")
    protected String orderTypeId;
    @XmlElement(name = "Organization22")
    protected String organization22;
    @XmlElement(name = "OrganizationId")
    protected String organizationId;
    @XmlElement(name = "OriginalPrice")
    protected BigDecimal originalPrice;
    @XmlElement(name = "OriginalQty")
    protected BigDecimal originalQty;
    @XmlElement(name = "OutlineNumber")
    protected String outlineNumber;
    @XmlElement(name = "OwnerAccountId")
    protected String ownerAccountId;
    @XmlElement(name = "PACOrderAccountId")
    protected String pacOrderAccountId;
    @XmlElement(name = "PackageName")
    protected String packageName;
    @XmlElement(name = "PackageNameReadOnlyFlag")
    protected Boolean packageNameReadOnlyFlag;
    @XmlElement(name = "ParentAccountId")
    protected String parentAccountId;
    @XmlElement(name = "ParentCurrencyCode")
    protected String parentCurrencyCode;
    @XmlElement(name = "ParentExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar parentExchangeDate;
    @XmlElement(name = "ParentOrderItemId")
    protected String parentOrderItemId;
    @XmlElement(name = "ParentPackageName")
    protected String parentPackageName;
    @XmlElement(name = "ParentProductId")
    protected String parentProductId;
    @XmlElement(name = "ParentTaxSubcomponentFlag")
    protected Boolean parentTaxSubcomponentFlag;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "PartialShip")
    protected Boolean partialShip;
    @XmlElement(name = "PostPickCD")
    protected String postPickCD;
    @XmlElement(name = "PrePickCD")
    protected String prePickCD;
    @XmlElement(name = "PreviousAssetStatus")
    protected String previousAssetStatus;
    @XmlElement(name = "PreviousBillingAccount")
    protected String previousBillingAccount;
    @XmlElement(name = "PreviousBillingAccountId")
    protected String previousBillingAccountId;
    @XmlElement(name = "PreviousSerialNumber")
    protected String previousSerialNumber;
    @XmlElement(name = "PreviousServiceAccount")
    protected String previousServiceAccount;
    @XmlElement(name = "PreviousServiceAccountId")
    protected String previousServiceAccountId;
    @XmlElement(name = "PreviousServiceId")
    protected String previousServiceId;
    @XmlElement(name = "PreviousUsageAssetId")
    protected String previousUsageAssetId;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "PricingAdjustmentAmount")
    protected BigDecimal pricingAdjustmentAmount;
    @XmlElement(name = "PricingComments")
    protected String pricingComments;
    @XmlElement(name = "PricingQuantity")
    protected BigDecimal pricingQuantity;
    @XmlElement(name = "PrimaryAssetChildId")
    protected String primaryAssetChildId;
    @XmlElement(name = "ProcessedFlag")
    protected Boolean processedFlag;
    @XmlElement(name = "ProdItemId")
    protected String prodItemId;
    @XmlElement(name = "ProdPromId")
    protected String prodPromId;
    @XmlElement(name = "ProdPromInstanceId")
    protected String prodPromInstanceId;
    @XmlElement(name = "ProdPromName")
    protected String prodPromName;
    @XmlElement(name = "ProdPromReadOnlyFlag")
    protected Boolean prodPromReadOnlyFlag;
    @XmlElement(name = "ProdPromRuleId")
    protected String prodPromRuleId;
    @XmlElement(name = "ProdPromSourceId")
    protected String prodPromSourceId;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "ProductDefTypeCode")
    protected String productDefTypeCode;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductIntegrationId")
    protected String productIntegrationId;
    @XmlElement(name = "ProductPortId")
    protected String productPortId;
    @XmlElement(name = "ProductPrimaryProductLineId")
    protected String productPrimaryProductLineId;
    @XmlElement(name = "ProductReadOnlyFlag")
    protected Boolean productReadOnlyFlag;
    @XmlElement(name = "ProductStatusCode")
    protected String productStatusCode;
    @XmlElement(name = "ProductTaxableFlag")
    protected Boolean productTaxableFlag;
    @XmlElement(name = "ProductThumbnailImageFileExt")
    protected String productThumbnailImageFileExt;
    @XmlElement(name = "ProductThumbnailImageFileName")
    protected String productThumbnailImageFileName;
    @XmlElement(name = "ProductThumbnailImageFileRev")
    protected String productThumbnailImageFileRev;
    @XmlElement(name = "ProductThumbnailImageId")
    protected String productThumbnailImageId;
    @XmlElement(name = "ProductTypeCalc")
    protected String productTypeCalc;
    @XmlElement(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlElement(name = "ProductUnitofMeasure")
    protected String productUnitofMeasure;
    @XmlElement(name = "ProductXAClassId")
    protected String productXAClassId;
    @XmlElement(name = "PromotionId")
    protected String promotionId;
    @XmlElement(name = "PromotionItemFlag")
    protected Boolean promotionItemFlag;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "QuantityReadOnlyFlag")
    protected Boolean quantityReadOnlyFlag;
    @XmlElement(name = "QuantityRequested")
    protected Integer quantityRequested;
    @XmlElement(name = "QuantityShipped")
    protected Integer quantityShipped;
    @XmlElement(name = "QuantityToInvoice")
    protected BigDecimal quantityToInvoice;
    @XmlElement(name = "QuoteId2")
    protected String quoteId2;
    @XmlElement(name = "QuoteItemId")
    protected String quoteItemId;
    @XmlElement(name = "RCAdjustAmount")
    protected BigDecimal rcAdjustAmount;
    @XmlElement(name = "RCAdjustUM")
    protected String rcAdjustUM;
    @XmlElement(name = "RCAmount")
    protected BigDecimal rcAmount;
    @XmlElement(name = "RCCurrencyCode")
    protected String rcCurrencyCode;
    @XmlElement(name = "RCExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rcExchangeDate;
    @XmlElement(name = "RCScheduleId")
    protected String rcScheduleId;
    @XmlElement(name = "RCScheduleName")
    protected String rcScheduleName;
    @XmlElement(name = "RCStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcStartDate;
    @XmlElement(name = "ReserveTime")
    protected BigDecimal reserveTime;
    @XmlElement(name = "ReserveTimeUoM")
    protected String reserveTimeUoM;
    @XmlElement(name = "ReturnToAccount")
    protected String returnToAccount;
    @XmlElement(name = "ReturnToAccountId")
    protected String returnToAccountId;
    @XmlElement(name = "ReturnToAccountIntegrationId")
    protected String returnToAccountIntegrationId;
    @XmlElement(name = "ReturnToAccountLocation")
    protected String returnToAccountLocation;
    @XmlElement(name = "ReturnToAddressId")
    protected String returnToAddressId;
    @XmlElement(name = "ReturnToAddressIntegrationId")
    protected String returnToAddressIntegrationId;
    @XmlElement(name = "ReturnToContactId")
    protected String returnToContactId;
    @XmlElement(name = "ReturnToContactIntegrationId")
    protected String returnToContactIntegrationId;
    @XmlElement(name = "RevenueType")
    protected String revenueType;
    @XmlElement(name = "RevisedLineItemId")
    protected String revisedLineItemId;
    @XmlElement(name = "RollupAmount")
    protected BigDecimal rollupAmount;
    @XmlElement(name = "RollupItemPrice")
    protected BigDecimal rollupItemPrice;
    @XmlElement(name = "RollupItemPrice-Display")
    protected BigDecimal rollupItemPriceDisplay;
    @XmlElement(name = "RootActionCode")
    protected String rootActionCode;
    @XmlElement(name = "RootAssetIntegrationId")
    protected String rootAssetIntegrationId;
    @XmlElement(name = "RootBundleFlag")
    protected Boolean rootBundleFlag;
    @XmlElement(name = "RootCfgLatestReleasedFlag")
    protected String rootCfgLatestReleasedFlag;
    @XmlElement(name = "RootCfgType")
    protected String rootCfgType;
    @XmlElement(name = "RootItemPriceListId")
    protected String rootItemPriceListId;
    @XmlElement(name = "RootLineItemDueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rootLineItemDueDate;
    @XmlElement(name = "RootOrderItemId")
    protected String rootOrderItemId;
    @XmlElement(name = "RootPackageName")
    protected String rootPackageName;
    @XmlElement(name = "RootProductDefTypeCode")
    protected String rootProductDefTypeCode;
    @XmlElement(name = "RootProductId")
    protected String rootProductId;
    @XmlElement(name = "RootProductName")
    protected String rootProductName;
    @XmlElement(name = "RootProductTypeCode")
    protected String rootProductTypeCode;
    @XmlElement(name = "SAP4xFreight")
    protected BigDecimal sap4XFreight;
    @XmlElement(name = "SAP4xNetPrice")
    protected BigDecimal sap4XNetPrice;
    @XmlElement(name = "SAP4xPlant")
    protected String sap4XPlant;
    @XmlElement(name = "SAP4xTax")
    protected BigDecimal sap4XTax;
    @XmlElement(name = "SAP4xUnitNetPrice")
    protected String sap4XUnitNetPrice;
    @XmlElement(name = "SAPConditionPricingUnit")
    protected Integer sapConditionPricingUnit;
    @XmlElement(name = "SAPConditionUnit")
    protected String sapConditionUnit;
    @XmlElement(name = "SAPCumulativeConfirmedQty")
    protected BigDecimal sapCumulativeConfirmedQty;
    @XmlElement(name = "SAPCurrency")
    protected String sapCurrency;
    @XmlElement(name = "SAPDeliveryStatus")
    protected String sapDeliveryStatus;
    @XmlElement(name = "SAPDeliveryStatusWide")
    protected String sapDeliveryStatusWide;
    @XmlElement(name = "SAPInputId")
    protected String sapInputId;
    @XmlElement(name = "SAPItemNumber")
    protected Integer sapItemNumber;
    @XmlElement(name = "SAPItemShortText")
    protected String sapItemShortText;
    @XmlElement(name = "SAPMaterialPart")
    protected String sapMaterialPart;
    @XmlElement(name = "SAPNetPrice")
    protected BigDecimal sapNetPrice;
    @XmlElement(name = "SAPNetValue")
    protected BigDecimal sapNetValue;
    @XmlElement(name = "SAPParentId")
    protected String sapParentId;
    @XmlElement(name = "SAPReferenceQty")
    protected BigDecimal sapReferenceQty;
    @XmlElement(name = "SAPRequestedQty")
    protected BigDecimal sapRequestedQty;
    @XmlElement(name = "SAPRequestedShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sapRequestedShipDate;
    @XmlElement(name = "SAPSalesUnit")
    protected String sapSalesUnit;
    @XmlElement(name = "SalesRepPosition")
    protected String salesRepPosition;
    @XmlElement(name = "SalesRepPostnId")
    protected String salesRepPostnId;
    @XmlElement(name = "SalesServiceFlag")
    protected Boolean salesServiceFlag;
    @XmlElement(name = "SalesUnitofMeasure")
    protected String salesUnitofMeasure;
    @XmlElement(name = "ScheduledShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduledShipDate;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Serialized")
    protected Boolean serialized;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "ServiceAccountId")
    protected String serviceAccountId;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "ServicePriceAmount")
    protected BigDecimal servicePriceAmount;
    @XmlElement(name = "ServicePriceMethod")
    protected String servicePriceMethod;
    @XmlElement(name = "ServicePricePercent")
    protected BigDecimal servicePricePercent;
    @XmlElement(name = "ShipCompleteFlag")
    protected Boolean shipCompleteFlag;
    @XmlElement(name = "ShipInstrustions")
    protected String shipInstrustions;
    @XmlElement(name = "ShipMethod")
    protected String shipMethod;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected String shipToAccountIntegrationId;
    @XmlElement(name = "ShipToAccountLocation")
    protected String shipToAccountLocation;
    @XmlElement(name = "ShipToAddress")
    protected String shipToAddress;
    @XmlElement(name = "ShipToAddress2")
    protected String shipToAddress2;
    @XmlElement(name = "ShipToAddressId")
    protected String shipToAddressId;
    @XmlElement(name = "ShipToCity2")
    protected String shipToCity2;
    @XmlElement(name = "ShipToContact-FirstName")
    protected String shipToContactFirstName;
    @XmlElement(name = "ShipToContact-LastName")
    protected String shipToContactLastName;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected String shipToContactIntegrationId;
    @XmlElement(name = "ShipToCountry2")
    protected String shipToCountry2;
    @XmlElement(name = "ShipToFirstName")
    protected String shipToFirstName;
    @XmlElement(name = "ShipToLastName")
    protected String shipToLastName;
    @XmlElement(name = "ShipToState2")
    protected String shipToState2;
    @XmlElement(name = "ShipToZip2")
    protected String shipToZip2;
    @XmlElement(name = "ShipTogetherFlag")
    protected Boolean shipTogetherFlag;
    @XmlElement(name = "ShiptoAddressIntegrationId2")
    protected String shiptoAddressIntegrationId2;
    @XmlElement(name = "ShipmentNumber")
    protected BigDecimal shipmentNumber;
    @XmlElement(name = "ShippingMethod")
    protected String shippingMethod;
    @XmlElement(name = "SingleSourceFlag")
    protected Boolean singleSourceFlag;
    @XmlElement(name = "SkipPricingFlag")
    protected Boolean skipPricingFlag;
    @XmlElement(name = "SkipValidationFlag")
    protected Boolean skipValidationFlag;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "SourceInventoryLocId")
    protected String sourceInventoryLocId;
    @XmlElement(name = "SourceInventoryLocIntegrationId")
    protected String sourceInventoryLocIntegrationId;
    @XmlElement(name = "SourceInventoryLocation2")
    protected String sourceInventoryLocation2;
    @XmlElement(name = "SourceInventoryLocationReceiveToAddressId")
    protected String sourceInventoryLocationReceiveToAddressId;
    @XmlElement(name = "SourceInventoryLocationReceiveToPostalCode")
    protected String sourceInventoryLocationReceiveToPostalCode;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxAmountHeaderCurrency")
    protected BigDecimal taxAmountHeaderCurrency;
    @XmlElement(name = "TaxAmountInternalHeaderCurrency")
    protected BigDecimal taxAmountInternalHeaderCurrency;
    @XmlElement(name = "TaxExemptFlag")
    protected Boolean taxExemptFlag;
    @XmlElement(name = "TaxExemptNumber")
    protected String taxExemptNumber;
    @XmlElement(name = "TaxExemptReason")
    protected String taxExemptReason;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "TaxSubcomponentFlag")
    protected Boolean taxSubcomponentFlag;
    @XmlElement(name = "TaxableFlag")
    protected String taxableFlag;
    @XmlElement(name = "TerminationFee")
    protected BigDecimal terminationFee;
    @XmlElement(name = "ToNode")
    protected String toNode;
    @XmlElement(name = "ToServiceAccount")
    protected String toServiceAccount;
    @XmlElement(name = "ToServiceAccountId")
    protected String toServiceAccountId;
    @XmlElement(name = "UnitNetPrice")
    protected BigDecimal unitNetPrice;
    @XmlElement(name = "UnitPrice")
    protected BigDecimal unitPrice;
    @XmlElement(name = "UnitPrice-Display")
    protected BigDecimal unitPriceDisplay;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "UpdatedByLogin2")
    protected String updatedByLogin2;
    @XmlElement(name = "UsagePlanId")
    protected String usagePlanId;
    @XmlElement(name = "UsagePlanName")
    protected String usagePlanName;
    @XmlElement(name = "UsageScheduleId")
    protected String usageScheduleId;
    @XmlElement(name = "UsageScheduleName")
    protected String usageScheduleName;
    @XmlElement(name = "UsePlanId")
    protected String usePlanId;
    @XmlElement(name = "UsePlanName")
    protected String usePlanName;
    @XmlElement(name = "UseStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useStartDate;
    @XmlElement(name = "VODRowId")
    protected String vodRowId;
    @XmlElement(name = "ValidationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validationDate;
    @XmlElement(name = "ValidationStatus")
    protected String validationStatus;
    @XmlElement(name = "Volume")
    protected BigDecimal volume;
    @XmlElement(name = "VolumeDiscountId")
    protected String volumeDiscountId;
    @XmlElement(name = "VolumeDiscountIntegrationId")
    protected String volumeDiscountIntegrationId;
    @XmlElement(name = "VolumeDiscountItem")
    protected String volumeDiscountItem;
    @XmlElement(name = "VolumeDiscountItemId")
    protected String volumeDiscountItemId;
    @XmlElement(name = "VolumeDiscountMaxQty")
    protected BigDecimal volumeDiscountMaxQty;
    @XmlElement(name = "VolumeDiscountMethod")
    protected String volumeDiscountMethod;
    @XmlElement(name = "VolumeDiscountMinQty")
    protected BigDecimal volumeDiscountMinQty;
    @XmlElement(name = "VolumeUoM")
    protected String volumeUoM;
    @XmlElement(name = "VolumeUpsellItem")
    protected String volumeUpsellItem;
    @XmlElement(name = "VolumeUpsellItemId")
    protected String volumeUpsellItemId;
    @XmlElement(name = "VolumeUpsellMessage")
    protected String volumeUpsellMessage;
    @XmlElement(name = "WarrantyRecoveryFlag")
    protected Boolean warrantyRecoveryFlag;
    @XmlElement(name = "Write-InProduct")
    protected String writeInProduct;
    @XmlElement(name = "Write-InProductFlag")
    protected Boolean writeInProductFlag;
    @XmlElement(name = "Write-InProductReadOnlyFlag")
    protected Boolean writeInProductReadOnlyFlag;
    @XmlAttribute(name = "operation")
    protected String operation;

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
     * Gets the value of the atpReserved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isATPReserved() {
        return atpReserved;
    }

    /**
     * Sets the value of the atpReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setATPReserved(Boolean value) {
        this.atpReserved = value;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the activityRecommendedPartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityRecommendedPartId() {
        return activityRecommendedPartId;
    }

    /**
     * Sets the value of the activityRecommendedPartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityRecommendedPartId(String value) {
        this.activityRecommendedPartId = value;
    }

    /**
     * Gets the value of the adjustCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustCharge() {
        return adjustCharge;
    }

    /**
     * Sets the value of the adjustCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustCharge(BigDecimal value) {
        this.adjustCharge = value;
    }

    /**
     * Gets the value of the adjustDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustDate() {
        return adjustDate;
    }

    /**
     * Sets the value of the adjustDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustDate(XMLGregorianCalendar value) {
        this.adjustDate = value;
    }

    /**
     * Gets the value of the adjustedListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedListPrice() {
        return adjustedListPrice;
    }

    /**
     * Sets the value of the adjustedListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedListPrice(BigDecimal value) {
        this.adjustedListPrice = value;
    }

    /**
     * Gets the value of the adjustedListPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedListPriceDisplay() {
        return adjustedListPriceDisplay;
    }

    /**
     * Sets the value of the adjustedListPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedListPriceDisplay(BigDecimal value) {
        this.adjustedListPriceDisplay = value;
    }

    /**
     * Gets the value of the aggregrateTotalSkip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregrateTotalSkip() {
        return aggregrateTotalSkip;
    }

    /**
     * Sets the value of the aggregrateTotalSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregrateTotalSkip(String value) {
        this.aggregrateTotalSkip = value;
    }

    /**
     * Gets the value of the amountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountExchangeDate() {
        return amountExchangeDate;
    }

    /**
     * Sets the value of the amountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountExchangeDate(String value) {
        this.amountExchangeDate = value;
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
     * Gets the value of the assetExternalIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetExternalIntegrationId() {
        return assetExternalIntegrationId;
    }

    /**
     * Sets the value of the assetExternalIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetExternalIntegrationId(String value) {
        this.assetExternalIntegrationId = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetIntegrationId(String value) {
        this.assetIntegrationId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetStatus(String value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the auctionItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionItemId() {
        return auctionItemId;
    }

    /**
     * Sets the value of the auctionItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionItemId(String value) {
        this.auctionItemId = value;
    }

    /**
     * Gets the value of the auctionItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionItemName() {
        return auctionItemName;
    }

    /**
     * Sets the value of the auctionItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionItemName(String value) {
        this.auctionItemName = value;
    }

    /**
     * Gets the value of the auctionItemReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuctionItemReadOnlyFlag() {
        return auctionItemReadOnlyFlag;
    }

    /**
     * Sets the value of the auctionItemReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuctionItemReadOnlyFlag(Boolean value) {
        this.auctionItemReadOnlyFlag = value;
    }

    /**
     * Gets the value of the autoChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoChargeFlag() {
        return autoChargeFlag;
    }

    /**
     * Sets the value of the autoChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoChargeFlag(Boolean value) {
        this.autoChargeFlag = value;
    }

    /**
     * Gets the value of the autoExplodeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExplodeFlag() {
        return autoExplodeFlag;
    }

    /**
     * Sets the value of the autoExplodeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExplodeFlag(Boolean value) {
        this.autoExplodeFlag = value;
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
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableQuantity(BigDecimal value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the bcReadOnlyFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBCReadOnlyFlag2() {
        return bcReadOnlyFlag2;
    }

    /**
     * Sets the value of the bcReadOnlyFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBCReadOnlyFlag2(Boolean value) {
        this.bcReadOnlyFlag2 = value;
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
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePrice(BigDecimal value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the basePriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePriceDisplay() {
        return basePriceDisplay;
    }

    /**
     * Sets the value of the basePriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePriceDisplay(BigDecimal value) {
        this.basePriceDisplay = value;
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
     * Gets the value of the cdaPagesetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDAPagesetId() {
        return cdaPagesetId;
    }

    /**
     * Sets the value of the cdaPagesetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDAPagesetId(String value) {
        this.cdaPagesetId = value;
    }

    /**
     * Gets the value of the calculatedAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedAssetStatus() {
        return calculatedAssetStatus;
    }

    /**
     * Sets the value of the calculatedAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedAssetStatus(String value) {
        this.calculatedAssetStatus = value;
    }

    /**
     * Gets the value of the calculatedDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedDueDate() {
        return calculatedDueDate;
    }

    /**
     * Sets the value of the calculatedDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedDueDate(XMLGregorianCalendar value) {
        this.calculatedDueDate = value;
    }

    /**
     * Gets the value of the calculatedExtendedLineTotalRootsandPackageComponents property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedExtendedLineTotalRootsandPackageComponents() {
        return calculatedExtendedLineTotalRootsandPackageComponents;
    }

    /**
     * Sets the value of the calculatedExtendedLineTotalRootsandPackageComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedExtendedLineTotalRootsandPackageComponents(BigDecimal value) {
        this.calculatedExtendedLineTotalRootsandPackageComponents = value;
    }

    /**
     * Gets the value of the calculatedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedLineTotal() {
        return calculatedLineTotal;
    }

    /**
     * Sets the value of the calculatedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedLineTotal(BigDecimal value) {
        this.calculatedLineTotal = value;
    }

    /**
     * Gets the value of the calculatedLineTotalUI property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedLineTotalUI() {
        return calculatedLineTotalUI;
    }

    /**
     * Sets the value of the calculatedLineTotalUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedLineTotalUI(BigDecimal value) {
        this.calculatedLineTotalUI = value;
    }

    /**
     * Gets the value of the calculatedNetDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedNetDiscountAmount() {
        return calculatedNetDiscountAmount;
    }

    /**
     * Sets the value of the calculatedNetDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedNetDiscountAmount(BigDecimal value) {
        this.calculatedNetDiscountAmount = value;
    }

    /**
     * Gets the value of the calculatedNetDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedNetDiscountPercent() {
        return calculatedNetDiscountPercent;
    }

    /**
     * Sets the value of the calculatedNetDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedNetDiscountPercent(BigDecimal value) {
        this.calculatedNetDiscountPercent = value;
    }

    /**
     * Gets the value of the calculatedNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedNetPrice() {
        return calculatedNetPrice;
    }

    /**
     * Sets the value of the calculatedNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedNetPrice(BigDecimal value) {
        this.calculatedNetPrice = value;
    }

    /**
     * Gets the value of the calculatedNetworkElementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedNetworkElementType() {
        return calculatedNetworkElementType;
    }

    /**
     * Sets the value of the calculatedNetworkElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedNetworkElementType(String value) {
        this.calculatedNetworkElementType = value;
    }

    /**
     * Gets the value of the calculatedNonDiscountedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedNonDiscountedLineTotal() {
        return calculatedNonDiscountedLineTotal;
    }

    /**
     * Sets the value of the calculatedNonDiscountedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedNonDiscountedLineTotal(BigDecimal value) {
        this.calculatedNonDiscountedLineTotal = value;
    }

    /**
     * Gets the value of the calculatedProductLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedProductLineTotal() {
        return calculatedProductLineTotal;
    }

    /**
     * Sets the value of the calculatedProductLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedProductLineTotal(BigDecimal value) {
        this.calculatedProductLineTotal = value;
    }

    /**
     * Gets the value of the calculatedServiceLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedServiceLineTotal() {
        return calculatedServiceLineTotal;
    }

    /**
     * Sets the value of the calculatedServiceLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedServiceLineTotal(BigDecimal value) {
        this.calculatedServiceLineTotal = value;
    }

    /**
     * Gets the value of the calculatedTrainingLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedTrainingLineTotal() {
        return calculatedTrainingLineTotal;
    }

    /**
     * Sets the value of the calculatedTrainingLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedTrainingLineTotal(BigDecimal value) {
        this.calculatedTrainingLineTotal = value;
    }

    /**
     * Gets the value of the calculatedYourPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedYourPrice() {
        return calculatedYourPrice;
    }

    /**
     * Sets the value of the calculatedYourPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedYourPrice(BigDecimal value) {
        this.calculatedYourPrice = value;
    }

    /**
     * Gets the value of the cancelledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCancelledQuantity() {
        return cancelledQuantity;
    }

    /**
     * Sets the value of the cancelledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCancelledQuantity(BigDecimal value) {
        this.cancelledQuantity = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
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
     * Gets the value of the cfgActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCfgActiveFlag() {
        return cfgActiveFlag;
    }

    /**
     * Sets the value of the cfgActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCfgActiveFlag(Boolean value) {
        this.cfgActiveFlag = value;
    }

    /**
     * Gets the value of the cfgEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCfgEndDate() {
        return cfgEndDate;
    }

    /**
     * Sets the value of the cfgEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCfgEndDate(XMLGregorianCalendar value) {
        this.cfgEndDate = value;
    }

    /**
     * Gets the value of the cfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgLatestReleasedFlag() {
        return cfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the cfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgLatestReleasedFlag(String value) {
        this.cfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgObjectDefFirstVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCfgObjectDefFirstVersion() {
        return cfgObjectDefFirstVersion;
    }

    /**
     * Sets the value of the cfgObjectDefFirstVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCfgObjectDefFirstVersion(Integer value) {
        this.cfgObjectDefFirstVersion = value;
    }

    /**
     * Gets the value of the cfgObjectDefLastVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCfgObjectDefLastVersion() {
        return cfgObjectDefLastVersion;
    }

    /**
     * Sets the value of the cfgObjectDefLastVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCfgObjectDefLastVersion(Integer value) {
        this.cfgObjectDefLastVersion = value;
    }

    /**
     * Gets the value of the cfgReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCfgReleasedFlag() {
        return cfgReleasedFlag;
    }

    /**
     * Sets the value of the cfgReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCfgReleasedFlag(Boolean value) {
        this.cfgReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCfgStartDate() {
        return cfgStartDate;
    }

    /**
     * Sets the value of the cfgStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCfgStartDate(XMLGregorianCalendar value) {
        this.cfgStartDate = value;
    }

    /**
     * Gets the value of the cfgStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgStateCode() {
        return cfgStateCode;
    }

    /**
     * Sets the value of the cfgStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgStateCode(String value) {
        this.cfgStateCode = value;
    }

    /**
     * Gets the value of the cfgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgType() {
        return cfgType;
    }

    /**
     * Sets the value of the cfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgType(String value) {
        this.cfgType = value;
    }

    /**
     * Gets the value of the cfgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCfgVersion() {
        return cfgVersion;
    }

    /**
     * Sets the value of the cfgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCfgVersion(BigDecimal value) {
        this.cfgVersion = value;
    }

    /**
     * Gets the value of the changeCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeCost() {
        return changeCost;
    }

    /**
     * Sets the value of the changeCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeCost(String value) {
        this.changeCost = value;
    }

    /**
     * Gets the value of the chargeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeEndDate() {
        return chargeEndDate;
    }

    /**
     * Sets the value of the chargeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeEndDate(XMLGregorianCalendar value) {
        this.chargeEndDate = value;
    }

    /**
     * Gets the value of the chargeTimingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTimingType() {
        return chargeTimingType;
    }

    /**
     * Sets the value of the chargeTimingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTimingType(String value) {
        this.chargeTimingType = value;
    }

    /**
     * Gets the value of the classDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDisplayName() {
        return classDisplayName;
    }

    /**
     * Sets the value of the classDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDisplayName(String value) {
        this.classDisplayName = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the classOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfferId() {
        return classOfferId;
    }

    /**
     * Sets the value of the classOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfferId(String value) {
        this.classOfferId = value;
    }

    /**
     * Gets the value of the classRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassRegistrationId() {
        return classRegistrationId;
    }

    /**
     * Sets the value of the classRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassRegistrationId(String value) {
        this.classRegistrationId = value;
    }

    /**
     * Gets the value of the classRegistrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassRegistrationStatus() {
        return classRegistrationStatus;
    }

    /**
     * Sets the value of the classRegistrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassRegistrationStatus(String value) {
        this.classRegistrationStatus = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
    }

    /**
     * Gets the value of the compoundProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompoundProductFlag() {
        return compoundProductFlag;
    }

    /**
     * Sets the value of the compoundProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompoundProductFlag(Boolean value) {
        this.compoundProductFlag = value;
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
     * Gets the value of the configurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationModelId() {
        return configurationModelId;
    }

    /**
     * Sets the value of the configurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationModelId(String value) {
        this.configurationModelId = value;
    }

    /**
     * Gets the value of the connectionReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionReadOnlyFlag() {
        return connectionReadOnlyFlag;
    }

    /**
     * Sets the value of the connectionReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionReadOnlyFlag(String value) {
        this.connectionReadOnlyFlag = value;
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
     * Gets the value of the convertToAssetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertToAssetFlag() {
        return convertToAssetFlag;
    }

    /**
     * Sets the value of the convertToAssetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertToAssetFlag(Boolean value) {
        this.convertToAssetFlag = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

    /**
     * Gets the value of the coveredAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredAssetId() {
        return coveredAssetId;
    }

    /**
     * Sets the value of the coveredAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredAssetId(String value) {
        this.coveredAssetId = value;
    }

    /**
     * Gets the value of the coveredAssetProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredAssetProduct() {
        return coveredAssetProduct;
    }

    /**
     * Sets the value of the coveredAssetProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredAssetProduct(String value) {
        this.coveredAssetProduct = value;
    }

    /**
     * Gets the value of the coveredAssetProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredAssetProductId() {
        return coveredAssetProductId;
    }

    /**
     * Sets the value of the coveredAssetProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredAssetProductId(String value) {
        this.coveredAssetProductId = value;
    }

    /**
     * Gets the value of the coveredLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredLineNumber() {
        return coveredLineNumber;
    }

    /**
     * Sets the value of the coveredLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredLineNumber(BigDecimal value) {
        this.coveredLineNumber = value;
    }

    /**
     * Gets the value of the coveredProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredProduct() {
        return coveredProduct;
    }

    /**
     * Sets the value of the coveredProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredProduct(String value) {
        this.coveredProduct = value;
    }

    /**
     * Gets the value of the coveredProductBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductBasePrice() {
        return coveredProductBasePrice;
    }

    /**
     * Sets the value of the coveredProductBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductBasePrice(BigDecimal value) {
        this.coveredProductBasePrice = value;
    }

    /**
     * Gets the value of the coveredProductDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredProductDiscount() {
        return coveredProductDiscount;
    }

    /**
     * Sets the value of the coveredProductDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredProductDiscount(String value) {
        this.coveredProductDiscount = value;
    }

    /**
     * Gets the value of the coveredProductDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductDiscountAmount() {
        return coveredProductDiscountAmount;
    }

    /**
     * Sets the value of the coveredProductDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductDiscountAmount(BigDecimal value) {
        this.coveredProductDiscountAmount = value;
    }

    /**
     * Gets the value of the coveredProductDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductDiscountPercent() {
        return coveredProductDiscountPercent;
    }

    /**
     * Sets the value of the coveredProductDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductDiscountPercent(BigDecimal value) {
        this.coveredProductDiscountPercent = value;
    }

    /**
     * Gets the value of the coveredProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredProductId() {
        return coveredProductId;
    }

    /**
     * Sets the value of the coveredProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredProductId(String value) {
        this.coveredProductId = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductItemPrice() {
        return coveredProductItemPrice;
    }

    /**
     * Sets the value of the coveredProductItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductItemPrice(BigDecimal value) {
        this.coveredProductItemPrice = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductItemPrice1() {
        return coveredProductItemPrice1;
    }

    /**
     * Sets the value of the coveredProductItemPrice1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductItemPrice1(BigDecimal value) {
        this.coveredProductItemPrice1 = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductItemPrice2() {
        return coveredProductItemPrice2;
    }

    /**
     * Sets the value of the coveredProductItemPrice2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductItemPrice2(BigDecimal value) {
        this.coveredProductItemPrice2 = value;
    }

    /**
     * Gets the value of the coveredProductItemPrice3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductItemPrice3() {
        return coveredProductItemPrice3;
    }

    /**
     * Sets the value of the coveredProductItemPrice3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductItemPrice3(BigDecimal value) {
        this.coveredProductItemPrice3 = value;
    }

    /**
     * Gets the value of the coveredProductNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductNetPrice() {
        return coveredProductNetPrice;
    }

    /**
     * Sets the value of the coveredProductNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductNetPrice(BigDecimal value) {
        this.coveredProductNetPrice = value;
    }

    /**
     * Gets the value of the coveredProductReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoveredProductReadOnlyFlag() {
        return coveredProductReadOnlyFlag;
    }

    /**
     * Sets the value of the coveredProductReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoveredProductReadOnlyFlag(Boolean value) {
        this.coveredProductReadOnlyFlag = value;
    }

    /**
     * Gets the value of the coveredProductRollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductRollupAmount() {
        return coveredProductRollupAmount;
    }

    /**
     * Sets the value of the coveredProductRollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductRollupAmount(BigDecimal value) {
        this.coveredProductRollupAmount = value;
    }

    /**
     * Gets the value of the coveredProductUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredProductUnitPrice() {
        return coveredProductUnitPrice;
    }

    /**
     * Sets the value of the coveredProductUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredProductUnitPrice(BigDecimal value) {
        this.coveredProductUnitPrice = value;
    }

    /**
     * Gets the value of the coveredQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredQuoteItemId() {
        return coveredQuoteItemId;
    }

    /**
     * Sets the value of the coveredQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredQuoteItemId(String value) {
        this.coveredQuoteItemId = value;
    }

    /**
     * Gets the value of the createdByLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByLogin() {
        return createdByLogin;
    }

    /**
     * Sets the value of the createdByLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByLogin(String value) {
        this.createdByLogin = value;
    }

    /**
     * Gets the value of the cumulativeConfQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeConfQty() {
        return cumulativeConfQty;
    }

    /**
     * Sets the value of the cumulativeConfQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeConfQty(BigDecimal value) {
        this.cumulativeConfQty = value;
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
     * Gets the value of the currencyCodePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyCodePrecision() {
        return currencyCodePrecision;
    }

    /**
     * Sets the value of the currencyCodePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyCodePrecision(BigDecimal value) {
        this.currencyCodePrecision = value;
    }

    /**
     * Gets the value of the deleteClassRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteClassRegistration() {
        return deleteClassRegistration;
    }

    /**
     * Sets the value of the deleteClassRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteClassRegistration(String value) {
        this.deleteClassRegistration = value;
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
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the destinationInventoryLocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryLocId() {
        return destinationInventoryLocId;
    }

    /**
     * Sets the value of the destinationInventoryLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryLocId(String value) {
        this.destinationInventoryLocId = value;
    }

    /**
     * Gets the value of the destinationInventoryLocation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryLocation2() {
        return destinationInventoryLocation2;
    }

    /**
     * Sets the value of the destinationInventoryLocation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryLocation2(String value) {
        this.destinationInventoryLocation2 = value;
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
     * Gets the value of the discount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount2() {
        return discount2;
    }

    /**
     * Sets the value of the discount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount2(BigDecimal value) {
        this.discount2 = value;
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
     * Gets the value of the discountAmountDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmountDisplay() {
        return discountAmountDisplay;
    }

    /**
     * Sets the value of the discountAmountDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmountDisplay(BigDecimal value) {
        this.discountAmountDisplay = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountPercentDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercentDisplay() {
        return discountPercentDisplay;
    }

    /**
     * Sets the value of the discountPercentDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercentDisplay(BigDecimal value) {
        this.discountPercentDisplay = value;
    }

    /**
     * Gets the value of the discountSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSource() {
        return discountSource;
    }

    /**
     * Sets the value of the discountSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSource(String value) {
        this.discountSource = value;
    }

    /**
     * Gets the value of the displayPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayPackageName() {
        return displayPackageName;
    }

    /**
     * Sets the value of the displayPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayPackageName(String value) {
        this.displayPackageName = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
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
     * Gets the value of the earliestTermDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestTermDate() {
        return earliestTermDate;
    }

    /**
     * Sets the value of the earliestTermDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestTermDate(XMLGregorianCalendar value) {
        this.earliestTermDate = value;
    }

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveFrom(XMLGregorianCalendar value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the effectivePricingPeriodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectivePricingPeriodId() {
        return effectivePricingPeriodId;
    }

    /**
     * Sets the value of the effectivePricingPeriodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectivePricingPeriodId(String value) {
        this.effectivePricingPeriodId = value;
    }

    /**
     * Gets the value of the effectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveTo() {
        return effectiveTo;
    }

    /**
     * Sets the value of the effectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveTo(XMLGregorianCalendar value) {
        this.effectiveTo = value;
    }

    /**
     * Gets the value of the eligibilityReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityReason() {
        return eligibilityReason;
    }

    /**
     * Sets the value of the eligibilityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityReason(String value) {
        this.eligibilityReason = value;
    }

    /**
     * Gets the value of the eligibilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Sets the value of the eligibilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityStatus(String value) {
        this.eligibilityStatus = value;
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
     * Gets the value of the excludePricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludePricingFlag() {
        return excludePricingFlag;
    }

    /**
     * Sets the value of the excludePricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludePricingFlag(Boolean value) {
        this.excludePricingFlag = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the extendedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendedLineTotal() {
        return extendedLineTotal;
    }

    /**
     * Sets the value of the extendedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendedLineTotal(BigDecimal value) {
        this.extendedLineTotal = value;
    }

    /**
     * Gets the value of the extendedLineTotalDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendedLineTotalDisplay() {
        return extendedLineTotalDisplay;
    }

    /**
     * Sets the value of the extendedLineTotalDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendedLineTotalDisplay(BigDecimal value) {
        this.extendedLineTotalDisplay = value;
    }

    /**
     * Gets the value of the extendedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendedQuantity() {
        return extendedQuantity;
    }

    /**
     * Sets the value of the extendedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendedQuantity(BigDecimal value) {
        this.extendedQuantity = value;
    }

    /**
     * Gets the value of the externalFulfillLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalFulfillLoc() {
        return externalFulfillLoc;
    }

    /**
     * Sets the value of the externalFulfillLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalFulfillLoc(String value) {
        this.externalFulfillLoc = value;
    }

    /**
     * Gets the value of the fixPriceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixPriceFlag() {
        return fixPriceFlag;
    }

    /**
     * Sets the value of the fixPriceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixPriceFlag(Boolean value) {
        this.fixPriceFlag = value;
    }

    /**
     * Gets the value of the forcastableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcastableFlag() {
        return forcastableFlag;
    }

    /**
     * Sets the value of the forcastableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcastableFlag(Boolean value) {
        this.forcastableFlag = value;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightAmount(BigDecimal value) {
        this.freightAmount = value;
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
     * Gets the value of the functionalCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalCurrencyCode() {
        return functionalCurrencyCode;
    }

    /**
     * Sets the value of the functionalCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalCurrencyCode(String value) {
        this.functionalCurrencyCode = value;
    }

    /**
     * Gets the value of the functionalExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFunctionalExchangeDate() {
        return functionalExchangeDate;
    }

    /**
     * Sets the value of the functionalExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFunctionalExchangeDate(XMLGregorianCalendar value) {
        this.functionalExchangeDate = value;
    }

    /**
     * Gets the value of the functionalItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFunctionalItemPrice() {
        return functionalItemPrice;
    }

    /**
     * Sets the value of the functionalItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFunctionalItemPrice(BigDecimal value) {
        this.functionalItemPrice = value;
    }

    /**
     * Gets the value of the functionalLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFunctionalLineTotal() {
        return functionalLineTotal;
    }

    /**
     * Sets the value of the functionalLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFunctionalLineTotal(BigDecimal value) {
        this.functionalLineTotal = value;
    }

    /**
     * Gets the value of the functionalUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFunctionalUnitPrice() {
        return functionalUnitPrice;
    }

    /**
     * Sets the value of the functionalUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFunctionalUnitPrice(BigDecimal value) {
        this.functionalUnitPrice = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeight(BigDecimal value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the grossWeightUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossWeightUoM() {
        return grossWeightUoM;
    }

    /**
     * Sets the value of the grossWeightUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossWeightUoM(String value) {
        this.grossWeightUoM = value;
    }

    /**
     * Gets the value of the hasChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChildren(Boolean value) {
        this.hasChildren = value;
    }

    /**
     * Gets the value of the hasGenericsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasGenericsFlag() {
        return hasGenericsFlag;
    }

    /**
     * Sets the value of the hasGenericsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasGenericsFlag(Boolean value) {
        this.hasGenericsFlag = value;
    }

    /**
     * Gets the value of the headerCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderCurrencyCode() {
        return headerCurrencyCode;
    }

    /**
     * Sets the value of the headerCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderCurrencyCode(String value) {
        this.headerCurrencyCode = value;
    }

    /**
     * Gets the value of the headerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeaderDiscount() {
        return headerDiscount;
    }

    /**
     * Sets the value of the headerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeaderDiscount(BigDecimal value) {
        this.headerDiscount = value;
    }

    /**
     * Gets the value of the headerDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeaderDiscountAmount() {
        return headerDiscountAmount;
    }

    /**
     * Sets the value of the headerDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeaderDiscountAmount(BigDecimal value) {
        this.headerDiscountAmount = value;
    }

    /**
     * Gets the value of the headerExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHeaderExchangeDate() {
        return headerExchangeDate;
    }

    /**
     * Sets the value of the headerExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHeaderExchangeDate(XMLGregorianCalendar value) {
        this.headerExchangeDate = value;
    }

    /**
     * Gets the value of the headerRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderRevision() {
        return headerRevision;
    }

    /**
     * Sets the value of the headerRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderRevision(String value) {
        this.headerRevision = value;
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
     * Gets the value of the holdReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldReason() {
        return holdReason;
    }

    /**
     * Sets the value of the holdReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldReason(String value) {
        this.holdReason = value;
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
     * Gets the value of the incentiveStatusChangedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncentiveStatusChangedFlg() {
        return incentiveStatusChangedFlg;
    }

    /**
     * Sets the value of the incentiveStatusChangedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncentiveStatusChangedFlg(Boolean value) {
        this.incentiveStatusChangedFlg = value;
    }

    /**
     * Gets the value of the inclusiveEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveEligibilityFlag() {
        return inclusiveEligibilityFlag;
    }

    /**
     * Sets the value of the inclusiveEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveEligibilityFlag(Boolean value) {
        this.inclusiveEligibilityFlag = value;
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
     * Gets the value of the invoicedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Sets the value of the invoicedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoicedQuantity(BigDecimal value) {
        this.invoicedQuantity = value;
    }

    /**
     * Gets the value of the isExpanded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExpanded() {
        return isExpanded;
    }

    /**
     * Sets the value of the isExpanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExpanded(Boolean value) {
        this.isExpanded = value;
    }

    /**
     * Gets the value of the isComplexProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProduct() {
        return isComplexProduct;
    }

    /**
     * Sets the value of the isComplexProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProduct(Boolean value) {
        this.isComplexProduct = value;
    }

    /**
     * Gets the value of the isComplexProductBundleComponent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductBundleComponent() {
        return isComplexProductBundleComponent;
    }

    /**
     * Sets the value of the isComplexProductBundleComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductBundleComponent(Boolean value) {
        this.isComplexProductBundleComponent = value;
    }

    /**
     * Gets the value of the isComplexProductComponent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductComponent() {
        return isComplexProductComponent;
    }

    /**
     * Sets the value of the isComplexProductComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductComponent(Boolean value) {
        this.isComplexProductComponent = value;
    }

    /**
     * Gets the value of the isComplexProductNotBundle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductNotBundle() {
        return isComplexProductNotBundle;
    }

    /**
     * Sets the value of the isComplexProductNotBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductNotBundle(Boolean value) {
        this.isComplexProductNotBundle = value;
    }

    /**
     * Gets the value of the isComplexProductNotBundleRoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductNotBundleRoot() {
        return isComplexProductNotBundleRoot;
    }

    /**
     * Sets the value of the isComplexProductNotBundleRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductNotBundleRoot(Boolean value) {
        this.isComplexProductNotBundleRoot = value;
    }

    /**
     * Gets the value of the isComplexProductORBundleComponent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductORBundleComponent() {
        return isComplexProductORBundleComponent;
    }

    /**
     * Sets the value of the isComplexProductORBundleComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductORBundleComponent(Boolean value) {
        this.isComplexProductORBundleComponent = value;
    }

    /**
     * Gets the value of the isComplexProductRoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductRoot() {
        return isComplexProductRoot;
    }

    /**
     * Sets the value of the isComplexProductRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductRoot(Boolean value) {
        this.isComplexProductRoot = value;
    }

    /**
     * Gets the value of the isPackageProductComponent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPackageProductComponent() {
        return isPackageProductComponent;
    }

    /**
     * Sets the value of the isPackageProductComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPackageProductComponent(Boolean value) {
        this.isPackageProductComponent = value;
    }

    /**
     * Gets the value of the isRootItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRootItem() {
        return isRootItem;
    }

    /**
     * Sets the value of the isRootItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRootItem(Boolean value) {
        this.isRootItem = value;
    }

    /**
     * Gets the value of the itemDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDisplayName() {
        return itemDisplayName;
    }

    /**
     * Sets the value of the itemDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDisplayName(String value) {
        this.itemDisplayName = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemPrice(BigDecimal value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemPriceDisplay() {
        return itemPriceDisplay;
    }

    /**
     * Sets the value of the itemPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemPriceDisplay(BigDecimal value) {
        this.itemPriceDisplay = value;
    }

    /**
     * Gets the value of the itemPriceList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPriceList() {
        return itemPriceList;
    }

    /**
     * Sets the value of the itemPriceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPriceList(String value) {
        this.itemPriceList = value;
    }

    /**
     * Gets the value of the itemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPriceListId() {
        return itemPriceListId;
    }

    /**
     * Sets the value of the itemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPriceListId(String value) {
        this.itemPriceListId = value;
    }

    /**
     * Gets the value of the itemPriceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPriceListIntegrationId() {
        return itemPriceListIntegrationId;
    }

    /**
     * Sets the value of the itemPriceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPriceListIntegrationId(String value) {
        this.itemPriceListIntegrationId = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the itemTypeLanguageIndependent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeLanguageIndependent() {
        return itemTypeLanguageIndependent;
    }

    /**
     * Sets the value of the itemTypeLanguageIndependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeLanguageIndependent(String value) {
        this.itemTypeLanguageIndependent = value;
    }

    /**
     * Gets the value of the itemIsProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemIsProduct() {
        return itemIsProduct;
    }

    /**
     * Sets the value of the itemIsProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemIsProduct(Boolean value) {
        this.itemIsProduct = value;
    }

    /**
     * Gets the value of the labeledProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLabeledProductFlag() {
        return labeledProductFlag;
    }

    /**
     * Sets the value of the labeledProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLabeledProductFlag(Boolean value) {
        this.labeledProductFlag = value;
    }

    /**
     * Gets the value of the lateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLateFlag() {
        return lateFlag;
    }

    /**
     * Sets the value of the lateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateFlag(Boolean value) {
        this.lateFlag = value;
    }

    /**
     * Gets the value of the lineItemNetTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineItemNetTotal() {
        return lineItemNetTotal;
    }

    /**
     * Sets the value of the lineItemNetTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineItemNetTotal(BigDecimal value) {
        this.lineItemNetTotal = value;
    }

    /**
     * Gets the value of the lineNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber2() {
        return lineNumber2;
    }

    /**
     * Sets the value of the lineNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber2(Integer value) {
        this.lineNumber2 = value;
    }

    /**
     * Gets the value of the lineNumber22 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineNumber22() {
        return lineNumber22;
    }

    /**
     * Sets the value of the lineNumber22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineNumber22(BigDecimal value) {
        this.lineNumber22 = value;
    }

    /**
     * Gets the value of the lineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    /**
     * Sets the value of the lineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineTotal(BigDecimal value) {
        this.lineTotal = value;
    }

    /**
     * Gets the value of the lineTotalDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineTotalDisplay() {
        return lineTotalDisplay;
    }

    /**
     * Sets the value of the lineTotalDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineTotalDisplay(BigDecimal value) {
        this.lineTotalDisplay = value;
    }

    /**
     * Gets the value of the lineTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineTotalinHeaderCurrency() {
        return lineTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the lineTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineTotalinHeaderCurrency(BigDecimal value) {
        this.lineTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the loanerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoanerFlag() {
        return loanerFlag;
    }

    /**
     * Sets the value of the loanerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoanerFlag(Boolean value) {
        this.loanerFlag = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRCCxTotal(BigDecimal value) {
        this.mrcCxTotal = value;
    }

    /**
     * Gets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRCCxTotalinHeaderCurrency() {
        return mrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRCCxTotalinHeaderCurrency(BigDecimal value) {
        this.mrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPrice(BigDecimal value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumQuantity(BigDecimal value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPrice(BigDecimal value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the minimumLot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLot() {
        return minimumLot;
    }

    /**
     * Sets the value of the minimumLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLot(BigDecimal value) {
        this.minimumLot = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumQuantity(BigDecimal value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the notWriteInProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNOTWriteInProductFlag() {
        return notWriteInProductFlag;
    }

    /**
     * Sets the value of the notWriteInProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNOTWriteInProductFlag(Boolean value) {
        this.notWriteInProductFlag = value;
    }

    /**
     * Gets the value of the nrcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCAmount() {
        return nrcAmount;
    }

    /**
     * Sets the value of the nrcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCAmount(BigDecimal value) {
        this.nrcAmount = value;
    }

    /**
     * Gets the value of the nrcCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCCurrencyCode() {
        return nrcCurrencyCode;
    }

    /**
     * Sets the value of the nrcCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCCurrencyCode(String value) {
        this.nrcCurrencyCode = value;
    }

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCCxTotal(BigDecimal value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCCxTotalinHeaderCurrency() {
        return nrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCCxTotalinHeaderCurrency(BigDecimal value) {
        this.nrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the nrcExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNRCExchangeDate() {
        return nrcExchangeDate;
    }

    /**
     * Sets the value of the nrcExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNRCExchangeDate(XMLGregorianCalendar value) {
        this.nrcExchangeDate = value;
    }

    /**
     * Gets the value of the nrcNumberofBills property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNRCNumberofBills() {
        return nrcNumberofBills;
    }

    /**
     * Sets the value of the nrcNumberofBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNRCNumberofBills(Integer value) {
        this.nrcNumberofBills = value;
    }

    /**
     * Gets the value of the nrcPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCPlanId() {
        return nrcPlanId;
    }

    /**
     * Sets the value of the nrcPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCPlanId(String value) {
        this.nrcPlanId = value;
    }

    /**
     * Gets the value of the nrcPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCPlanName() {
        return nrcPlanName;
    }

    /**
     * Sets the value of the nrcPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCPlanName(String value) {
        this.nrcPlanName = value;
    }

    /**
     * Gets the value of the nrcScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCScheduleId() {
        return nrcScheduleId;
    }

    /**
     * Sets the value of the nrcScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCScheduleId(String value) {
        this.nrcScheduleId = value;
    }

    /**
     * Gets the value of the nrcScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCScheduleName() {
        return nrcScheduleName;
    }

    /**
     * Sets the value of the nrcScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCScheduleName(String value) {
        this.nrcScheduleName = value;
    }

    /**
     * Gets the value of the nrcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNRCStartDate() {
        return nrcStartDate;
    }

    /**
     * Sets the value of the nrcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNRCStartDate(XMLGregorianCalendar value) {
        this.nrcStartDate = value;
    }

    /**
     * Gets the value of the needRefreshBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedRefreshBasePrice() {
        return needRefreshBasePrice;
    }

    /**
     * Sets the value of the needRefreshBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedRefreshBasePrice(Boolean value) {
        this.needRefreshBasePrice = value;
    }

    /**
     * Gets the value of the netDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetDiscountAmount() {
        return netDiscountAmount;
    }

    /**
     * Sets the value of the netDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetDiscountAmount(BigDecimal value) {
        this.netDiscountAmount = value;
    }

    /**
     * Gets the value of the netDiscountAmountDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetDiscountAmountDisplay() {
        return netDiscountAmountDisplay;
    }

    /**
     * Sets the value of the netDiscountAmountDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetDiscountAmountDisplay(BigDecimal value) {
        this.netDiscountAmountDisplay = value;
    }

    /**
     * Gets the value of the netDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetDiscountPercent() {
        return netDiscountPercent;
    }

    /**
     * Sets the value of the netDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetDiscountPercent(BigDecimal value) {
        this.netDiscountPercent = value;
    }

    /**
     * Gets the value of the netDiscountPercentDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetDiscountPercentDisplay() {
        return netDiscountPercentDisplay;
    }

    /**
     * Sets the value of the netDiscountPercentDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetDiscountPercentDisplay(BigDecimal value) {
        this.netDiscountPercentDisplay = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPrice(BigDecimal value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the netPriceCalc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPriceCalc() {
        return netPriceCalc;
    }

    /**
     * Sets the value of the netPriceCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPriceCalc(BigDecimal value) {
        this.netPriceCalc = value;
    }

    /**
     * Gets the value of the netType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetType() {
        return netType;
    }

    /**
     * Sets the value of the netType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetType(String value) {
        this.netType = value;
    }

    /**
     * Gets the value of the networkElementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkElementType() {
        return networkElementType;
    }

    /**
     * Sets the value of the networkElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkElementType(String value) {
        this.networkElementType = value;
    }

    /**
     * Gets the value of the networkReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkReadOnlyFlag() {
        return networkReadOnlyFlag;
    }

    /**
     * Sets the value of the networkReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkReadOnlyFlag(String value) {
        this.networkReadOnlyFlag = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the nodeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeFlag() {
        return nodeFlag;
    }

    /**
     * Sets the value of the nodeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeFlag(String value) {
        this.nodeFlag = value;
    }

    /**
     * Gets the value of the nodeReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeReadOnlyFlag() {
        return nodeReadOnlyFlag;
    }

    /**
     * Sets the value of the nodeReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeReadOnlyFlag(String value) {
        this.nodeReadOnlyFlag = value;
    }

    /**
     * Gets the value of the nonDiscountedLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonDiscountedLineTotal() {
        return nonDiscountedLineTotal;
    }

    /**
     * Sets the value of the nonDiscountedLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonDiscountedLineTotal(BigDecimal value) {
        this.nonDiscountedLineTotal = value;
    }

    /**
     * Gets the value of the nonDiscountedLineTotalDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonDiscountedLineTotalDisplay() {
        return nonDiscountedLineTotalDisplay;
    }

    /**
     * Sets the value of the nonDiscountedLineTotalDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonDiscountedLineTotalDisplay(BigDecimal value) {
        this.nonDiscountedLineTotalDisplay = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the noteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoteFlag() {
        return noteFlag;
    }

    /**
     * Sets the value of the noteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoteFlag(Boolean value) {
        this.noteFlag = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

    /**
     * Gets the value of the orderAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcctId() {
        return orderAcctId;
    }

    /**
     * Sets the value of the orderAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcctId(String value) {
        this.orderAcctId = value;
    }

    /**
     * Gets the value of the orderActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderActiveFlag() {
        return orderActiveFlag;
    }

    /**
     * Sets the value of the orderActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderActiveFlag(Boolean value) {
        this.orderActiveFlag = value;
    }

    /**
     * Gets the value of the orderCPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCPN() {
        return orderCPN;
    }

    /**
     * Sets the value of the orderCPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCPN(String value) {
        this.orderCPN = value;
    }

    /**
     * Gets the value of the orderFreightTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderFreightTermsCode() {
        return orderFreightTermsCode;
    }

    /**
     * Sets the value of the orderFreightTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderFreightTermsCode(String value) {
        this.orderFreightTermsCode = value;
    }

    /**
     * Gets the value of the orderHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderId() {
        return orderHeaderId;
    }

    /**
     * Sets the value of the orderHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderId(String value) {
        this.orderHeaderId = value;
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
     * Gets the value of the orderQuoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderQuoteId() {
        return orderQuoteId;
    }

    /**
     * Sets the value of the orderQuoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderQuoteId(String value) {
        this.orderQuoteId = value;
    }

    /**
     * Gets the value of the orderSourceInventoryLocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSourceInventoryLocId() {
        return orderSourceInventoryLocId;
    }

    /**
     * Sets the value of the orderSourceInventoryLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSourceInventoryLocId(String value) {
        this.orderSourceInventoryLocId = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the orderType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType2() {
        return orderType2;
    }

    /**
     * Sets the value of the orderType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType2(String value) {
        this.orderType2 = value;
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
     * Gets the value of the organization22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization22() {
        return organization22;
    }

    /**
     * Sets the value of the organization22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization22(String value) {
        this.organization22 = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalPrice(BigDecimal value) {
        this.originalPrice = value;
    }

    /**
     * Gets the value of the originalQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalQty() {
        return originalQty;
    }

    /**
     * Sets the value of the originalQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalQty(BigDecimal value) {
        this.originalQty = value;
    }

    /**
     * Gets the value of the outlineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineNumber() {
        return outlineNumber;
    }

    /**
     * Sets the value of the outlineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlineNumber(String value) {
        this.outlineNumber = value;
    }

    /**
     * Gets the value of the ownerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAccountId() {
        return ownerAccountId;
    }

    /**
     * Sets the value of the ownerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAccountId(String value) {
        this.ownerAccountId = value;
    }

    /**
     * Gets the value of the pacOrderAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACOrderAccountId() {
        return pacOrderAccountId;
    }

    /**
     * Sets the value of the pacOrderAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACOrderAccountId(String value) {
        this.pacOrderAccountId = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the packageNameReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackageNameReadOnlyFlag() {
        return packageNameReadOnlyFlag;
    }

    /**
     * Sets the value of the packageNameReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackageNameReadOnlyFlag(Boolean value) {
        this.packageNameReadOnlyFlag = value;
    }

    /**
     * Gets the value of the parentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountId() {
        return parentAccountId;
    }

    /**
     * Sets the value of the parentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountId(String value) {
        this.parentAccountId = value;
    }

    /**
     * Gets the value of the parentCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCurrencyCode() {
        return parentCurrencyCode;
    }

    /**
     * Sets the value of the parentCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCurrencyCode(String value) {
        this.parentCurrencyCode = value;
    }

    /**
     * Gets the value of the parentExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParentExchangeDate() {
        return parentExchangeDate;
    }

    /**
     * Sets the value of the parentExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParentExchangeDate(XMLGregorianCalendar value) {
        this.parentExchangeDate = value;
    }

    /**
     * Gets the value of the parentOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderItemId() {
        return parentOrderItemId;
    }

    /**
     * Sets the value of the parentOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderItemId(String value) {
        this.parentOrderItemId = value;
    }

    /**
     * Gets the value of the parentPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPackageName() {
        return parentPackageName;
    }

    /**
     * Sets the value of the parentPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPackageName(String value) {
        this.parentPackageName = value;
    }

    /**
     * Gets the value of the parentProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProductId() {
        return parentProductId;
    }

    /**
     * Sets the value of the parentProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProductId(String value) {
        this.parentProductId = value;
    }

    /**
     * Gets the value of the parentTaxSubcomponentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentTaxSubcomponentFlag() {
        return parentTaxSubcomponentFlag;
    }

    /**
     * Sets the value of the parentTaxSubcomponentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentTaxSubcomponentFlag(Boolean value) {
        this.parentTaxSubcomponentFlag = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
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
     * Gets the value of the postPickCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostPickCD() {
        return postPickCD;
    }

    /**
     * Sets the value of the postPickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostPickCD(String value) {
        this.postPickCD = value;
    }

    /**
     * Gets the value of the prePickCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePickCD() {
        return prePickCD;
    }

    /**
     * Sets the value of the prePickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePickCD(String value) {
        this.prePickCD = value;
    }

    /**
     * Gets the value of the previousAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousAssetStatus() {
        return previousAssetStatus;
    }

    /**
     * Sets the value of the previousAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousAssetStatus(String value) {
        this.previousAssetStatus = value;
    }

    /**
     * Gets the value of the previousBillingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousBillingAccount() {
        return previousBillingAccount;
    }

    /**
     * Sets the value of the previousBillingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousBillingAccount(String value) {
        this.previousBillingAccount = value;
    }

    /**
     * Gets the value of the previousBillingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousBillingAccountId() {
        return previousBillingAccountId;
    }

    /**
     * Sets the value of the previousBillingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousBillingAccountId(String value) {
        this.previousBillingAccountId = value;
    }

    /**
     * Gets the value of the previousSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSerialNumber() {
        return previousSerialNumber;
    }

    /**
     * Sets the value of the previousSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSerialNumber(String value) {
        this.previousSerialNumber = value;
    }

    /**
     * Gets the value of the previousServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousServiceAccount() {
        return previousServiceAccount;
    }

    /**
     * Sets the value of the previousServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousServiceAccount(String value) {
        this.previousServiceAccount = value;
    }

    /**
     * Gets the value of the previousServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousServiceAccountId() {
        return previousServiceAccountId;
    }

    /**
     * Sets the value of the previousServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousServiceAccountId(String value) {
        this.previousServiceAccountId = value;
    }

    /**
     * Gets the value of the previousServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousServiceId() {
        return previousServiceId;
    }

    /**
     * Sets the value of the previousServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousServiceId(String value) {
        this.previousServiceId = value;
    }

    /**
     * Gets the value of the previousUsageAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousUsageAssetId() {
        return previousUsageAssetId;
    }

    /**
     * Sets the value of the previousUsageAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousUsageAssetId(String value) {
        this.previousUsageAssetId = value;
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
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the pricingAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingAdjustmentAmount() {
        return pricingAdjustmentAmount;
    }

    /**
     * Sets the value of the pricingAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingAdjustmentAmount(BigDecimal value) {
        this.pricingAdjustmentAmount = value;
    }

    /**
     * Gets the value of the pricingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingComments() {
        return pricingComments;
    }

    /**
     * Sets the value of the pricingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingComments(String value) {
        this.pricingComments = value;
    }

    /**
     * Gets the value of the pricingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingQuantity() {
        return pricingQuantity;
    }

    /**
     * Sets the value of the pricingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingQuantity(BigDecimal value) {
        this.pricingQuantity = value;
    }

    /**
     * Gets the value of the primaryAssetChildId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAssetChildId() {
        return primaryAssetChildId;
    }

    /**
     * Sets the value of the primaryAssetChildId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAssetChildId(String value) {
        this.primaryAssetChildId = value;
    }

    /**
     * Gets the value of the processedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessedFlag() {
        return processedFlag;
    }

    /**
     * Sets the value of the processedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessedFlag(Boolean value) {
        this.processedFlag = value;
    }

    /**
     * Gets the value of the prodItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdItemId() {
        return prodItemId;
    }

    /**
     * Sets the value of the prodItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdItemId(String value) {
        this.prodItemId = value;
    }

    /**
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromId(String value) {
        this.prodPromId = value;
    }

    /**
     * Gets the value of the prodPromInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromInstanceId() {
        return prodPromInstanceId;
    }

    /**
     * Sets the value of the prodPromInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromInstanceId(String value) {
        this.prodPromInstanceId = value;
    }

    /**
     * Gets the value of the prodPromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromName() {
        return prodPromName;
    }

    /**
     * Sets the value of the prodPromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromName(String value) {
        this.prodPromName = value;
    }

    /**
     * Gets the value of the prodPromReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProdPromReadOnlyFlag() {
        return prodPromReadOnlyFlag;
    }

    /**
     * Sets the value of the prodPromReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProdPromReadOnlyFlag(Boolean value) {
        this.prodPromReadOnlyFlag = value;
    }

    /**
     * Gets the value of the prodPromRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromRuleId() {
        return prodPromRuleId;
    }

    /**
     * Sets the value of the prodPromRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromRuleId(String value) {
        this.prodPromRuleId = value;
    }

    /**
     * Gets the value of the prodPromSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromSourceId() {
        return prodPromSourceId;
    }

    /**
     * Sets the value of the prodPromSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromSourceId(String value) {
        this.prodPromSourceId = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the productDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDefTypeCode() {
        return productDefTypeCode;
    }

    /**
     * Sets the value of the productDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDefTypeCode(String value) {
        this.productDefTypeCode = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIntegrationId() {
        return productIntegrationId;
    }

    /**
     * Sets the value of the productIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIntegrationId(String value) {
        this.productIntegrationId = value;
    }

    /**
     * Gets the value of the productPortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPortId() {
        return productPortId;
    }

    /**
     * Sets the value of the productPortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPortId(String value) {
        this.productPortId = value;
    }

    /**
     * Gets the value of the productPrimaryProductLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPrimaryProductLineId() {
        return productPrimaryProductLineId;
    }

    /**
     * Sets the value of the productPrimaryProductLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPrimaryProductLineId(String value) {
        this.productPrimaryProductLineId = value;
    }

    /**
     * Gets the value of the productReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductReadOnlyFlag() {
        return productReadOnlyFlag;
    }

    /**
     * Sets the value of the productReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductReadOnlyFlag(Boolean value) {
        this.productReadOnlyFlag = value;
    }

    /**
     * Gets the value of the productStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatusCode() {
        return productStatusCode;
    }

    /**
     * Sets the value of the productStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatusCode(String value) {
        this.productStatusCode = value;
    }

    /**
     * Gets the value of the productTaxableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTaxableFlag() {
        return productTaxableFlag;
    }

    /**
     * Sets the value of the productTaxableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTaxableFlag(Boolean value) {
        this.productTaxableFlag = value;
    }

    /**
     * Gets the value of the productThumbnailImageFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductThumbnailImageFileExt() {
        return productThumbnailImageFileExt;
    }

    /**
     * Sets the value of the productThumbnailImageFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductThumbnailImageFileExt(String value) {
        this.productThumbnailImageFileExt = value;
    }

    /**
     * Gets the value of the productThumbnailImageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductThumbnailImageFileName() {
        return productThumbnailImageFileName;
    }

    /**
     * Sets the value of the productThumbnailImageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductThumbnailImageFileName(String value) {
        this.productThumbnailImageFileName = value;
    }

    /**
     * Gets the value of the productThumbnailImageFileRev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductThumbnailImageFileRev() {
        return productThumbnailImageFileRev;
    }

    /**
     * Sets the value of the productThumbnailImageFileRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductThumbnailImageFileRev(String value) {
        this.productThumbnailImageFileRev = value;
    }

    /**
     * Gets the value of the productThumbnailImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductThumbnailImageId() {
        return productThumbnailImageId;
    }

    /**
     * Sets the value of the productThumbnailImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductThumbnailImageId(String value) {
        this.productThumbnailImageId = value;
    }

    /**
     * Gets the value of the productTypeCalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCalc() {
        return productTypeCalc;
    }

    /**
     * Sets the value of the productTypeCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCalc(String value) {
        this.productTypeCalc = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the productUnitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductUnitofMeasure() {
        return productUnitofMeasure;
    }

    /**
     * Sets the value of the productUnitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductUnitofMeasure(String value) {
        this.productUnitofMeasure = value;
    }

    /**
     * Gets the value of the productXAClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductXAClassId() {
        return productXAClassId;
    }

    /**
     * Sets the value of the productXAClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductXAClassId(String value) {
        this.productXAClassId = value;
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
     * Gets the value of the promotionItemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionItemFlag() {
        return promotionItemFlag;
    }

    /**
     * Sets the value of the promotionItemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionItemFlag(Boolean value) {
        this.promotionItemFlag = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityReadOnlyFlag() {
        return quantityReadOnlyFlag;
    }

    /**
     * Sets the value of the quantityReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityReadOnlyFlag(Boolean value) {
        this.quantityReadOnlyFlag = value;
    }

    /**
     * Gets the value of the quantityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityRequested() {
        return quantityRequested;
    }

    /**
     * Sets the value of the quantityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityRequested(Integer value) {
        this.quantityRequested = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityShipped(Integer value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the quantityToInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityToInvoice() {
        return quantityToInvoice;
    }

    /**
     * Sets the value of the quantityToInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityToInvoice(BigDecimal value) {
        this.quantityToInvoice = value;
    }

    /**
     * Gets the value of the quoteId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId2() {
        return quoteId2;
    }

    /**
     * Sets the value of the quoteId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId2(String value) {
        this.quoteId2 = value;
    }

    /**
     * Gets the value of the quoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteItemId() {
        return quoteItemId;
    }

    /**
     * Sets the value of the quoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteItemId(String value) {
        this.quoteItemId = value;
    }

    /**
     * Gets the value of the rcAdjustAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRCAdjustAmount() {
        return rcAdjustAmount;
    }

    /**
     * Sets the value of the rcAdjustAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRCAdjustAmount(BigDecimal value) {
        this.rcAdjustAmount = value;
    }

    /**
     * Gets the value of the rcAdjustUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCAdjustUM() {
        return rcAdjustUM;
    }

    /**
     * Sets the value of the rcAdjustUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCAdjustUM(String value) {
        this.rcAdjustUM = value;
    }

    /**
     * Gets the value of the rcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRCAmount() {
        return rcAmount;
    }

    /**
     * Sets the value of the rcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRCAmount(BigDecimal value) {
        this.rcAmount = value;
    }

    /**
     * Gets the value of the rcCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCCurrencyCode() {
        return rcCurrencyCode;
    }

    /**
     * Sets the value of the rcCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCCurrencyCode(String value) {
        this.rcCurrencyCode = value;
    }

    /**
     * Gets the value of the rcExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRCExchangeDate() {
        return rcExchangeDate;
    }

    /**
     * Sets the value of the rcExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRCExchangeDate(XMLGregorianCalendar value) {
        this.rcExchangeDate = value;
    }

    /**
     * Gets the value of the rcScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCScheduleId() {
        return rcScheduleId;
    }

    /**
     * Sets the value of the rcScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCScheduleId(String value) {
        this.rcScheduleId = value;
    }

    /**
     * Gets the value of the rcScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCScheduleName() {
        return rcScheduleName;
    }

    /**
     * Sets the value of the rcScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCScheduleName(String value) {
        this.rcScheduleName = value;
    }

    /**
     * Gets the value of the rcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRCStartDate() {
        return rcStartDate;
    }

    /**
     * Sets the value of the rcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRCStartDate(XMLGregorianCalendar value) {
        this.rcStartDate = value;
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
     * Gets the value of the returnToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddressId() {
        return returnToAddressId;
    }

    /**
     * Sets the value of the returnToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddressId(String value) {
        this.returnToAddressId = value;
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
     * Gets the value of the revenueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueType() {
        return revenueType;
    }

    /**
     * Sets the value of the revenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueType(String value) {
        this.revenueType = value;
    }

    /**
     * Gets the value of the revisedLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisedLineItemId() {
        return revisedLineItemId;
    }

    /**
     * Sets the value of the revisedLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisedLineItemId(String value) {
        this.revisedLineItemId = value;
    }

    /**
     * Gets the value of the rollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRollupAmount() {
        return rollupAmount;
    }

    /**
     * Sets the value of the rollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRollupAmount(BigDecimal value) {
        this.rollupAmount = value;
    }

    /**
     * Gets the value of the rollupItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRollupItemPrice() {
        return rollupItemPrice;
    }

    /**
     * Sets the value of the rollupItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRollupItemPrice(BigDecimal value) {
        this.rollupItemPrice = value;
    }

    /**
     * Gets the value of the rollupItemPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRollupItemPriceDisplay() {
        return rollupItemPriceDisplay;
    }

    /**
     * Sets the value of the rollupItemPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRollupItemPriceDisplay(BigDecimal value) {
        this.rollupItemPriceDisplay = value;
    }

    /**
     * Gets the value of the rootActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootActionCode() {
        return rootActionCode;
    }

    /**
     * Sets the value of the rootActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootActionCode(String value) {
        this.rootActionCode = value;
    }

    /**
     * Gets the value of the rootAssetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootAssetIntegrationId() {
        return rootAssetIntegrationId;
    }

    /**
     * Sets the value of the rootAssetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootAssetIntegrationId(String value) {
        this.rootAssetIntegrationId = value;
    }

    /**
     * Gets the value of the rootBundleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRootBundleFlag() {
        return rootBundleFlag;
    }

    /**
     * Sets the value of the rootBundleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRootBundleFlag(Boolean value) {
        this.rootBundleFlag = value;
    }

    /**
     * Gets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCfgLatestReleasedFlag() {
        return rootCfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCfgLatestReleasedFlag(String value) {
        this.rootCfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the rootCfgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCfgType() {
        return rootCfgType;
    }

    /**
     * Sets the value of the rootCfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCfgType(String value) {
        this.rootCfgType = value;
    }

    /**
     * Gets the value of the rootItemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootItemPriceListId() {
        return rootItemPriceListId;
    }

    /**
     * Sets the value of the rootItemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootItemPriceListId(String value) {
        this.rootItemPriceListId = value;
    }

    /**
     * Gets the value of the rootLineItemDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRootLineItemDueDate() {
        return rootLineItemDueDate;
    }

    /**
     * Sets the value of the rootLineItemDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRootLineItemDueDate(XMLGregorianCalendar value) {
        this.rootLineItemDueDate = value;
    }

    /**
     * Gets the value of the rootOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrderItemId() {
        return rootOrderItemId;
    }

    /**
     * Sets the value of the rootOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrderItemId(String value) {
        this.rootOrderItemId = value;
    }

    /**
     * Gets the value of the rootPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootPackageName() {
        return rootPackageName;
    }

    /**
     * Sets the value of the rootPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootPackageName(String value) {
        this.rootPackageName = value;
    }

    /**
     * Gets the value of the rootProductDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProductDefTypeCode() {
        return rootProductDefTypeCode;
    }

    /**
     * Sets the value of the rootProductDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootProductDefTypeCode(String value) {
        this.rootProductDefTypeCode = value;
    }

    /**
     * Gets the value of the rootProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProductId() {
        return rootProductId;
    }

    /**
     * Sets the value of the rootProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootProductId(String value) {
        this.rootProductId = value;
    }

    /**
     * Gets the value of the rootProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProductName() {
        return rootProductName;
    }

    /**
     * Sets the value of the rootProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootProductName(String value) {
        this.rootProductName = value;
    }

    /**
     * Gets the value of the rootProductTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProductTypeCode() {
        return rootProductTypeCode;
    }

    /**
     * Sets the value of the rootProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootProductTypeCode(String value) {
        this.rootProductTypeCode = value;
    }

    /**
     * Gets the value of the sap4XFreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAP4XFreight() {
        return sap4XFreight;
    }

    /**
     * Sets the value of the sap4XFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAP4XFreight(BigDecimal value) {
        this.sap4XFreight = value;
    }

    /**
     * Gets the value of the sap4XNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAP4XNetPrice() {
        return sap4XNetPrice;
    }

    /**
     * Sets the value of the sap4XNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAP4XNetPrice(BigDecimal value) {
        this.sap4XNetPrice = value;
    }

    /**
     * Gets the value of the sap4XPlant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP4XPlant() {
        return sap4XPlant;
    }

    /**
     * Sets the value of the sap4XPlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP4XPlant(String value) {
        this.sap4XPlant = value;
    }

    /**
     * Gets the value of the sap4XTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAP4XTax() {
        return sap4XTax;
    }

    /**
     * Sets the value of the sap4XTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAP4XTax(BigDecimal value) {
        this.sap4XTax = value;
    }

    /**
     * Gets the value of the sap4XUnitNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP4XUnitNetPrice() {
        return sap4XUnitNetPrice;
    }

    /**
     * Sets the value of the sap4XUnitNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP4XUnitNetPrice(String value) {
        this.sap4XUnitNetPrice = value;
    }

    /**
     * Gets the value of the sapConditionPricingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSAPConditionPricingUnit() {
        return sapConditionPricingUnit;
    }

    /**
     * Sets the value of the sapConditionPricingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSAPConditionPricingUnit(Integer value) {
        this.sapConditionPricingUnit = value;
    }

    /**
     * Gets the value of the sapConditionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPConditionUnit() {
        return sapConditionUnit;
    }

    /**
     * Sets the value of the sapConditionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPConditionUnit(String value) {
        this.sapConditionUnit = value;
    }

    /**
     * Gets the value of the sapCumulativeConfirmedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAPCumulativeConfirmedQty() {
        return sapCumulativeConfirmedQty;
    }

    /**
     * Sets the value of the sapCumulativeConfirmedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAPCumulativeConfirmedQty(BigDecimal value) {
        this.sapCumulativeConfirmedQty = value;
    }

    /**
     * Gets the value of the sapCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPCurrency() {
        return sapCurrency;
    }

    /**
     * Sets the value of the sapCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPCurrency(String value) {
        this.sapCurrency = value;
    }

    /**
     * Gets the value of the sapDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPDeliveryStatus() {
        return sapDeliveryStatus;
    }

    /**
     * Sets the value of the sapDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPDeliveryStatus(String value) {
        this.sapDeliveryStatus = value;
    }

    /**
     * Gets the value of the sapDeliveryStatusWide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPDeliveryStatusWide() {
        return sapDeliveryStatusWide;
    }

    /**
     * Sets the value of the sapDeliveryStatusWide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPDeliveryStatusWide(String value) {
        this.sapDeliveryStatusWide = value;
    }

    /**
     * Gets the value of the sapInputId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPInputId() {
        return sapInputId;
    }

    /**
     * Sets the value of the sapInputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPInputId(String value) {
        this.sapInputId = value;
    }

    /**
     * Gets the value of the sapItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSAPItemNumber() {
        return sapItemNumber;
    }

    /**
     * Sets the value of the sapItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSAPItemNumber(Integer value) {
        this.sapItemNumber = value;
    }

    /**
     * Gets the value of the sapItemShortText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPItemShortText() {
        return sapItemShortText;
    }

    /**
     * Sets the value of the sapItemShortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPItemShortText(String value) {
        this.sapItemShortText = value;
    }

    /**
     * Gets the value of the sapMaterialPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPMaterialPart() {
        return sapMaterialPart;
    }

    /**
     * Sets the value of the sapMaterialPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPMaterialPart(String value) {
        this.sapMaterialPart = value;
    }

    /**
     * Gets the value of the sapNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAPNetPrice() {
        return sapNetPrice;
    }

    /**
     * Sets the value of the sapNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAPNetPrice(BigDecimal value) {
        this.sapNetPrice = value;
    }

    /**
     * Gets the value of the sapNetValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAPNetValue() {
        return sapNetValue;
    }

    /**
     * Sets the value of the sapNetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAPNetValue(BigDecimal value) {
        this.sapNetValue = value;
    }

    /**
     * Gets the value of the sapParentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPParentId() {
        return sapParentId;
    }

    /**
     * Sets the value of the sapParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPParentId(String value) {
        this.sapParentId = value;
    }

    /**
     * Gets the value of the sapReferenceQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAPReferenceQty() {
        return sapReferenceQty;
    }

    /**
     * Sets the value of the sapReferenceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAPReferenceQty(BigDecimal value) {
        this.sapReferenceQty = value;
    }

    /**
     * Gets the value of the sapRequestedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAPRequestedQty() {
        return sapRequestedQty;
    }

    /**
     * Sets the value of the sapRequestedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAPRequestedQty(BigDecimal value) {
        this.sapRequestedQty = value;
    }

    /**
     * Gets the value of the sapRequestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSAPRequestedShipDate() {
        return sapRequestedShipDate;
    }

    /**
     * Sets the value of the sapRequestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSAPRequestedShipDate(XMLGregorianCalendar value) {
        this.sapRequestedShipDate = value;
    }

    /**
     * Gets the value of the sapSalesUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPSalesUnit() {
        return sapSalesUnit;
    }

    /**
     * Sets the value of the sapSalesUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPSalesUnit(String value) {
        this.sapSalesUnit = value;
    }

    /**
     * Gets the value of the salesRepPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepPosition() {
        return salesRepPosition;
    }

    /**
     * Sets the value of the salesRepPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepPosition(String value) {
        this.salesRepPosition = value;
    }

    /**
     * Gets the value of the salesRepPostnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepPostnId() {
        return salesRepPostnId;
    }

    /**
     * Sets the value of the salesRepPostnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepPostnId(String value) {
        this.salesRepPostnId = value;
    }

    /**
     * Gets the value of the salesServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesServiceFlag() {
        return salesServiceFlag;
    }

    /**
     * Sets the value of the salesServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesServiceFlag(Boolean value) {
        this.salesServiceFlag = value;
    }

    /**
     * Gets the value of the salesUnitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnitofMeasure() {
        return salesUnitofMeasure;
    }

    /**
     * Sets the value of the salesUnitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnitofMeasure(String value) {
        this.salesUnitofMeasure = value;
    }

    /**
     * Gets the value of the scheduledShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledShipDate() {
        return scheduledShipDate;
    }

    /**
     * Sets the value of the scheduledShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledShipDate(XMLGregorianCalendar value) {
        this.scheduledShipDate = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSerialized() {
        return serialized;
    }

    /**
     * Sets the value of the serialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSerialized(Boolean value) {
        this.serialized = value;
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
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the servicePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicePriceAmount() {
        return servicePriceAmount;
    }

    /**
     * Sets the value of the servicePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServicePriceAmount(BigDecimal value) {
        this.servicePriceAmount = value;
    }

    /**
     * Gets the value of the servicePriceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePriceMethod() {
        return servicePriceMethod;
    }

    /**
     * Sets the value of the servicePriceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePriceMethod(String value) {
        this.servicePriceMethod = value;
    }

    /**
     * Gets the value of the servicePricePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicePricePercent() {
        return servicePricePercent;
    }

    /**
     * Sets the value of the servicePricePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServicePricePercent(BigDecimal value) {
        this.servicePricePercent = value;
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
     * Gets the value of the shipInstrustions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInstrustions() {
        return shipInstrustions;
    }

    /**
     * Sets the value of the shipInstrustions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInstrustions(String value) {
        this.shipInstrustions = value;
    }

    /**
     * Gets the value of the shipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipMethod() {
        return shipMethod;
    }

    /**
     * Sets the value of the shipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipMethod(String value) {
        this.shipMethod = value;
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
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress(String value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
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
     * Gets the value of the shipToCity2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity2() {
        return shipToCity2;
    }

    /**
     * Sets the value of the shipToCity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity2(String value) {
        this.shipToCity2 = value;
    }

    /**
     * Gets the value of the shipToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactFirstName() {
        return shipToContactFirstName;
    }

    /**
     * Sets the value of the shipToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactFirstName(String value) {
        this.shipToContactFirstName = value;
    }

    /**
     * Gets the value of the shipToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactLastName() {
        return shipToContactLastName;
    }

    /**
     * Sets the value of the shipToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactLastName(String value) {
        this.shipToContactLastName = value;
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
     * Gets the value of the shipToCountry2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry2() {
        return shipToCountry2;
    }

    /**
     * Sets the value of the shipToCountry2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry2(String value) {
        this.shipToCountry2 = value;
    }

    /**
     * Gets the value of the shipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToFirstName() {
        return shipToFirstName;
    }

    /**
     * Sets the value of the shipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToFirstName(String value) {
        this.shipToFirstName = value;
    }

    /**
     * Gets the value of the shipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLastName() {
        return shipToLastName;
    }

    /**
     * Sets the value of the shipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLastName(String value) {
        this.shipToLastName = value;
    }

    /**
     * Gets the value of the shipToState2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState2() {
        return shipToState2;
    }

    /**
     * Sets the value of the shipToState2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState2(String value) {
        this.shipToState2 = value;
    }

    /**
     * Gets the value of the shipToZip2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip2() {
        return shipToZip2;
    }

    /**
     * Sets the value of the shipToZip2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip2(String value) {
        this.shipToZip2 = value;
    }

    /**
     * Gets the value of the shipTogetherFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipTogetherFlag() {
        return shipTogetherFlag;
    }

    /**
     * Sets the value of the shipTogetherFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipTogetherFlag(Boolean value) {
        this.shipTogetherFlag = value;
    }

    /**
     * Gets the value of the shiptoAddressIntegrationId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiptoAddressIntegrationId2() {
        return shiptoAddressIntegrationId2;
    }

    /**
     * Sets the value of the shiptoAddressIntegrationId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiptoAddressIntegrationId2(String value) {
        this.shiptoAddressIntegrationId2 = value;
    }

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Sets the value of the shipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShipmentNumber(BigDecimal value) {
        this.shipmentNumber = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
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
     * Gets the value of the skipPricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipPricingFlag() {
        return skipPricingFlag;
    }

    /**
     * Sets the value of the skipPricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipPricingFlag(Boolean value) {
        this.skipPricingFlag = value;
    }

    /**
     * Gets the value of the skipValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipValidationFlag() {
        return skipValidationFlag;
    }

    /**
     * Sets the value of the skipValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipValidationFlag(Boolean value) {
        this.skipValidationFlag = value;
    }

    /**
     * Gets the value of the smartPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartPartNumber() {
        return smartPartNumber;
    }

    /**
     * Sets the value of the smartPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartPartNumber(String value) {
        this.smartPartNumber = value;
    }

    /**
     * Gets the value of the sourceInventoryLocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocId() {
        return sourceInventoryLocId;
    }

    /**
     * Sets the value of the sourceInventoryLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocId(String value) {
        this.sourceInventoryLocId = value;
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
     * Gets the value of the sourceInventoryLocation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocation2() {
        return sourceInventoryLocation2;
    }

    /**
     * Sets the value of the sourceInventoryLocation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocation2(String value) {
        this.sourceInventoryLocation2 = value;
    }

    /**
     * Gets the value of the sourceInventoryLocationReceiveToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocationReceiveToAddressId() {
        return sourceInventoryLocationReceiveToAddressId;
    }

    /**
     * Sets the value of the sourceInventoryLocationReceiveToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocationReceiveToAddressId(String value) {
        this.sourceInventoryLocationReceiveToAddressId = value;
    }

    /**
     * Gets the value of the sourceInventoryLocationReceiveToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocationReceiveToPostalCode() {
        return sourceInventoryLocationReceiveToPostalCode;
    }

    /**
     * Sets the value of the sourceInventoryLocationReceiveToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocationReceiveToPostalCode(String value) {
        this.sourceInventoryLocationReceiveToPostalCode = value;
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
     * Gets the value of the taxAmountHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmountHeaderCurrency() {
        return taxAmountHeaderCurrency;
    }

    /**
     * Sets the value of the taxAmountHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmountHeaderCurrency(BigDecimal value) {
        this.taxAmountHeaderCurrency = value;
    }

    /**
     * Gets the value of the taxAmountInternalHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmountInternalHeaderCurrency() {
        return taxAmountInternalHeaderCurrency;
    }

    /**
     * Sets the value of the taxAmountInternalHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmountInternalHeaderCurrency(BigDecimal value) {
        this.taxAmountInternalHeaderCurrency = value;
    }

    /**
     * Gets the value of the taxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExemptFlag() {
        return taxExemptFlag;
    }

    /**
     * Sets the value of the taxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExemptFlag(Boolean value) {
        this.taxExemptFlag = value;
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
     * Gets the value of the taxSubcomponentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxSubcomponentFlag() {
        return taxSubcomponentFlag;
    }

    /**
     * Sets the value of the taxSubcomponentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxSubcomponentFlag(Boolean value) {
        this.taxSubcomponentFlag = value;
    }

    /**
     * Gets the value of the taxableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxableFlag() {
        return taxableFlag;
    }

    /**
     * Sets the value of the taxableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxableFlag(String value) {
        this.taxableFlag = value;
    }

    /**
     * Gets the value of the terminationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTerminationFee() {
        return terminationFee;
    }

    /**
     * Sets the value of the terminationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTerminationFee(BigDecimal value) {
        this.terminationFee = value;
    }

    /**
     * Gets the value of the toNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToNode() {
        return toNode;
    }

    /**
     * Sets the value of the toNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToNode(String value) {
        this.toNode = value;
    }

    /**
     * Gets the value of the toServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToServiceAccount() {
        return toServiceAccount;
    }

    /**
     * Sets the value of the toServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToServiceAccount(String value) {
        this.toServiceAccount = value;
    }

    /**
     * Gets the value of the toServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToServiceAccountId() {
        return toServiceAccountId;
    }

    /**
     * Sets the value of the toServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToServiceAccountId(String value) {
        this.toServiceAccountId = value;
    }

    /**
     * Gets the value of the unitNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitNetPrice() {
        return unitNetPrice;
    }

    /**
     * Sets the value of the unitNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitNetPrice(BigDecimal value) {
        this.unitNetPrice = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the unitPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPriceDisplay() {
        return unitPriceDisplay;
    }

    /**
     * Sets the value of the unitPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPriceDisplay(BigDecimal value) {
        this.unitPriceDisplay = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofMeasure(String value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the updatedByLogin2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedByLogin2() {
        return updatedByLogin2;
    }

    /**
     * Sets the value of the updatedByLogin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedByLogin2(String value) {
        this.updatedByLogin2 = value;
    }

    /**
     * Gets the value of the usagePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagePlanId() {
        return usagePlanId;
    }

    /**
     * Sets the value of the usagePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagePlanId(String value) {
        this.usagePlanId = value;
    }

    /**
     * Gets the value of the usagePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagePlanName() {
        return usagePlanName;
    }

    /**
     * Sets the value of the usagePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagePlanName(String value) {
        this.usagePlanName = value;
    }

    /**
     * Gets the value of the usageScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageScheduleId() {
        return usageScheduleId;
    }

    /**
     * Sets the value of the usageScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageScheduleId(String value) {
        this.usageScheduleId = value;
    }

    /**
     * Gets the value of the usageScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageScheduleName() {
        return usageScheduleName;
    }

    /**
     * Sets the value of the usageScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageScheduleName(String value) {
        this.usageScheduleName = value;
    }

    /**
     * Gets the value of the usePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePlanId() {
        return usePlanId;
    }

    /**
     * Sets the value of the usePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePlanId(String value) {
        this.usePlanId = value;
    }

    /**
     * Gets the value of the usePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePlanName() {
        return usePlanName;
    }

    /**
     * Sets the value of the usePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePlanName(String value) {
        this.usePlanName = value;
    }

    /**
     * Gets the value of the useStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUseStartDate() {
        return useStartDate;
    }

    /**
     * Sets the value of the useStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUseStartDate(XMLGregorianCalendar value) {
        this.useStartDate = value;
    }

    /**
     * Gets the value of the vodRowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVODRowId() {
        return vodRowId;
    }

    /**
     * Sets the value of the vodRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVODRowId(String value) {
        this.vodRowId = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationDate(XMLGregorianCalendar value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatus(String value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Gets the value of the volumeDiscountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountId() {
        return volumeDiscountId;
    }

    /**
     * Sets the value of the volumeDiscountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountId(String value) {
        this.volumeDiscountId = value;
    }

    /**
     * Gets the value of the volumeDiscountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountIntegrationId() {
        return volumeDiscountIntegrationId;
    }

    /**
     * Sets the value of the volumeDiscountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountIntegrationId(String value) {
        this.volumeDiscountIntegrationId = value;
    }

    /**
     * Gets the value of the volumeDiscountItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountItem() {
        return volumeDiscountItem;
    }

    /**
     * Sets the value of the volumeDiscountItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountItem(String value) {
        this.volumeDiscountItem = value;
    }

    /**
     * Gets the value of the volumeDiscountItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountItemId() {
        return volumeDiscountItemId;
    }

    /**
     * Sets the value of the volumeDiscountItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountItemId(String value) {
        this.volumeDiscountItemId = value;
    }

    /**
     * Gets the value of the volumeDiscountMaxQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeDiscountMaxQty() {
        return volumeDiscountMaxQty;
    }

    /**
     * Sets the value of the volumeDiscountMaxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeDiscountMaxQty(BigDecimal value) {
        this.volumeDiscountMaxQty = value;
    }

    /**
     * Gets the value of the volumeDiscountMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountMethod() {
        return volumeDiscountMethod;
    }

    /**
     * Sets the value of the volumeDiscountMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountMethod(String value) {
        this.volumeDiscountMethod = value;
    }

    /**
     * Gets the value of the volumeDiscountMinQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeDiscountMinQty() {
        return volumeDiscountMinQty;
    }

    /**
     * Sets the value of the volumeDiscountMinQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeDiscountMinQty(BigDecimal value) {
        this.volumeDiscountMinQty = value;
    }

    /**
     * Gets the value of the volumeUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUoM() {
        return volumeUoM;
    }

    /**
     * Sets the value of the volumeUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUoM(String value) {
        this.volumeUoM = value;
    }

    /**
     * Gets the value of the volumeUpsellItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellItem() {
        return volumeUpsellItem;
    }

    /**
     * Sets the value of the volumeUpsellItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellItem(String value) {
        this.volumeUpsellItem = value;
    }

    /**
     * Gets the value of the volumeUpsellItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellItemId() {
        return volumeUpsellItemId;
    }

    /**
     * Sets the value of the volumeUpsellItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellItemId(String value) {
        this.volumeUpsellItemId = value;
    }

    /**
     * Gets the value of the volumeUpsellMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellMessage() {
        return volumeUpsellMessage;
    }

    /**
     * Sets the value of the volumeUpsellMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellMessage(String value) {
        this.volumeUpsellMessage = value;
    }

    /**
     * Gets the value of the warrantyRecoveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarrantyRecoveryFlag() {
        return warrantyRecoveryFlag;
    }

    /**
     * Sets the value of the warrantyRecoveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarrantyRecoveryFlag(Boolean value) {
        this.warrantyRecoveryFlag = value;
    }

    /**
     * Gets the value of the writeInProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteInProduct() {
        return writeInProduct;
    }

    /**
     * Sets the value of the writeInProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteInProduct(String value) {
        this.writeInProduct = value;
    }

    /**
     * Gets the value of the writeInProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWriteInProductFlag() {
        return writeInProductFlag;
    }

    /**
     * Sets the value of the writeInProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteInProductFlag(Boolean value) {
        this.writeInProductFlag = value;
    }

    /**
     * Gets the value of the writeInProductReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWriteInProductReadOnlyFlag() {
        return writeInProductReadOnlyFlag;
    }

    /**
     * Sets the value of the writeInProductReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteInProductReadOnlyFlag(Boolean value) {
        this.writeInProductReadOnlyFlag = value;
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
