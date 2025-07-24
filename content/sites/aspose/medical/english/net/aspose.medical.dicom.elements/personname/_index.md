---
title: PersonName
second_title: Aspose.Medical for .NET API Reference
description: Encapsulates the Person Name PN VR type. A character string encoded using a 5 component convention. The character code 5CH the BACKSLASH  in ISO-IR 6 shall not be present as it is used as the delimiter between Values in multivalued Data Elements. The string may be padded with trailing spaces. For human use the five components in their order of occurrence are
type: docs
weight: 420
url: /net/aspose.medical.dicom.elements/personname/
---

## PersonName class

Encapsulates the Person Name (PN) VR type. A character string encoded using a 5 component convention. The character code 5CH (the BACKSLASH "\" in ISO-IR 6) shall not be present, as it is used as the delimiter between Values in multivalued Data Elements. The string may be padded with trailing spaces. For human use, the five components in their order of occurrence are:

- family name complex,

- given name complex,

- middle name,

- name prefix,

- name suffix.

https://dicom.nema.org/medical/dicom/current/output/chtml/part05/sect_6.2.html#:~:text=PN-,Person%20Name,-A%20character%20string.

```csharp
public sealed class PersonName : EncodableMultiValuedTextElement
```

## Constructors

| Name | Description |
| --- | --- |
| [PersonName](personname#constructor)(Tag, Span&lt;string&gt;) |  |
| [PersonName](personname#constructor_2)(Tag, Span&lt;string&gt;, Encoding) |  |
| [PersonName](personname#constructor_1)(Tag, Span&lt;string&gt;, Span&lt;Encoding&gt;) |  |

## Properties

| Name | Description |
| --- | --- |
| override [Count](../../aspose.medical.dicom.elements/multivaluetextelement/count) { get; } | The number of elements contained in this element. Read-only Int32. |
| [Data](../../aspose.medical.dicom.elements/multivaluetextelement/data) { get; } | Multivalued Data Element value. Read-only IReadOnlyCollection of String. |
| [FamilyName](../../aspose.medical.dicom.elements/personname/familyname) { get; } | Family name or empty string. Read-only String. |
| [GivenName](../../aspose.medical.dicom.elements/personname/givenname) { get; } | Given name or empty string. Read-only String. |
| [MiddleName](../../aspose.medical.dicom.elements/personname/middlename) { get; } | Middle name or empty string. Read-only String. |
| [NamePrefix](../../aspose.medical.dicom.elements/personname/nameprefix) { get; } | Name prefix or empty string. Read-only String. |
| [NameSuffix](../../aspose.medical.dicom.elements/personname/namesuffix) { get; } | Name suffix or empty string. Read-only String. |
| [SerializationEncodings](../../aspose.medical.dicom.elements/encodablemultivaluedtextelement/serializationencodings) { get; set; } | A collection of specific character set used to serialize / deserialize this text element data. Read/Write IReadOnlyCollection of Encoding. |
| [Tag](../../aspose.medical.dicom.elements/textelement/tag) { get; } |  |
| override [ValueRepresentation](../../aspose.medical.dicom.elements/personname/valuerepresentation) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.medical.dicom.elements/multivaluetextelement/add)(string) | Adds the given *value* to the collection of values of this element. |
| [AddRange](../../aspose.medical.dicom.elements/multivaluetextelement/addrange)(IEnumerable&lt;string&gt;) | Adds the given *values* to the collection of values of this element. |
| override [Get&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/get)(Index) |  |
| override [Get&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/get)(int) |  |
| override [GetOrDefault&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/getordefault)(Index) |  |
| override [GetOrDefault&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/getordefault)(int) |  |
| override [GetValues&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/getvalues)() |  |
| override [GetValues&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/getvalues)(Range) |  |
| [Insert](../../aspose.medical.dicom.elements/multivaluetextelement/insert)(int, string) | Inserts the given *value* into this element at a given *index*. The size of the list is increased by one. |
| [Remove](../../aspose.medical.dicom.elements/multivaluetextelement/remove)(string) | Removes the first occurrence of a specific value from the element. |
| [RemoveAt](../../aspose.medical.dicom.elements/multivaluetextelement/removeat)(int) | Removes the value at the specified *index* of the element. |
| [Replace](../../aspose.medical.dicom.elements/multivaluetextelement/replace)(IEnumerable&lt;string&gt;) | Replaces the current values by the collection of the given *values*. |
| override [ToString](../../aspose.medical.dicom.elements/multivaluetextelement/tostring)() |  |
| override [TryGetValue&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/trygetvalue)(Index, out T) |  |
| override [TryGetValue&lt;T&gt;](../../aspose.medical.dicom.elements/multivaluetextelement/trygetvalue)(int, out T) |  |

### See Also

* class [EncodableMultiValuedTextElement](../encodablemultivaluedtextelement)
* namespace [Aspose.Medical.Dicom.Elements](../../aspose.medical.dicom.elements)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
