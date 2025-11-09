---
title: Walker
second_title: Aspose.Medical for .NET API Reference
description: Represents a IElement../aspose.medical.dicom.elements/ielement visitor that descends an entire DicomFile../aspose.medical.dicom/dicomfile or Dataset../aspose.medical.dicom/dataset or MetaInformation../aspose.medical.dicom/metainformation graph visiting each IElement../aspose.medical.dicom.elements/ielement and its nested Dataset../aspose.medical.dicom/datasets in depth-first order.
type: docs
weight: 1170
url: /net/aspose.medical.dicom.traversal/walker/
---

## Walker class

Represents a [`IElement`](../../aspose.medical.dicom.elements/ielement) visitor that descends an entire [`DicomFile`](../../aspose.medical.dicom/dicomfile) (or [`Dataset`](../../aspose.medical.dicom/dataset), or [`MetaInformation`](../../aspose.medical.dicom/metainformation)) graph visiting each [`IElement`](../../aspose.medical.dicom.elements/ielement) and its nested [`Dataset`](../../aspose.medical.dicom/dataset)s in depth-first order.

```csharp
public abstract class Walker
```

## Methods

| Name | Description |
| --- | --- |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_2)(AgeString) | Visits the [`AgeString`](../../aspose.medical.dicom.elements/agestring)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_3)(ApplicationEntity) | Visits the [`ApplicationEntity`](../../aspose.medical.dicom.elements/applicationentity)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_4)(AttributeTag) | Visits the [`AttributeTag`](../../aspose.medical.dicom.elements/attributetag)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_5)(CodeString) | Visits the [`CodeString`](../../aspose.medical.dicom.elements/codestring)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit)(Dataset) | Visits the entire graph of elements of the given *dataset*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_6)(Date) | Visits the [`Date`](../../aspose.medical.dicom.elements/date)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_7)(DateTime) | Visits the [`DateTime`](../../aspose.medical.dicom.elements/datetime)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_8)(DecimalString) | Visits the [`DecimalString`](../../aspose.medical.dicom.elements/decimalstring)*element*. |
| [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_1)(DicomFile) | Visits the entire graph of elements of the given *file*. The method visits both [`MetaInfo`](../../aspose.medical.dicom/dicomfile/metainfo) and [`Dataset`](../../aspose.medical.dicom/dicomfile/dataset). |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_9)(FloatingPointDouble) | Visits the [`FloatingPointDouble`](../../aspose.medical.dicom.elements/floatingpointdouble)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_10)(FloatingPointSingle) | Visits the [`FloatingPointSingle`](../../aspose.medical.dicom.elements/floatingpointsingle)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_11)(IElement) | Visits the *element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_12)(IntegerString) | Visits the [`IntegerString`](../../aspose.medical.dicom.elements/integerstring)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_13)(LongString) | Visits the [`LongString`](../../aspose.medical.dicom.elements/longstring)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_14)(LongText) | Visits the [`LongText`](../../aspose.medical.dicom.elements/longtext)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_15)(OtherByte) | Visits the [`OtherByte`](../../aspose.medical.dicom.elements/otherbyte)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_16)(OtherDouble) | Visits the [`OtherDouble`](../../aspose.medical.dicom.elements/otherdouble)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_17)(OtherFloat) | Visits the [`OtherFloat`](../../aspose.medical.dicom.elements/otherfloat)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_18)(OtherLong) | Visits the [`OtherLong`](../../aspose.medical.dicom.elements/otherlong)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_19)(OtherVeryLong) | Visits the [`OtherVeryLong`](../../aspose.medical.dicom.elements/otherverylong)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_20)(OtherWord) | Visits the [`OtherWord`](../../aspose.medical.dicom.elements/otherword)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_21)(PersonName) | Visits the [`PersonName`](../../aspose.medical.dicom.elements/personname)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_22)(ShortString) | Visits the [`ShortString`](../../aspose.medical.dicom.elements/shortstring)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_23)(ShortText) | Visits the [`ShortText`](../../aspose.medical.dicom.elements/shorttext)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_24)(SignedLong) | Visits the [`SignedLong`](../../aspose.medical.dicom.elements/signedlong)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_25)(SignedShort) | Visits the [`SignedShort`](../../aspose.medical.dicom.elements/signedshort)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_26)(SignedVeryLong) | Visits the [`SignedVeryLong`](../../aspose.medical.dicom.elements/signedverylong)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_27)(Time) | Visits the [`Time`](../../aspose.medical.dicom.elements/time)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_28)(UniqueIdentifier) | Visits the [`UniqueIdentifier`](../../aspose.medical.dicom.elements/uniqueidentifier)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_29)(UniversalResource) | Visits the [`UniversalResource`](../../aspose.medical.dicom.elements/universalresource)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_30)(Unknown) | Visits the [`Unknown`](../../aspose.medical.dicom.elements/unknown)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_31)(UnlimitedCharacters) | Visits the [`UnlimitedCharacters`](../../aspose.medical.dicom.elements/unlimitedcharacters)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_32)(UnlimitedText) | Visits the [`UnlimitedText`](../../aspose.medical.dicom.elements/unlimitedtext)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_33)(UnsignedLong) | Visits the [`UnsignedLong`](../../aspose.medical.dicom.elements/unsignedlong)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_34)(UnsignedShort) | Visits the [`UnsignedShort`](../../aspose.medical.dicom.elements/unsignedshort)*element*. |
| virtual [Visit](../../aspose.medical.dicom.traversal/walker/visit#visit_35)(UnsignedVeryLong) | Visits the [`UnsignedVeryLong`](../../aspose.medical.dicom.elements/unsignedverylong)*element*. |
| virtual [VisitBeginFragment](../../aspose.medical.dicom.traversal/walker/visitbeginfragment)(FragmentSequence) | Indicates that *fragment* to be visited. |
| virtual [VisitBeginSequence](../../aspose.medical.dicom.traversal/walker/visitbeginsequence)(Sequence) | Indicates that *sequence* element (with nested data) to be visited. |
| virtual [VisitBeginSequenceItem](../../aspose.medical.dicom.traversal/walker/visitbeginsequenceitem)(Sequence, Dataset) | Indicates that *sequence* element (with nested data) to be visited. |
| virtual [VisitEndFragment](../../aspose.medical.dicom.traversal/walker/visitendfragment)(FragmentSequence) | Indicates that *fragment* to be visited. |
| virtual [VisitEndSequence](../../aspose.medical.dicom.traversal/walker/visitendsequence)(Sequence) | Indicates that *sequence* element has been visited. |
| virtual [VisitEndSequenceItem](../../aspose.medical.dicom.traversal/walker/visitendsequenceitem)(Sequence, Dataset) | Indicates that *sequence* element (with nested data) has been visited. |
| virtual [VisitFragmentItem](../../aspose.medical.dicom.traversal/walker/visitfragmentitem)(FragmentSequence, byte[]) | Visits fragment item of the given *fragment*. |

### See Also

* namespace [Aspose.Medical.Dicom.Traversal](../../aspose.medical.dicom.traversal)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
