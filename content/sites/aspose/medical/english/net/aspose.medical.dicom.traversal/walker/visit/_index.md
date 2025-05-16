---
title: Visit
second_title: Aspose.Medical for .NET API Reference
description: Visits the entire graph of elements of the given file. The method visits both MetaInfoaspose.medical.dicom/dicomfile/metainfo and Datasetaspose.medical.dicom/dicomfile/dataset.
type: docs
weight: 10
url: /net/aspose.medical.dicom.traversal/walker/visit/
---

## Visit(DicomFile) {#visit_1}

Visits the entire graph of elements of the given *file*. The method visits both [`MetaInfo`](../../../aspose.medical.dicom/dicomfile/metainfo) and [`Dataset`](../../../aspose.medical.dicom/dicomfile/dataset).

```csharp
public void Visit(DicomFile file)
```

| Parameter | Type | Description |
| --- | --- | --- |
| file | DicomFile | A DICOM file to be visited. |

### See Also

* class [DicomFile](../../../aspose.medical.dicom/dicomfile)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(Dataset) {#visit}

Visits the entire graph of elements of the given *dataset*.

```csharp
public virtual void Visit(Dataset dataset)
```

| Parameter | Type | Description |
| --- | --- | --- |
| dataset | Dataset | A DICOM dataset to be visited. |

### See Also

* class [Dataset](../../../aspose.medical.dicom/dataset)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(IElement) {#visit_11}

Visits the *element*.

```csharp
public virtual void Visit(IElement element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | IElement | An element to be visited. |

### Remarks

This method will be called before the *element* runtime type based method is called.

### See Also

* interface [IElement](../../../aspose.medical.dicom.elements/ielement)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(AttributeTag) {#visit_4}

Visits the [`AttributeTag`](../../../aspose.medical.dicom.elements/attributetag)*element*.

```csharp
public virtual void Visit(AttributeTag element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | AttributeTag | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [AttributeTag](../../../aspose.medical.dicom.elements/attributetag)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(FloatingPointDouble) {#visit_9}

Visits the [`FloatingPointDouble`](../../../aspose.medical.dicom.elements/floatingpointdouble)*element*.

```csharp
public virtual void Visit(FloatingPointDouble element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | FloatingPointDouble | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [FloatingPointDouble](../../../aspose.medical.dicom.elements/floatingpointdouble)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(FloatingPointSingle) {#visit_10}

Visits the [`FloatingPointSingle`](../../../aspose.medical.dicom.elements/floatingpointsingle)*element*.

```csharp
public virtual void Visit(FloatingPointSingle element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | FloatingPointSingle | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [FloatingPointSingle](../../../aspose.medical.dicom.elements/floatingpointsingle)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(OtherByte) {#visit_15}

Visits the [`OtherByte`](../../../aspose.medical.dicom.elements/otherbyte)*element*.

```csharp
public virtual void Visit(OtherByte element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherByte | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherByte](../../../aspose.medical.dicom.elements/otherbyte)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(OtherDouble) {#visit_16}

Visits the [`OtherDouble`](../../../aspose.medical.dicom.elements/otherdouble)*element*.

```csharp
public virtual void Visit(OtherDouble element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherDouble | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherDouble](../../../aspose.medical.dicom.elements/otherdouble)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(OtherFloat) {#visit_17}

Visits the [`OtherFloat`](../../../aspose.medical.dicom.elements/otherfloat)*element*.

```csharp
public virtual void Visit(OtherFloat element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherFloat | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherFloat](../../../aspose.medical.dicom.elements/otherfloat)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(OtherLong) {#visit_18}

Visits the [`OtherLong`](../../../aspose.medical.dicom.elements/otherlong)*element*.

```csharp
public virtual void Visit(OtherLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherLong](../../../aspose.medical.dicom.elements/otherlong)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(OtherVeryLong) {#visit_19}

Visits the [`OtherVeryLong`](../../../aspose.medical.dicom.elements/otherverylong)*element*.

```csharp
public virtual void Visit(OtherVeryLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherVeryLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherVeryLong](../../../aspose.medical.dicom.elements/otherverylong)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(OtherWord) {#visit_20}

Visits the [`OtherWord`](../../../aspose.medical.dicom.elements/otherword)*element*.

```csharp
public virtual void Visit(OtherWord element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | OtherWord | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [OtherWord](../../../aspose.medical.dicom.elements/otherword)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(SignedLong) {#visit_24}

Visits the [`SignedLong`](../../../aspose.medical.dicom.elements/signedlong)*element*.

```csharp
public virtual void Visit(SignedLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | SignedLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [SignedLong](../../../aspose.medical.dicom.elements/signedlong)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(SignedShort) {#visit_25}

Visits the [`SignedShort`](../../../aspose.medical.dicom.elements/signedshort)*element*.

```csharp
public virtual void Visit(SignedShort element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | SignedShort | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [SignedShort](../../../aspose.medical.dicom.elements/signedshort)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(SignedVeryLong) {#visit_26}

Visits the [`SignedVeryLong`](../../../aspose.medical.dicom.elements/signedverylong)*element*.

```csharp
public virtual void Visit(SignedVeryLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | SignedVeryLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [SignedVeryLong](../../../aspose.medical.dicom.elements/signedverylong)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(Unknown) {#visit_30}

Visits the [`Unknown`](../../../aspose.medical.dicom.elements/unknown)*element*.

```csharp
public virtual void Visit(Unknown element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | Unknown | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [Unknown](../../../aspose.medical.dicom.elements/unknown)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(UnsignedLong) {#visit_33}

Visits the [`UnsignedLong`](../../../aspose.medical.dicom.elements/unsignedlong)*element*.

```csharp
public virtual void Visit(UnsignedLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnsignedLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnsignedLong](../../../aspose.medical.dicom.elements/unsignedlong)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(UnsignedShort) {#visit_34}

Visits the [`UnsignedShort`](../../../aspose.medical.dicom.elements/unsignedshort)*element*.

```csharp
public virtual void Visit(UnsignedShort element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnsignedShort | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnsignedShort](../../../aspose.medical.dicom.elements/unsignedshort)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(UnsignedVeryLong) {#visit_35}

Visits the [`UnsignedVeryLong`](../../../aspose.medical.dicom.elements/unsignedverylong)*element*.

```csharp
public virtual void Visit(UnsignedVeryLong element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnsignedVeryLong | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnsignedVeryLong](../../../aspose.medical.dicom.elements/unsignedverylong)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(Time) {#visit_27}

Visits the [`Time`](../../../aspose.medical.dicom.elements/time)*element*.

```csharp
public virtual void Visit(Time element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | Time | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [Time](../../../aspose.medical.dicom.elements/time)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(UniqueIdentifier) {#visit_28}

Visits the [`UniqueIdentifier`](../../../aspose.medical.dicom.elements/uniqueidentifier)*element*.

```csharp
public virtual void Visit(UniqueIdentifier element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UniqueIdentifier | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UniqueIdentifier](../../../aspose.medical.dicom.elements/uniqueidentifier)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(UniversalResource) {#visit_29}

Visits the [`UniversalResource`](../../../aspose.medical.dicom.elements/universalresource)*element*.

```csharp
public virtual void Visit(UniversalResource element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UniversalResource | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UniversalResource](../../../aspose.medical.dicom.elements/universalresource)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(UnlimitedCharacters) {#visit_31}

Visits the [`UnlimitedCharacters`](../../../aspose.medical.dicom.elements/unlimitedcharacters)*element*.

```csharp
public virtual void Visit(UnlimitedCharacters element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnlimitedCharacters | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnlimitedCharacters](../../../aspose.medical.dicom.elements/unlimitedcharacters)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(AgeString) {#visit_2}

Visits the [`AgeString`](../../../aspose.medical.dicom.elements/agestring)*element*.

```csharp
public virtual void Visit(AgeString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | AgeString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [AgeString](../../../aspose.medical.dicom.elements/agestring)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(ApplicationEntity) {#visit_3}

Visits the [`ApplicationEntity`](../../../aspose.medical.dicom.elements/applicationentity)*element*.

```csharp
public virtual void Visit(ApplicationEntity element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | ApplicationEntity | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [ApplicationEntity](../../../aspose.medical.dicom.elements/applicationentity)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(CodeString) {#visit_5}

Visits the [`CodeString`](../../../aspose.medical.dicom.elements/codestring)*element*.

```csharp
public virtual void Visit(CodeString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | CodeString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [CodeString](../../../aspose.medical.dicom.elements/codestring)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(Date) {#visit_6}

Visits the [`Date`](../../../aspose.medical.dicom.elements/date)*element*.

```csharp
public virtual void Visit(Date element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | Date | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [Date](../../../aspose.medical.dicom.elements/date)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(DateTime) {#visit_7}

Visits the [`DateTime`](../../../aspose.medical.dicom.elements/datetime)*element*.

```csharp
public virtual void Visit(DateTime element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | DateTime | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [DateTime](../../../aspose.medical.dicom.elements/datetime)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(DecimalString) {#visit_8}

Visits the [`DecimalString`](../../../aspose.medical.dicom.elements/decimalstring)*element*.

```csharp
public virtual void Visit(DecimalString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | DecimalString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [DecimalString](../../../aspose.medical.dicom.elements/decimalstring)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(IntegerString) {#visit_12}

Visits the [`IntegerString`](../../../aspose.medical.dicom.elements/integerstring)*element*.

```csharp
public virtual void Visit(IntegerString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | IntegerString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [IntegerString](../../../aspose.medical.dicom.elements/integerstring)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(LongString) {#visit_13}

Visits the [`LongString`](../../../aspose.medical.dicom.elements/longstring)*element*.

```csharp
public virtual void Visit(LongString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | LongString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [LongString](../../../aspose.medical.dicom.elements/longstring)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(LongText) {#visit_14}

Visits the [`LongText`](../../../aspose.medical.dicom.elements/longtext)*element*.

```csharp
public virtual void Visit(LongText element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | LongText | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [LongText](../../../aspose.medical.dicom.elements/longtext)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(PersonName) {#visit_21}

Visits the [`PersonName`](../../../aspose.medical.dicom.elements/personname)*element*.

```csharp
public virtual void Visit(PersonName element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | PersonName | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [PersonName](../../../aspose.medical.dicom.elements/personname)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(ShortString) {#visit_22}

Visits the [`ShortString`](../../../aspose.medical.dicom.elements/shortstring)*element*.

```csharp
public virtual void Visit(ShortString element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | ShortString | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [ShortString](../../../aspose.medical.dicom.elements/shortstring)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(ShortText) {#visit_23}

Visits the [`ShortText`](../../../aspose.medical.dicom.elements/shorttext)*element*.

```csharp
public virtual void Visit(ShortText element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | ShortText | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [ShortText](../../../aspose.medical.dicom.elements/shorttext)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

---

## Visit(UnlimitedText) {#visit_32}

Visits the [`UnlimitedText`](../../../aspose.medical.dicom.elements/unlimitedtext)*element*.

```csharp
public virtual void Visit(UnlimitedText element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | UnlimitedText | An element to be visited. |

### Remarks

This method will be called after the untyped equivalent for this *element* has been called.

### See Also

* class [UnlimitedText](../../../aspose.medical.dicom.elements/unlimitedtext)
* class [Walker](../../walker)
* namespace [Aspose.Medical.Dicom.Traversal](../../walker)
* assembly [Aspose.Medical](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
