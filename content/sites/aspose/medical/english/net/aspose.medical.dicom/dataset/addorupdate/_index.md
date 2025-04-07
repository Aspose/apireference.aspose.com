---
title: AddOrUpdate
second_title: Aspose.Medical for .NET API Reference
description: Adds the given element to the dataset if the element with the Tagaspose.medical.dicom.elements/ielement/tag is not presented in the dataset or updates element value with the same tag.
type: docs
weight: 30
url: /aspose.medical.dicom/dataset/addorupdate/
---

## AddOrUpdate(IElement) {#addorupdate}

Adds the given element to the dataset if the element with the [`Tag`](../../../aspose.medical.dicom.elements/ielement/tag) is not presented in the dataset or updates element value with the same tag.

```csharp
public void AddOrUpdate(IElement element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| element | IElement | A DICOM element to be added / updated. |

### See Also

* interface [IElement](../../../aspose.medical.dicom.elements/ielement)
* class [Dataset](../../dataset)
* namespace [Aspose.Medical.Dicom](../../dataset)
* assembly [Aspose.Medical](../../../)

---

## AddOrUpdate&lt;T&gt;(Tag, T) {#addorupdate_3}

Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag.

```csharp
public void AddOrUpdate<T>(Tag tag, T value)
```

| Parameter | Description |
| --- | --- |
| T | Type of added values. |
| tag | DICOM tag of the added item. |
| value | Value of the added item. |

### Exceptions

| exception | condition |
| --- | --- |
| [DicomValidationException](../../../aspose.medical.dicom.valuevalidation/dicomvalidationexception) | The provided data are invalid. |
| [MedicalApiException](../../../aspose.medical.errors/medicalapiexception) | Unable to identify value representation for the given *tag*. |

### See Also

* class [Tag](../../../aspose.medical.dicom.tags/tag)
* class [Dataset](../../dataset)
* namespace [Aspose.Medical.Dicom](../../dataset)
* assembly [Aspose.Medical](../../../)

---

## AddOrUpdate&lt;T&gt;(Tag, T[]?) {#addorupdate_4}

Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag.

```csharp
public void AddOrUpdate<T>(Tag tag, T[]? values)
```

| Parameter | Description |
| --- | --- |
| T | Type of added values. |
| tag | DICOM tag of the added item. |
| values | Values of the added item. |

### Exceptions

| exception | condition |
| --- | --- |
| [DicomValidationException](../../../aspose.medical.dicom.valuevalidation/dicomvalidationexception) | The provided data are invalid. |
| [MedicalApiException](../../../aspose.medical.errors/medicalapiexception) | Unable to identify value representation for the given *tag*. |

### See Also

* class [Tag](../../../aspose.medical.dicom.tags/tag)
* class [Dataset](../../dataset)
* namespace [Aspose.Medical.Dicom](../../dataset)
* assembly [Aspose.Medical](../../../)

---

## AddOrUpdate&lt;T&gt;(Tag, Span&lt;T&gt;) {#addorupdate_2}

Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag.

```csharp
public void AddOrUpdate<T>(Tag tag, Span<T> values)
```

| Parameter | Description |
| --- | --- |
| T | Type of added values. |
| tag | DICOM tag of the added item. |
| values | Values of the added item. |

### Exceptions

| exception | condition |
| --- | --- |
| [DicomValidationException](../../../aspose.medical.dicom.valuevalidation/dicomvalidationexception) | The provided data are invalid. |
| [MedicalApiException](../../../aspose.medical.errors/medicalapiexception) | Unable to identify value representation for the given *tag*. |

### See Also

* class [Tag](../../../aspose.medical.dicom.tags/tag)
* class [Dataset](../../dataset)
* namespace [Aspose.Medical.Dicom](../../dataset)
* assembly [Aspose.Medical](../../../)

---

## AddOrUpdate&lt;T&gt;(Tag, ValueRepresentation, Span&lt;T&gt;) {#addorupdate_1}

Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag.

```csharp
public void AddOrUpdate<T>(Tag tag, ValueRepresentation vr, Span<T> values)
```

| Parameter | Description |
| --- | --- |
| T | Type of added values. |
| tag | DICOM tag of the added item. |
| vr | Value representation of an element to be added or updated. |
| values | Values of the added item. |

### Exceptions

| exception | condition |
| --- | --- |
| [DicomValidationException](../../../aspose.medical.dicom.valuevalidation/dicomvalidationexception) | The provided data are invalid. |
| [MedicalApiException](../../../aspose.medical.errors/medicalapiexception) | The specified *vr* is not compatible with the given *tag*. |

### See Also

* class [Tag](../../../aspose.medical.dicom.tags/tag)
* class [ValueRepresentation](../../../aspose.medical.dicom.valuerepresentations/valuerepresentation)
* class [Dataset](../../dataset)
* namespace [Aspose.Medical.Dicom](../../dataset)
* assembly [Aspose.Medical](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
