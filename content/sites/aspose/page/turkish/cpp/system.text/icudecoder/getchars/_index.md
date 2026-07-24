---
title: "System::Text::ICUDecoder::GetChars yöntemi"
linktitle: "GetChars"
second_title: "Aspose.Page için C++"
description: "System::Text::ICUDecoder::GetChars yöntemi. C++'ta bir tamponu çözerek elde edilen karakterleri alır."
type: docs
weight: 500
url: /tr/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Bir tamponun çözülmesinden elde edilen karakterleri al.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bayt | ArrayPtr\<uint8_t\> | Çözümlemek için baytlar. |
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
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Bir tamponun çözülmesinden elde edilen karakterleri al.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bayt | ArrayPtr\<uint8_t\> | Çözümlemek için baytlar. |
| byteIndex | int | Giriş tamponu ofseti. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | ArrayPtr\<char_t\> | Hedef karakter tamponu. |
| charIndex | int | Hedef dizi ofseti. |
| flush | bool | Doğru ise, hesaplamadan sonra iç kod çözücü durumunu temizler. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Bir tamponun çözülmesinden elde edilen karakterleri al.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bayt | const uint8_t * | Çözümlemek için baytlar. |
| byteCount | int | Giriş tamponu boyutu. |
| chars | char_t * | Hedef karakter tamponu. |
| charCount | int | Hedef dizi boyutu. |
| flush | bool | Doğru ise, hesaplamadan sonra iç kod çözücü durumunu temizler. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
