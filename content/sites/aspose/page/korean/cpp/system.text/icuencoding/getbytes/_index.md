---
title: "System::Text::ICUEncoding::GetBytes 메서드"
linktitle: "GetBytes"
second_title: "C++용 Aspose.Page"
description: "System::Text::ICUEncoding::GetBytes 메서드. C++에서 문자 버퍼를 인코딩한 결과 바이트를 가져옵니다."
type: docs
weight: 300
url: /ko/cpp/system.text/icuencoding/getbytes/
---
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 인코드할 문자. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 인코드할 문자. |
| char_index | int | 문자 슬라이스 시작. |
| char_count | int | 변환할 문자 수. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/)에 문자를 넣기 위한 버퍼. |
| byte_index | int | 출력 버퍼 오프셋. |

### ReturnValue

작성된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 인코드할 문자. |
| index | int | 문자 슬라이스 시작. |
| count | int | 변환할 문자 수. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const char_t *, int, uint8_t *, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
int System::Text::ICUEncoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | const char_t * | 인코드할 문자. |
| char_count | int | 변환할 문자 수. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/)에 문자를 넣기 위한 버퍼. |
| byte_count | int | 출력 버퍼 크기. |

### ReturnValue

작성된 바이트 수.

## 또 보기

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const String\&) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/)을 인코딩할 대상. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/)을 인코딩할 대상. |
| char_index | int | 문자 슬라이스 시작. |
| char_count | int | 변환할 문자 수. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/)에 문자를 넣기 위한 버퍼. |
| byte_index | int | 출력 버퍼 오프셋. |

### ReturnValue

작성된 바이트 수.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | 인코드할 문자. |
| index | int | 문자 슬라이스 시작. |
| count | int | 변환할 문자 수. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | 인코드할 문자. |
| index | int | 문자 슬라이스 시작. |
| count | int | 변환할 문자 수. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | 인코드할 문자. |
| char_index | int | 문자 슬라이스 시작. |
| char_count | int | 변환할 문자 수. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/)에 문자를 넣기 위한 버퍼. |
| byte_index | int | 출력 버퍼 오프셋. |

### ReturnValue

작성된 바이트 수.

## 또 보기

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | 인코드할 문자. |
| char_index | int | 문자 슬라이스 시작. |
| char_count | int | 변환할 문자 수. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/)에 문자를 넣기 위한 버퍼. |
| byte_index | int | 출력 버퍼 오프셋. |

### ReturnValue

작성된 바이트 수.

## 또 보기

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
