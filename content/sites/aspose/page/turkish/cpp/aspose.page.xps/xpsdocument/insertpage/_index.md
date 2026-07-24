---
title: "Aspose::Page::XPS::XpsDocument::InsertPage yöntemi"
linktitle: "InsertPage"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::InsertPage yöntemi. C++'da belgeye varsayılan sayfa boyutunda boş bir sayfa ekler, indeks konumunda."
type: docs
weight: 4500
url: /tr/cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


*index* konumunda varsayılan sayfa boyutlu boş bir sayfa belgeye ekler.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Sayfanın eklenmesi gereken konum. |
| etkinleştir | bool | Eklenen sayfanın aktif olarak seçilip seçilmeyeceğini belirten bayrak. |

### ReturnValue

Eklenen sayfa.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


*index* konumunda belirtilen *width* ve *height* boyutlarında boş bir sayfa belgeye ekler.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Sayfanın eklenmesi gereken konum. |
| genişlik | float | Yeni bir sayfanın genişliği. |
| yükseklik | float | Yeni bir sayfanın yüksekliği. |
| etkinleştir | bool | Eklenen sayfanın aktif olarak seçilip seçilmeyeceğini belirten bayrak. |

### ReturnValue

Eklenen sayfa.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


*index* konumunda belgeye bir sayfa ekler.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Sayfanın eklenmesi gereken konum. |
| page | System::SharedPtr\<XpsModel::XpsPage\> | Eklenmek üzere [Page](../../../aspose.page/). |
| etkinleştir | bool | Eklenen sayfanın aktif olarak seçilip seçilmeyeceğini belirten bayrak. |

### ReturnValue

Eklenen sayfa.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
