---
title: "System::Text::Encoder::GetByteCount yöntemi"
linktitle: "GetByteCount"
second_title: "Aspose.Font için C++"
description: "System::Text::Encoder::GetByteCount yöntemi. C++'ta bir tamponu kodlamak için gereken bayt sayısını alır."
type: docs
weight: 400
url: /tr/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Bir tamponu kodlamak için gereken bayt sayısını alır.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Kodlanacak karakterler. |
| index | int | [Buffer](../../../system/buffer/) ofseti. |
| count | int | Kodlanacak karakter sayısı. |
| flush | bool | Doğru ise, hesaplamadan sonra iç kodlayıcı durumunu temizler. |

### ReturnValue

Tamponu kodlamak için gereken bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


Bir tamponu kodlamak için gereken bayt sayısını alır.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | const char_t * | Kodlanacak karakterler. |
| count | int | Kodlanacak karakter sayısı. |
| flush | bool | Doğru ise, hesaplamadan sonra iç kodlayıcı durumunu temizler. |

### ReturnValue

Tamponu kodlamak için gereken bayt sayısı.

## Ayrıca Bakınız

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
