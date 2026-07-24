---
title: "System::IO::StringReader::Read 메서드"
linktitle: "읽기"
second_title: "C++용 Aspose.Page"
description: "System::IO::StringReader::Read 메서드. C++에서 스트림으로부터 단일 문자를 읽습니다."
type: docs
weight: 500
url: /ko/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


스트림에서 단일 문자를 읽습니다.

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

읽은 문자 또는 읽은 문자가 없으면 -1

## 또 보기

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


스트림에서 지정된 위치부터 시작하여 지정된 문자 배열에 지정된 수만큼의 문자를 읽습니다.

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | ArrayPtr\<char_t\> | 스트림에서 읽은 문자를 기록할 문자 배열 |
| index | int | **buffer**에서 쓰기를 시작할 0 기반 인덱스 |
| count | int | 스트림에서 읽을 문자 수 |

### ReturnValue

스트림에서 읽은 문자 수

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
