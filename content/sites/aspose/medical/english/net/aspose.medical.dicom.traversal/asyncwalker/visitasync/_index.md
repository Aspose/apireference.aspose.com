---
title: VisitAsync
second_title: Aspose.Medical for .NET API Reference
description: Asynchronously visits the entire graph of elements of the given file. The method Asynchronously visits both MetaInfoaspose.medical.dicom/dicomfile/metainfo and Datasetaspose.medical.dicom/dicomfile/dataset.
type: docs
weight: 10
url: /net/aspose.medical.dicom.traversal/asyncwalker/visitasync/
---

## VisitAsync(DicomFile) {#visitasync_1}

Asynchronously visits the entire graph of elements of the given *file*. The method Asynchronously visits both [`MetaInfo`](../../../aspose.medical.dicom/dicomfile/metainfo) and [`Dataset`](../../../aspose.medical.dicom/dicomfile/dataset).

```csharp
public Task VisitAsync(DicomFile file)
```

| Parameter | Type | Description |
| --- | --- | --- |
| file | DicomFile | A DICOM file to be visited. |

### See Also

* class [DicomFile](../../../aspose.medical.dicom/dicomfile)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(Dataset) {#visitasync}

Asynchronously visits the entire graph of elements of the given *dataset*.

```csharp
public virtual Task VisitAsync(Dataset dataset)
```

| Parameter | Type | Description |
| --- | --- | --- |
| dataset | Dataset | A DICOM dataset to be visited. |

### See Also

* class [Dataset](../../../aspose.medical.dicom/dataset)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(IElement) {#visitasync_11}

Asynchronously visits the *element*.

```csharp
public virtual Task VisitAsync(IElement element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | IElement | An element to be visited. |

### Remarks

This method will be called before the *element* runtime type based method is called.

### See Also

* interface [IElement](../../../aspose.medical.dicom.elements/ielement)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(AttributeTag) {#visitasync_4}

Asynchronously visits the [`AttributeTag`](../../../aspose.medical.dicom.elements/attributetag)*element*.

```csharp
public virtual Task VisitAsync(AttributeTag element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | AttributeTag | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [AttributeTag](../../../aspose.medical.dicom.elements/attributetag)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(FloatingPointDouble) {#visitasync_9}

Asynchronously visits the [`FloatingPointDouble`](../../../aspose.medical.dicom.elements/floatingpointdouble)*element*.

```csharp
public virtual Task VisitAsync(FloatingPointDouble element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | FloatingPointDouble | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [FloatingPointDouble](../../../aspose.medical.dicom.elements/floatingpointdouble)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(FloatingPointSingle) {#visitasync_10}

Asynchronously visits the [`FloatingPointSingle`](../../../aspose.medical.dicom.elements/floatingpointsingle)*element*.

```csharp
public virtual Task VisitAsync(FloatingPointSingle element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | FloatingPointSingle | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [FloatingPointSingle](../../../aspose.medical.dicom.elements/floatingpointsingle)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(OtherByte) {#visitasync_15}

Asynchronously visits the [`OtherByte`](../../../aspose.medical.dicom.elements/otherbyte)*element*.

```csharp
public virtual Task VisitAsync(OtherByte element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherByte | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherByte](../../../aspose.medical.dicom.elements/otherbyte)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(OtherDouble) {#visitasync_16}

Asynchronously visits the [`OtherDouble`](../../../aspose.medical.dicom.elements/otherdouble)*element*.

```csharp
public virtual Task VisitAsync(OtherDouble element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherDouble | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherDouble](../../../aspose.medical.dicom.elements/otherdouble)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(OtherFloat) {#visitasync_17}

Asynchronously visits the [`OtherFloat`](../../../aspose.medical.dicom.elements/otherfloat)*element*.

```csharp
public virtual Task VisitAsync(OtherFloat element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherFloat | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherFloat](../../../aspose.medical.dicom.elements/otherfloat)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(OtherLong) {#visitasync_18}

Asynchronously visits the [`OtherLong`](../../../aspose.medical.dicom.elements/otherlong)*element*.

```csharp
public virtual Task VisitAsync(OtherLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherLong](../../../aspose.medical.dicom.elements/otherlong)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(OtherVeryLong) {#visitasync_19}

Asynchronously visits the [`OtherVeryLong`](../../../aspose.medical.dicom.elements/otherverylong)*element*.

```csharp
public virtual Task VisitAsync(OtherVeryLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherVeryLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherVeryLong](../../../aspose.medical.dicom.elements/otherverylong)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(OtherWord) {#visitasync_20}

Asynchronously visits the [`OtherWord`](../../../aspose.medical.dicom.elements/otherword)*element*.

```csharp
public virtual Task VisitAsync(OtherWord element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherWord | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherWord](../../../aspose.medical.dicom.elements/otherword)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(SignedLong) {#visitasync_24}

Asynchronously visits the [`SignedLong`](../../../aspose.medical.dicom.elements/signedlong)*element*.

```csharp
public virtual Task VisitAsync(SignedLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | SignedLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [SignedLong](../../../aspose.medical.dicom.elements/signedlong)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(SignedShort) {#visitasync_25}

Asynchronously visits the [`SignedShort`](../../../aspose.medical.dicom.elements/signedshort)*element*.

```csharp
public virtual Task VisitAsync(SignedShort element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | SignedShort | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [SignedShort](../../../aspose.medical.dicom.elements/signedshort)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(SignedVeryLong) {#visitasync_26}

Asynchronously visits the [`SignedVeryLong`](../../../aspose.medical.dicom.elements/signedverylong)*element*.

```csharp
public virtual Task VisitAsync(SignedVeryLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | SignedVeryLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [SignedVeryLong](../../../aspose.medical.dicom.elements/signedverylong)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(Unknown) {#visitasync_30}

Asynchronously visits the [`Unknown`](../../../aspose.medical.dicom.elements/unknown)*element*.

```csharp
public virtual Task VisitAsync(Unknown element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | Unknown | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [Unknown](../../../aspose.medical.dicom.elements/unknown)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(UnsignedLong) {#visitasync_33}

Asynchronously visits the [`UnsignedLong`](../../../aspose.medical.dicom.elements/unsignedlong)*element*.

```csharp
public virtual Task VisitAsync(UnsignedLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnsignedLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnsignedLong](../../../aspose.medical.dicom.elements/unsignedlong)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(UnsignedShort) {#visitasync_34}

Asynchronously visits the [`UnsignedShort`](../../../aspose.medical.dicom.elements/unsignedshort)*element*.

```csharp
public virtual Task VisitAsync(UnsignedShort element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnsignedShort | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnsignedShort](../../../aspose.medical.dicom.elements/unsignedshort)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(UnsignedVeryLong) {#visitasync_35}

Asynchronously visits the [`UnsignedVeryLong`](../../../aspose.medical.dicom.elements/unsignedverylong)*element*.

```csharp
public virtual Task VisitAsync(UnsignedVeryLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnsignedVeryLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnsignedVeryLong](../../../aspose.medical.dicom.elements/unsignedverylong)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(Time) {#visitasync_27}

Asynchronously visits the [`Time`](../../../aspose.medical.dicom.elements/time)*element*.

```csharp
public virtual Task VisitAsync(Time element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | Time | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [Time](../../../aspose.medical.dicom.elements/time)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(UniqueIdentifier) {#visitasync_28}

Asynchronously visits the [`UniqueIdentifier`](../../../aspose.medical.dicom.elements/uniqueidentifier)*element*.

```csharp
public virtual Task VisitAsync(UniqueIdentifier element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UniqueIdentifier | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UniqueIdentifier](../../../aspose.medical.dicom.elements/uniqueidentifier)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(UniversalResource) {#visitasync_29}

Asynchronously visits the [`UniversalResource`](../../../aspose.medical.dicom.elements/universalresource)*element*.

```csharp
public virtual Task VisitAsync(UniversalResource element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UniversalResource | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UniversalResource](../../../aspose.medical.dicom.elements/universalresource)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(UnlimitedCharacters) {#visitasync_31}

Asynchronously visits the [`UnlimitedCharacters`](../../../aspose.medical.dicom.elements/unlimitedcharacters)*element*.

```csharp
public virtual Task VisitAsync(UnlimitedCharacters element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnlimitedCharacters | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnlimitedCharacters](../../../aspose.medical.dicom.elements/unlimitedcharacters)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(AgeString) {#visitasync_2}

Asynchronously visits the [`AgeString`](../../../aspose.medical.dicom.elements/agestring)*element*.

```csharp
public virtual Task VisitAsync(AgeString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | AgeString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [AgeString](../../../aspose.medical.dicom.elements/agestring)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(ApplicationEntity) {#visitasync_3}

Asynchronously visits the [`ApplicationEntity`](../../../aspose.medical.dicom.elements/applicationentity)*element*.

```csharp
public virtual Task VisitAsync(ApplicationEntity element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | ApplicationEntity | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [ApplicationEntity](../../../aspose.medical.dicom.elements/applicationentity)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(CodeString) {#visitasync_5}

Asynchronously visits the [`CodeString`](../../../aspose.medical.dicom.elements/codestring)*element*.

```csharp
public virtual Task VisitAsync(CodeString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | CodeString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [CodeString](../../../aspose.medical.dicom.elements/codestring)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(Date) {#visitasync_6}

Asynchronously visits the [`Date`](../../../aspose.medical.dicom.elements/date)*element*.

```csharp
public virtual Task VisitAsync(Date element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | Date | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [Date](../../../aspose.medical.dicom.elements/date)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(DateTime) {#visitasync_7}

Asynchronously visits the [`DateTime`](../../../aspose.medical.dicom.elements/datetime)*element*.

```csharp
public virtual Task VisitAsync(DateTime element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | DateTime | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [DateTime](../../../aspose.medical.dicom.elements/datetime)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(DecimalString) {#visitasync_8}

Asynchronously visits the [`DecimalString`](../../../aspose.medical.dicom.elements/decimalstring)*element*.

```csharp
public virtual Task VisitAsync(DecimalString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | DecimalString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [DecimalString](../../../aspose.medical.dicom.elements/decimalstring)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(IntegerString) {#visitasync_12}

Asynchronously visits the [`IntegerString`](../../../aspose.medical.dicom.elements/integerstring)*element*.

```csharp
public virtual Task VisitAsync(IntegerString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | IntegerString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [IntegerString](../../../aspose.medical.dicom.elements/integerstring)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(LongString) {#visitasync_13}

Asynchronously visits the [`LongString`](../../../aspose.medical.dicom.elements/longstring)*element*.

```csharp
public virtual Task VisitAsync(LongString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | LongString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [LongString](../../../aspose.medical.dicom.elements/longstring)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(LongText) {#visitasync_14}

Asynchronously visits the [`LongText`](../../../aspose.medical.dicom.elements/longtext)*element*.

```csharp
public virtual Task VisitAsync(LongText element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | LongText | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [LongText](../../../aspose.medical.dicom.elements/longtext)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(PersonName) {#visitasync_21}

Asynchronously visits the [`PersonName`](../../../aspose.medical.dicom.elements/personname)*element*.

```csharp
public virtual Task VisitAsync(PersonName element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | PersonName | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [PersonName](../../../aspose.medical.dicom.elements/personname)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(ShortString) {#visitasync_22}

Asynchronously visits the [`ShortString`](../../../aspose.medical.dicom.elements/shortstring)*element*.

```csharp
public virtual Task VisitAsync(ShortString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | ShortString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [ShortString](../../../aspose.medical.dicom.elements/shortstring)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(ShortText) {#visitasync_23}

Asynchronously visits the [`ShortText`](../../../aspose.medical.dicom.elements/shorttext)*element*.

```csharp
public virtual Task VisitAsync(ShortText element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | ShortText | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [ShortText](../../../aspose.medical.dicom.elements/shorttext)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

---

## VisitAsync(UnlimitedText) {#visitasync_32}

Asynchronously visits the [`UnlimitedText`](../../../aspose.medical.dicom.elements/unlimitedtext)*element*.

```csharp
public virtual Task VisitAsync(UnlimitedText element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnlimitedText | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnlimitedText](../../../aspose.medical.dicom.elements/unlimitedtext)
* class [AsyncWalker](../../asyncwalker)
* namespace [Aspose.Medical.Dicom.Traversal](../../asyncwalker)
* assembly [Aspose.Medical](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
