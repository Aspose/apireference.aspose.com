---
title: "System::Text::ICUEncoding::GetChars 메서드"
linktitle: "GetChars"
second_title: "C++용 Aspose.Page"
description: "System::Text::ICUEncoding::GetChars 메서드. C++에서 바이트 버퍼를 디코딩하여 얻은 문자를 반환합니다."
type: docs
weight: 500
url: /ko/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/)에서 바이트를 읽기 위한. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/)에서 바이트를 읽기 위한. |
| byte_index | int | 입력 버퍼 오프셋. |
| byte_count | int | 입력 버퍼 크기. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/)에 문자를 넣기 위한 버퍼. |
| char_index | int | 출력 버퍼 오프셋. |

### ReturnValue

작성된 문자 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/)에서 바이트를 읽기 위한. |
| index | int | 입력 버퍼 오프셋. |
| count | int | 입력 버퍼 크기. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다.

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/)에서 바이트를 읽기 위한. |
| byte_count | int | 입력 버퍼 크기. |
| chars | char_t * | [Buffer](../../../system/buffer/)에 문자를 넣기 위한 버퍼. |
| char_count | int | 출력 버퍼 크기. |

### ReturnValue

작성된 문자 수.

## 또 보기

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
