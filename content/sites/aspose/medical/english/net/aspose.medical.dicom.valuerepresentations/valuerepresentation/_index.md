---
title: ValueRepresentation
second_title: Aspose.Medical for .NET API Reference
description: Encapsulates DICOM VR value representation. https//dicom.nema.org/medical/dicom/current/output/chtml/part05/sect_6.2.htmlhttps//dicom.nema.org/medical/dicom/current/output/chtml/part05/sect_6.2.html
type: docs
weight: 1210
url: /net/aspose.medical.dicom.valuerepresentations/valuerepresentation/
---

## ValueRepresentation class

Encapsulates DICOM VR (value representation). [https://dicom.nema.org/medical/dicom/current/output/chtml/part05/sect_6.2.html](https://dicom.nema.org/medical/dicom/current/output/chtml/part05/sect_6.2.html)

```csharp
public sealed class ValueRepresentation : IEquatable<ValueRepresentation>, IStructuralEquatable
```

## Properties

| Name | Description |
| --- | --- |
| [ByteSwap](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/byteswap) { get; } | Number of bytes to swap when changing endian representation of value. Usually equal to the [`UnitSize`](./unitsize). Read-only Int32. |
| [Code](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/code) { get; set; } | Code used to represent VR. Read-only String. |
| [Is16BitLength](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/is16bitlength) { get; } | Specifies that length field of value is a 16-bit short integer. Read-only Boolean. |
| [IsMultiValue](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/ismultivalue) { get; } | Specifies whether the value can contain multiple items. Read-only Boolean. |
| [IsString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/isstring) { get; } | Specifies that the value is a string. Read-only Boolean. |
| [MaximumLength](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/maximumlength) { get; } | Maximum length of a single value. Read-only UInt32. |
| [Name](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/name) { get; set; } | Descriptive name of VR. Read-only String. |
| [PaddingValue](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/paddingvalue) { get; } | Byte value used to pad value to even length. Read-only Byte. |
| [UnitSize](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/unitsize) { get; } | Size of each individual value unit for fixed length value types. Read-only Int32. |
| [ValueType](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/valuetype) { get; set; } | Type used to represent VR value. Read-only Type. |

## Methods

| Name | Description |
| --- | --- |
| static [Parse](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/parse)(string) | Converts the string representation of a VR to its typed equivalent. |
| override [Equals](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/equals#equals_1)(object) |  |
| [Equals](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/equals#equals)(ValueRepresentation) |  |
| [Equals](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/equals#equals_2)(object?, IEqualityComparer) |  |
| override [GetHashCode](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/gethashcode#gethashcode)() |  |
| [GetHashCode](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/gethashcode#gethashcode_1)(IEqualityComparer) |  |
| override [ToString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/tostring)() |  |
| [operator ==](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/op_equality) | Determines whether two specified objects have the same value. |
| [operator !=](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/op_inequality) | Determines whether two specified objects have different values. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [AgeString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/agestring) | Age String (AS). |
| static readonly [ApplicationEntity](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/applicationentity) | Application Entity (AE). |
| static readonly [AttributeTag](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/attributetag) | Attribute Tag (AT). |
| static readonly [CodeString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/codestring) | Code String (CS). |
| static readonly [Date](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/date) | Date (DA). |
| static readonly [DateTime](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/datetime) | Date Time (DT). |
| static readonly [DecimalString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/decimalstring) | Decimal String (DS). |
| static readonly [FloatingPointDouble](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/floatingpointdouble) | Floating Point Double (FD). |
| static readonly [FloatingPointSingle](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/floatingpointsingle) | Floating Point Single (FL). |
| static readonly [IntegerString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/integerstring) | Integer String (IS). |
| static readonly [ItemsSequence](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/itemssequence) | Items sequence (SQ). |
| static readonly [LongString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/longstring) | Long String (LO). |
| static readonly [LongText](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/longtext) | Long Text (LT). |
| static readonly [None](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/none) | No Value Representation. |
| static readonly [OtherByte](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/otherbyte) | Other Byte (OB). |
| static readonly [OtherDouble](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/otherdouble) | Other Double (OD). |
| static readonly [OtherFloat](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/otherfloat) | Other Float (OF). |
| static readonly [OtherLong](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/otherlong) | Other Long (OL). |
| static readonly [OtherVeryLong](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/otherverylong) | Other Very Long (OV). |
| static readonly [OtherWord](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/otherword) | Other Word (OW). |
| static readonly [PersonName](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/personname) | Person Name (PN). |
| static readonly [ShortString](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/shortstring) | Short String (SH). |
| static readonly [ShortText](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/shorttext) | Short Text (ST). |
| static readonly [SignedLong](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/signedlong) | Signed Long (SL). |
| static readonly [SignedShort](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/signedshort) | Signed Short (SS). |
| static readonly [SignedVeryLong](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/signedverylong) | Signed Very Long (SV). |
| static readonly [Time](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/time) | Time (TM). |
| static readonly [UniqueIdentifier](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/uniqueidentifier) | Unique Identifier (UI). |
| static readonly [UniversalResourceIdentifier](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/universalresourceidentifier) | Universal Resource Identifier (URI) or Universal Resource Locator (URI) (UR). |
| static readonly [Unknown](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/unknown) | Unknown (UN). |
| static readonly [UnlimitedCharacters](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/unlimitedcharacters) | Unlimited Characters (UC). |
| static readonly [UnlimitedText](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/unlimitedtext) | Unlimited Text (UT). |
| static readonly [UnsignedLong](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/unsignedlong) | Unsigned Long (UL). |
| static readonly [UnsignedShort](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/unsignedshort) | Unsigned Short (US). |
| static readonly [UnsignedVeryLong](../../aspose.medical.dicom.valuerepresentations/valuerepresentation/unsignedverylong) | Unsigned Very Long (UV). |

### See Also

* namespace [Aspose.Medical.Dicom.ValueRepresentations](../../aspose.medical.dicom.valuerepresentations)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
