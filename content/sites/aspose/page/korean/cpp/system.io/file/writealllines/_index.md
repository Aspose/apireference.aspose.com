---
title: "System::IO::File::WriteAllLines 메서드"
linktitle: "WriteAllLines"
second_title: "C++용 Aspose.Page"
description: "System::IO::File::WriteAllLines 메서드. 새 텍스트 파일을 생성하거나 기존 파일을 덮어쓰고, 지정된 문자열 배열의 모든 문자열을 지정된 인코딩을 사용하여 새 줄마다 하나씩 파일에 씁니다(C++)."
type: docs
weight: 3600
url: /ko/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


새 텍스트 파일을 만들거나 기존 파일을 덮어쓰고, 지정된 인코딩을 사용하여 지정된 문자열 배열의 모든 문자열을 각 줄마다 파일에 기록합니다.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 생성하거나 덮어쓸 파일 |
| 내용 | const ArrayPtr\<String\>\& | 문자열 배열 |
| encoding | const EncodingPtr\& | 사용할 문자 인코딩 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


새 텍스트 파일을 만들거나 기존 파일을 덮어쓰고, 지정된 인코딩을 사용하여 지정된 열거형 문자열 컬렉션의 모든 문자열을 각 줄마다 파일에 기록합니다.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 생성하거나 덮어쓸 파일 |
| 내용 | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 문자열의 열거 가능한 컬렉션 |
| encoding | const EncodingPtr\& | 사용할 문자 인코딩 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
