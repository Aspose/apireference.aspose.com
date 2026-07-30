---
title: "System::Text::ICUDecoder::Convert yöntemi"
linktitle: "Convert"
second_title: "Aspose.Font için C++"
description: "System::Text::ICUDecoder::Convert yöntemi. Baytları C++'de karakterlere dönüştürür."
type: docs
weight: 300
url: /tr/cpp/system.text/icudecoder/convert/
---
## ICUDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Baytları karakterlere dönüştürür.

```cpp
virtual void System::Text::ICUDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | ArrayPtr\<uint8_t\> | Çözülecek baytlar. |
| byteIndex | int | Giriş tamponu ofseti. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | ArrayPtr\<char_t\> | Hedef karakter tamponu. |
| charIndex | int | Hedef dizi ofseti. |
| charCount | int | Hedef dizi boyutu. |
| flush | bool | Doğruysa, hesaplamadan sonra iç kod çözücü durumunu temizler. |
| bytesUsed | int\& | Okunan bayt sayısını saklamak için değişkene referans. |
| charsUsed | int\& | Yazılan karakter sayısını saklamak için değişkene referans. |
| completed | bool\& | Giriş tamponu tükendiğinde doğru, aksi takdirde yanlış olarak ayarlanacak değişkene referans. |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Baytları karakterlere dönüştürür.

```cpp
virtual void System::Text::ICUDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | const uint8_t * | Çözülecek baytlar. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | char_t * | Hedef karakter tamponu. |
| charCount | int | Hedef dizi boyutu. |
| flush | bool | Doğruysa, hesaplamadan sonra iç kod çözücü durumunu temizler. |
| bytesUsed | int\& | Okunan bayt sayısını saklamak için değişkene referans. |
| charsUsed | int\& | Yazılan karakter sayısını saklamak için değişkene referans. |
| completed | bool\& | Giriş tamponu tükendiğinde doğru, aksi takdirde yanlış olarak ayarlanacak değişkene referans. |

## Ayrıca Bakınız

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
