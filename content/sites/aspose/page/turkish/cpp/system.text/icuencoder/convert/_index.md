---
title: "System::Text::ICUEncoder::Convert yöntemi"
linktitle: "Dönüştür"
second_title: "Aspose.Page için C++"
description: "System::Text::ICUEncoder::Convert yöntemi. C++'de karakterleri baytlara dönüştürür."
type: docs
weight: 300
url: /tr/cpp/system.text/icuencoder/convert/
---
## ICUEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Karakterleri baytlara dönüştürür.

```cpp
virtual void System::Text::ICUEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Kodlanacak karakterler. |
| charIndex | int | Giriş tamponu ofseti. |
| charCount | int | Giriş tamponu boyutu. |
| bayt | ArrayPtr\<uint8_t\> | Hedef bayt tamponu. |
| byteIndex | int | Hedef dizi ofseti. |
| byteCount | int | Hedef dizi boyutu. |
| flush | bool | Doğru ise, hesaplamadan sonra dahili kodlayıcı durumunu temizler. |
| charsUsed | int\& | Okunan karakter sayısını saklamak için değişkene referans. |
| bytesUsed | int\& | Yazılan bayt sayısını saklamak için değişkene referans. |
| completed | bool\& | Giriş tamponu tükenmişse doğru, aksi takdirde yanlış olarak ayarlanacak değişkene referans. |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Karakterleri baytlara dönüştürür.

```cpp
virtual void System::Text::ICUEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| chars | const char_t * | Kodlanacak karakterler. |
| charCount | int | Giriş tamponu boyutu. |
| bayt | uint8_t * | Hedef bayt tamponu. |
| byteCount | int | Hedef dizi boyutu. |
| flush | bool | Doğru ise, hesaplamadan sonra dahili kodlayıcı durumunu temizler. |
| charsUsed | int\& | Okunan karakter sayısını saklamak için değişkene referans. |
| bytesUsed | int\& | Yazılan bayt sayısını saklamak için değişkene referans. |
| completed | bool\& | Giriş tamponu tükenmişse doğru, aksi takdirde yanlış olarak ayarlanacak değişkene referans. |

## Ayrıca Bakınız

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
