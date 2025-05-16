---
title: MetaInformation
second_title: Aspose.Medical for .NET API Reference
description: Representation of the file meta information in a DICOM file. https//dicom.nema.org/dicom/2013/output/chtml/part10/chapter_7.htmltable_7.1-1https//dicom.nema.org/dicom/2013/output/chtml/part10/chapter_7.htmltable_7.1-1.
type: docs
weight: 910
url: /net/aspose.medical.dicom/metainformation/
---

## MetaInformation class

Representation of the file meta information in a DICOM file. [https://dicom.nema.org/dicom/2013/output/chtml/part10/chapter_7.html#table_7.1-1](https://dicom.nema.org/dicom/2013/output/chtml/part10/chapter_7.html#table_7.1-1).

```csharp
public sealed class MetaInformation : Dataset
```

## Constructors

| Name | Description |
| --- | --- |
| [MetaInformation](metainformation#constructor)() | Initializes a new instance of the [`MetaInformation`](../metainformation). |
| [MetaInformation](metainformation#constructor_1)(Dataset) | Initializes a new instance of the [`MetaInformation`](../metainformation). |
| [MetaInformation](metainformation#constructor_2)(MetaInformation) | Initializes a new instance of the [`MetaInformation`](../metainformation). |

## Properties

| Name | Description |
| --- | --- |
| [ImplementationClassUid](../../aspose.medical.dicom/metainformation/implementationclassuid) { get; set; } | The Implementation Class UID. Read-only [`Uid`](../uid) |
| [ImplementationVersionName](../../aspose.medical.dicom/metainformation/implementationversionname) { get; set; } | The Implementation Version Name. Read-only String. |
| [MediaStorageSopClassUid](../../aspose.medical.dicom/metainformation/mediastoragesopclassuid) { get; set; } | The Media Storage SOP Class UID. Read-only [`Uid`](../uid). |
| [MediaStorageSopInstanceUid](../../aspose.medical.dicom/metainformation/mediastoragesopinstanceuid) { get; set; } | The Media Storage SOP Instance UID. Read-only [`Uid`](../uid). |
| [PrivateInformation](../../aspose.medical.dicom/metainformation/privateinformation) { get; set; } | Gets or sets the private information associated with [`PrivateInformationCreatorUid`](./privateinformationcreatoruid). Required if [`PrivateInformationCreatorUid`](./privateinformationcreatoruid) is defined. Read-only IReadOnlyCollection of Byte. |
| [PrivateInformationCreatorUid](../../aspose.medical.dicom/metainformation/privateinformationcreatoruid) { get; set; } | The Private Information Creator UID (optional attribute). Read-only [`Uid`](../uid). |
| [ReceivingApplicationEntityTitle](../../aspose.medical.dicom/metainformation/receivingapplicationentitytitle) { get; set; } | The Receiving Application Entity Title (optional attribute). Read-only String. |
| [SendingApplicationEntityTitle](../../aspose.medical.dicom/metainformation/sendingapplicationentitytitle) { get; set; } | The Sending Application Entity Title. Read-only String. |
| [SourceApplicationEntityTitle](../../aspose.medical.dicom/metainformation/sourceapplicationentitytitle) { get; set; } | The Source Application Entity Title. Read-only String. |
| [TransferSyntax](../../aspose.medical.dicom/metainformation/transfersyntax) { get; set; } | The DICOM Part 10 dataset transfer syntax. Read-only [`TransferSyntax`](./transfersyntax). |
| [Version](../../aspose.medical.dicom/metainformation/version) { get; set; } | The file meta information version. Read-only IReadOnlyCollection of Byte. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.medical.dicom/dataset/add)(IElement) | Adds the given element to the dataset if the element with the [`Tag`](../../aspose.medical.dicom.elements/ielement/tag) is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate](../../aspose.medical.dicom/dataset/addorupdate)(IElement) | Adds the given element to the dataset if the element with the [`Tag`](../../aspose.medical.dicom.elements/ielement/tag) is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate)(Tag, Span&lt;T&gt;) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate)(Tag, T) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate)(Tag, T[]?) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdate&lt;T&gt;](../../aspose.medical.dicom/dataset/addorupdate)(Tag, ValueRepresentation, Span&lt;T&gt;) | Adds single DICOM element to the dataset if the element with the *tag* is not presented in the dataset or updates element value with the same tag. |
| [AddOrUpdateRange](../../aspose.medical.dicom/dataset/addorupdaterange)(IEnumerable&lt;IElement&gt;) | Adds the given elements to the dataset. If an element with the [`Tag`](../../aspose.medical.dicom.elements/ielement/tag) is not presented in the dataset, then adds the element; otherwise, updates element's value with the same tag. |
| [Contains](../../aspose.medical.dicom/dataset/contains)(Tag) | Determines whether the DICOM dataset contains an element with the specified tag. |
| [EnumerateGroup](../../aspose.medical.dicom/dataset/enumerategroup)(ushort) | Enumerates DICOM elements for the given group. |
| [FindValues&lt;T&gt;](../../aspose.medical.dicom/dataset/findvalues)(Tag) | Returns the element values of the specified *tag* if the element exists in the dataset; otherwise, empty set. |
| [Get&lt;T&gt;](../../aspose.medical.dicom/dataset/get)(Tag) | Returns the *T* of the specified tag or `default` if the tag is not in the dataset. |
| [GetEnumerator](../../aspose.medical.dicom/dataset/getenumerator)() |  |
| [GetOrDefault](../../aspose.medical.dicom/dataset/getordefault)(Tag) | Returns the [`IElement`](../../aspose.medical.dicom.elements/ielement) of the specified tag or `default` if the tag is not in the dataset. |
| [GetOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getordefault)(Tag) | Returns the *T* of the specified tag or `default` if the tag is not in the dataset. |
| [GetPrivateTag](../../aspose.medical.dicom/dataset/getprivatetag)(Tag) | Converts a dictionary tag to a valid private tag for this dataset. |
| [GetSingleValue&lt;T&gt;](../../aspose.medical.dicom/dataset/getsinglevalue)(Tag) | Gets the element value of the specified *tag*, whose Value Multiplicity has to be |
| [GetSingleValueOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getsinglevalueordefault)(Tag, T) | Gets the element value of the specified *tag*, whose Value Multiplicity has to be |
| [GetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalue)(Tag, Index) | Gets the *index*-th element value of the specified *tag*. |
| [GetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalue)(Tag, int) | Gets the *index*-th element value of the specified *tag*. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalueordefault)(Tag, Index, T) | Gets the *index*-th element value of the specified *tag* or the *defaultValue* if the requested value is not contained in the dataset. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalueordefault)(Tag, int, T) | Gets the *index*-th element value of the specified *tag* or the *defaultValue* if the requested value is not contained in the dataset. |
| [GetValues&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalues)(Tag) | Gets the element values of the specified *tag*. |
| [GetValues&lt;T&gt;](../../aspose.medical.dicom/dataset/getvalues)(Tag, Range) | Gets the element values of the specified *tag*. |
| [Remove](../../aspose.medical.dicom/dataset/remove)(Func&lt;IElement, bool&gt;) | Removes all the elements that match the conditions defined by the specified *predicate*. |
| [Remove](../../aspose.medical.dicom/dataset/remove)(Tag) | Removes element for given *tag*. |
| [Remove](../../aspose.medical.dicom/dataset/remove)(params Tag[]) | Removes elements for given *tags*. |
| [Transcode](../../aspose.medical.dicom/dataset/transcode)(TransferSyntax) | Transcodes this [`Dataset`](../dataset) to the given *syntax*. |
| [TryGetSingleValue&lt;T&gt;](../../aspose.medical.dicom/dataset/trygetsinglevalue)(Tag, out T) | Gets the element value of the specified *tag*, whose value multiplicity has to be |
| [TryGetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/trygetvalue)(Tag, Index, out T) | Gets the *index*-th element value of the specified *tag*. |
| [TryGetValue&lt;T&gt;](../../aspose.medical.dicom/dataset/trygetvalue)(Tag, int, out T) | Gets the *index*-th element value of the specified *tag*. |

### See Also

* class [Dataset](../dataset)
* namespace [Aspose.Medical.Dicom](../../aspose.medical.dicom)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
