---
title: AsyncWalker
second_title: Aspose.Medical for .NET API Reference
description: Represents a IElement../aspose.medical.dicom.elements/ielement asynchronous visitor that descends an entire DicomFile../aspose.medical.dicom/dicomfile or Dataset../aspose.medical.dicom/dataset or MetaInformation../aspose.medical.dicom/metainformation graph visiting each IElement../aspose.medical.dicom.elements/ielement and its nested Dataset../aspose.medical.dicom/datasets in depth-first order.
type: docs
weight: 1160
url: /net/aspose.medical.dicom.traversal/asyncwalker/
---

## AsyncWalker class

Represents a [`IElement`](../../aspose.medical.dicom.elements/ielement) asynchronous visitor that descends an entire [`DicomFile`](../../aspose.medical.dicom/dicomfile) (or [`Dataset`](../../aspose.medical.dicom/dataset), or [`MetaInformation`](../../aspose.medical.dicom/metainformation)) graph visiting each [`IElement`](../../aspose.medical.dicom.elements/ielement) and its nested [`Dataset`](../../aspose.medical.dicom/dataset)s in depth-first order.

```csharp
public abstract class AsyncWalker
```

## Methods

| Name | Description |
| --- | --- |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_2)(AgeString) | Asynchronously visits the [`AgeString`](../../aspose.medical.dicom.elements/agestring)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_3)(ApplicationEntity) | Asynchronously visits the [`ApplicationEntity`](../../aspose.medical.dicom.elements/applicationentity)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_4)(AttributeTag) | Asynchronously visits the [`AttributeTag`](../../aspose.medical.dicom.elements/attributetag)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_5)(CodeString) | Asynchronously visits the [`CodeString`](../../aspose.medical.dicom.elements/codestring)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync)(Dataset) | Asynchronously visits the entire graph of elements of the given *dataset*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_6)(Date) | Asynchronously visits the [`Date`](../../aspose.medical.dicom.elements/date)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_7)(DateTime) | Asynchronously visits the [`DateTime`](../../aspose.medical.dicom.elements/datetime)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_8)(DecimalString) | Asynchronously visits the [`DecimalString`](../../aspose.medical.dicom.elements/decimalstring)*element*. |
| [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_1)(DicomFile) | Asynchronously visits the entire graph of elements of the given *file*. The method Asynchronously visits both [`MetaInfo`](../../aspose.medical.dicom/dicomfile/metainfo) and [`Dataset`](../../aspose.medical.dicom/dicomfile/dataset). |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_9)(FloatingPointDouble) | Asynchronously visits the [`FloatingPointDouble`](../../aspose.medical.dicom.elements/floatingpointdouble)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_10)(FloatingPointSingle) | Asynchronously visits the [`FloatingPointSingle`](../../aspose.medical.dicom.elements/floatingpointsingle)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_11)(IElement) | Asynchronously visits the *element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_12)(IntegerString) | Asynchronously visits the [`IntegerString`](../../aspose.medical.dicom.elements/integerstring)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_13)(LongString) | Asynchronously visits the [`LongString`](../../aspose.medical.dicom.elements/longstring)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_14)(LongText) | Asynchronously visits the [`LongText`](../../aspose.medical.dicom.elements/longtext)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_15)(OtherByte) | Asynchronously visits the [`OtherByte`](../../aspose.medical.dicom.elements/otherbyte)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_16)(OtherDouble) | Asynchronously visits the [`OtherDouble`](../../aspose.medical.dicom.elements/otherdouble)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_17)(OtherFloat) | Asynchronously visits the [`OtherFloat`](../../aspose.medical.dicom.elements/otherfloat)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_18)(OtherLong) | Asynchronously visits the [`OtherLong`](../../aspose.medical.dicom.elements/otherlong)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_19)(OtherVeryLong) | Asynchronously visits the [`OtherVeryLong`](../../aspose.medical.dicom.elements/otherverylong)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_20)(OtherWord) | Asynchronously visits the [`OtherWord`](../../aspose.medical.dicom.elements/otherword)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_21)(PersonName) | Asynchronously visits the [`PersonName`](../../aspose.medical.dicom.elements/personname)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_22)(ShortString) | Asynchronously visits the [`ShortString`](../../aspose.medical.dicom.elements/shortstring)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_23)(ShortText) | Asynchronously visits the [`ShortText`](../../aspose.medical.dicom.elements/shorttext)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_24)(SignedLong) | Asynchronously visits the [`SignedLong`](../../aspose.medical.dicom.elements/signedlong)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_25)(SignedShort) | Asynchronously visits the [`SignedShort`](../../aspose.medical.dicom.elements/signedshort)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_26)(SignedVeryLong) | Asynchronously visits the [`SignedVeryLong`](../../aspose.medical.dicom.elements/signedverylong)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_27)(Time) | Asynchronously visits the [`Time`](../../aspose.medical.dicom.elements/time)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_28)(UniqueIdentifier) | Asynchronously visits the [`UniqueIdentifier`](../../aspose.medical.dicom.elements/uniqueidentifier)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_29)(UniversalResource) | Asynchronously visits the [`UniversalResource`](../../aspose.medical.dicom.elements/universalresource)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_30)(Unknown) | Asynchronously visits the [`Unknown`](../../aspose.medical.dicom.elements/unknown)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_31)(UnlimitedCharacters) | Asynchronously visits the [`UnlimitedCharacters`](../../aspose.medical.dicom.elements/unlimitedcharacters)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_32)(UnlimitedText) | Asynchronously visits the [`UnlimitedText`](../../aspose.medical.dicom.elements/unlimitedtext)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_33)(UnsignedLong) | Asynchronously visits the [`UnsignedLong`](../../aspose.medical.dicom.elements/unsignedlong)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_34)(UnsignedShort) | Asynchronously visits the [`UnsignedShort`](../../aspose.medical.dicom.elements/unsignedshort)*element*. |
| virtual [VisitAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitasync#visitasync_35)(UnsignedVeryLong) | Asynchronously visits the [`UnsignedVeryLong`](../../aspose.medical.dicom.elements/unsignedverylong)*element*. |
| virtual [VisitBeginFragmentAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitbeginfragmentasync)(FragmentSequence) | Indicates that *fragment* to be visited. |
| virtual [VisitBeginSequenceAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitbeginsequenceasync)(Sequence) | Indicates that *sequence* element (with nested data) to be visited. |
| virtual [VisitBeginSequenceItemAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitbeginsequenceitemasync)(Sequence, Dataset) | Indicates that *sequence* element (with nested data) to be visited. |
| virtual [VisitEndFragmentAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitendfragmentasync)(FragmentSequence) | Indicates that *fragment* to be visited. |
| virtual [VisitEndSequenceAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitendsequenceasync)(Sequence) | Indicates that *sequence* element has been visited. |
| virtual [VisitEndSequenceItemAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitendsequenceitemasync)(Sequence, Dataset) | Indicates that *sequence* element (with nested data) has been visited. |
| virtual [VisitFragmentItemAsync](../../aspose.medical.dicom.traversal/asyncwalker/visitfragmentitemasync)(FragmentSequence, byte[]) | Asynchronously visits fragment item of the given *fragment*. |

### See Also

* namespace [Aspose.Medical.Dicom.Traversal](../../aspose.medical.dicom.traversal)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
