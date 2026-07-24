---
title: "System::IO::TextReader::Read 메서드"
linktitle: "읽기"
second_title: "C++용 Aspose.Page"
description: "System::IO::TextReader::Read 메서드. C++에서 스트림으로부터 단일 문자를 읽습니다."
type: docs
weight: 400
url: /ko/cpp/system.io/textreader/read/
---
## TextReader::Read() method


스트림에서 단일 문자를 읽습니다.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

UTF-16 인코딩으로 인코딩된 문자를 읽습니다; 읽은 문자가 UTF-16 인코딩에서 두 개의 코드포인트로 표현되는 경우 높은 surragate만 반환됩니다.

## 또 보기

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


스트림에서 지정된 수의 문자를 읽고, 지정된 위치부터 시작하는 지정된 문자 배열에 씁니다.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | ArrayPtr\<char_t\> | 스트림에서 읽은 문자를 쓸 UTF-16 문자 배열 |
| index | int | **buffer**에서 쓰기를 시작할 0 기반 인덱스 |
| count | int | 스트림에서 읽을 문자 수 |

### ReturnValue

스트림에서 읽은 문자 수

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
