---
title: "System::Text::ICUEncoder::GetByteCount metodu"
linktitle: "GetByteCount"
second_title: "Aspose.Page için C++"
description: "System::Text::ICUEncoder::GetByteCount metodu. C++'de bir tamponu kodlamak için gereken bayt sayısını alır."
type: docs
weight: 400
url: /tr/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Bir tamponu kodlamak için gereken bayt sayısını alır.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Kodlanacak karakterler. |
| index | int | [Buffer](../../../system/buffer/) ofseti. |
| count | int | Kodlanacak karakter sayısı. |
| flush | bool | Doğru ise, hesaplamadan sonra dahili kodlayıcı durumunu temizler. |

### ReturnValue

Tamponu kodlamak için gereken bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


Bir tamponu kodlamak için gereken bayt sayısını alır.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| chars | const char_t * | Kodlanacak karakterler. |
| count | int | Kodlanacak karakter sayısı. |
| flush | bool | Doğru ise, hesaplamadan sonra dahili kodlayıcı durumunu temizler. |

### ReturnValue

Tamponu kodlamak için gereken bayt sayısı.

## Ayrıca Bakınız

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
