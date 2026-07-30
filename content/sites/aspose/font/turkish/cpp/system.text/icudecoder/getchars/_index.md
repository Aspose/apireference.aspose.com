---
title: "System::Text::ICUDecoder::GetChars yöntemi"
linktitle: "GetChars"
second_title: "Aspose.Font için C++"
description: "System::Text::ICUDecoder::GetChars yöntemi. Bir tamponu C++'ta çözümlemenin sonucunda oluşan karakterleri alır."
type: docs
weight: 500
url: /tr/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Bir tamponun çözülmesinden elde edilen karakterleri al.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | ArrayPtr\<uint8_t\> | Çözülecek baytlar. |
| byteIndex | int | Giriş tamponu ofseti. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | ArrayPtr\<char_t\> | Hedef karakter tamponu. |
| charIndex | int | Hedef dizi ofseti. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Bir tamponun çözülmesinden elde edilen karakterleri al.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | ArrayPtr\<uint8_t\> | Çözülecek baytlar. |
| byteIndex | int | Giriş tamponu ofseti. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | ArrayPtr\<char_t\> | Hedef karakter tamponu. |
| charIndex | int | Hedef dizi ofseti. |
| flush | bool | Doğruysa, hesaplamadan sonra iç kod çözücü durumunu temizler. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Bir tamponun çözülmesinden elde edilen karakterleri al.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bayt | const uint8_t * | Çözülecek baytlar. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | char_t * | Hedef karakter tamponu. |
| charCount | int | Hedef dizi boyutu. |
| flush | bool | Doğruysa, hesaplamadan sonra iç kod çözücü durumunu temizler. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
