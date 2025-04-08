---
title: Dataset
second_title: Aspose.Medical for .NET API Reference
description: Encapsulates DICOM Dataset.
type: docs
weight: 100
url: /net/aspose.medical.dicom/dataset/
---

## Dataset class

Encapsulates DICOM Dataset.

```csharp
public class Dataset : IEnumerable<IElement>
```

## Constructors

| Name | Description |
| --- | --- |
| [Dataset](dataset#constructor)() | Initialize a new instance of the [`Dataset`](../dataset). |
| [Dataset](dataset#constructor_3)(Encoding[]) | Initialize a new instance of the [`Dataset`](../dataset) with the given fallback Encodings. |
| [Dataset](dataset#constructor_2)(IEnumerable&lt;IElement&gt;) | Initialize a new instance of the [`Dataset`](../dataset) and copies the given *elements* into newly created dataset. |
| [Dataset](dataset#constructor_1)(TransferSyntax) | Initialize a new instance of the [`Dataset`](../dataset) with the given *syntax* . Internal transfer syntax representation of the dataset |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.medical.dicom/dataset/add)(IElement) | Adds the given element to the dataset if the element with the [`Tag`](../../aspose.medical.dicom.elements/ielement/tag) is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate](../../aspose.medical.dicom/dataset/addorupdate#addorupdate)(IElement) | Adds the given element to the dataset if the element with the [`Tag`](../../aspose.medical.dicom.elements/ielement/tag) is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate#addorupdate_2)(Tag, Span&lt;T&gt;) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate#addorupdate_3)(Tag, T) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate#addorupdate_4)(Tag, T[]?) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate#addorupdate_1)(Tag, ValueRepresentation, Span&lt;T&gt;) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdateRange](../../aspose.medical.dicom/dataset/addorupdaterange)(IEnumerable&lt;IElement&gt;) | Adds the given elements to the dataset. If an element with the [`Tag`](../../aspose.medical.dicom.elements/ielement/tag) is not presented in the dataset, then adds the element; otherwise, updates element's value with the same tag. |
| [Contains](../../aspose.medical.dicom/dataset/contains)(Tag) | Determines whether the DICOM dataset contains an element with the specified tag. |
| [EnumerateGroup](../../aspose.medical.dicom/dataset/enumerategroup)(ushort) | Enumerates DICOM elements for the given group. |
| [FindValues&lt;T&gt;](../../aspose.medical.dicom/dataset/findvalues)(Tag) | Returns the element values of the specified *tag* if the element exists in the dataset; otherwise, empty set. |
| [Get&lt;T&gt;](../../aspose.medical.dicom/dataset/get)(Tag) | Returns the *T* of the specified tag or `default` if the tag is not in the dataset. |
| [GetEnumerator](../../aspose.medical.dicom/dataset/getenumerator)() |  |
| [GetOrDefault](../../aspose.medical.dicom/dataset/getordefault#getordefault)(Tag) | Returns the [`IElement`](../../aspose.medical.dicom.elements/ielement) of the specified tag or `default` if the tag is not in the dataset. |
| [GetOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getordefault#getordefault_1)(Tag) | Returns the *T* of the specified tag or `default` if the tag is not in the dataset. |
| [GetSingleValue&lt;T&gt;](../../aspose.medical.dicom/dataset/getsinglevalue)(Tag) | Gets the element value of the specified *tag*, whose Value Multiplicity has to be |
| [GetSingleValueOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getsinglevalueordefault)(Tag, T) | Gets the element value of the specified *tag*, whose Value Multiplicity has to be |
| [GetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalue#getvalue_1)(Tag, Index) | Gets the *index*-th element value of the specified *tag*. |
| [GetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalue#getvalue)(Tag, int) | Gets the *index*-th element value of the specified *tag*. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalueordefault#getvalueordefault_1)(Tag, Index, T) | Gets the *index*-th element value of the specified *tag* or the *defaultValue* if the requested value is not contained in the dataset. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalueordefault#getvalueordefault)(Tag, int, T) | Gets the *index*-th element value of the specified *tag* or the *defaultValue* if the requested value is not contained in the dataset. |
| [GetValues&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalues#getvalues)(Tag) | Gets the element values of the specified *tag*. |
| [GetValues&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalues#getvalues_1)(Tag, Range) | Gets the element values of the specified *tag*. |
| [Remove](../../aspose.medical.dicom/dataset/remove#remove_2)(Func&lt;IElement, bool&gt;) | Removes all the elements that match the conditions defined by the specified *predicate*. |
| [Remove](../../aspose.medical.dicom/dataset/remove#remove)(Tag) | Removes element for given *tag*. |
| [Remove](../../aspose.medical.dicom/dataset/remove#remove_1)(params Tag[]) | Removes elements for given *tags*. |
| [Transcode](../../aspose.medical.dicom/dataset/transcode)(TransferSyntax) | Transcodes this [`Dataset`](../dataset) to the given *syntax*. |
| [TryGetSingleValue&lt;T&gt;](../../aspose.medical.dicom/dataset/trygetsinglevalue)(Tag, out T) | Gets the element value of the specified *tag*, whose value multiplicity has to be |
| [TryGetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/trygetvalue#trygetvalue_1)(Tag, Index, out T) | Gets the *index*-th element value of the specified *tag*. |
| [TryGetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/trygetvalue#trygetvalue)(Tag, int, out T) | Gets the *index*-th element value of the specified *tag*. |

### See Also

* interface [IElement](../../aspose.medical.dicom.elements/ielement)
* namespace [Aspose.Medical.Dicom](../../aspose.medical.dicom)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
