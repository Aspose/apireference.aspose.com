---
title: "System::Text::EncodingDecoder::Convert yöntemi"
linktitle: "Dönüştür"
second_title: "Aspose.Page için C++"
description: "System::Text::EncodingDecoder::Convert yöntemi. C++'ta baytları karakterlere dönüştürür."
type: docs
weight: 100
url: /tr/cpp/system.text/encodingdecoder/convert/
---
## EncodingDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Baytları karakterlere dönüştürür.

```cpp
void System::Text::EncodingDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bayt | ArrayPtr\<uint8_t\> | Çözümlemek için baytlar. |
| byteIndex | int | Giriş tamponu ofseti. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | ArrayPtr\<char_t\> | Hedef karakter tamponu. |
| charIndex | int | Hedef dizi ofseti. |
| charCount | int | Hedef dizi boyutu. |
| flush | bool | Doğru ise, hesaplamadan sonra iç kod çözücü durumunu temizler. |
| bytesUsed | int\& | Okunan bayt sayısını saklamak için değişkene referans. |
| charsUsed | int\& | Yazılan karakter sayısını saklamak için değişkene referans. |
| completed | bool\& | Giriş tamponu tükenmişse doğru, aksi takdirde yanlış olarak ayarlanacak değişkene referans. |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Baytları karakterlere dönüştürür.

```cpp
void System::Text::EncodingDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bayt | const uint8_t * | Çözümlemek için baytlar. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | char_t * | Hedef karakter tamponu. |
| charCount | int | Hedef dizi boyutu. |
| flush | bool | Doğru ise, hesaplamadan sonra iç kod çözücü durumunu temizler. |
| bytesUsed | int\& | Okunan bayt sayısını saklamak için değişkene referans. |
| charsUsed | int\& | Yazılan karakter sayısını saklamak için değişkene referans. |
| completed | bool\& | Giriş tamponu tükenmişse doğru, aksi takdirde yanlış olarak ayarlanacak değişkene referans. |

## Ayrıca Bakınız

* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
