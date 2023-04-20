---
title: Class MutationRecord
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Mutations.MutationRecord kelas. MutationRecord mewakili mutasi DOM individual. Itu adalah objek yang diteruskan keMutationObserver SMutationCallback .
type: docs
weight: 1140
url: /id/net/aspose.svg.dom.mutations/mutationrecord/
---
## MutationRecord class

MutationRecord mewakili mutasi DOM individual. Itu adalah objek yang diteruskan ke[`MutationObserver`](../mutationobserver/) S[`MutationCallback`](../mutationcallback/) .

```csharp
public class MutationRecord : DOMObject
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [AddedNodes](../../aspose.svg.dom.mutations/mutationrecord/addednodes/) { get; } | Mengembalikan node yang ditambahkan. |
| [AttributeName](../../aspose.svg.dom.mutations/mutationrecord/attributename/) { get; } | Mengembalikan nama lokal dari atribut yang diubah, dan null sebaliknya. |
| [AttributeNamespace](../../aspose.svg.dom.mutations/mutationrecord/attributenamespace/) { get; } | Mengembalikan namespace dari atribut yang diubah, dan null sebaliknya. |
| [NextSibling](../../aspose.svg.dom.mutations/mutationrecord/nextsibling/) { get; } | Mengembalikan saudara berikutnya dari node yang ditambahkan atau dihapus, atau null. |
| [OldValue](../../aspose.svg.dom.mutations/mutationrecord/oldvalue/) { get; } | Nilai yang dikembalikan bergantung pada jenis. Untuk "atribut", itu adalah nilai dari atribut yang diubah sebelum perubahan. Untuk "characterData", itu adalah data node yang diubah sebelum perubahan. Untuk "childList", itu adalah null. |
| [PreviousSibling](../../aspose.svg.dom.mutations/mutationrecord/previoussibling/) { get; } | Mengembalikan saudara sebelumnya dari node yang ditambahkan atau dihapus, atau null. |
| [RemovedNodes](../../aspose.svg.dom.mutations/mutationrecord/removednodes/) { get; } | Kembalikan node yang dihapus. |
| [Target](../../aspose.svg.dom.mutations/mutationrecord/target/) { get; } | Mengembalikan simpul yang terpengaruh mutasi, tergantung pada jenisnya. Untuk "atribut", itu adalah elemen yang atributnya berubah. Untuk "characterData", itu adalah node CharacterData. Untuk "childList", itu adalah simpul yang anaknya berubah. |
| [Type](../../aspose.svg.dom.mutations/mutationrecord/type/) { get; } | Mengembalikan "atribut" jika itu adalah mutasi atribut, "characterData" jika itu adalah mutasi ke node CharacterData dan "childList" jika itu adalah mutasi ke pohon node. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Metode ini digunakan untuk mengambil objek ECMAScriptType . |

### Lihat juga

* class [DOMObject](../../aspose.svg.dom/domobject/)
* ruang nama [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* perakitan [Aspose.SVG](../../)


