---
title: "System::IO::File::AppendAllLines 메서드"
linktitle: "AppendAllLines"
second_title: "C++용 Aspose.Page"
description: "System::IO::File::AppendAllLines 메서드. 지정된 문자열 컬렉션의 문자열들을 지정된 인코딩을 사용하여 각 문자열을 새 줄에 기록함으로써 지정된 파일에 추가합니다. 지정된 파일이 존재하지 않으면 파일이 생성됩니다. 모든 문자열을 기록한 후 파일은 C++에서 닫힙니다."
type: docs
weight: 100
url: /ko/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


지정된 인코딩을 사용하여 지정된 문자열 컬렉션의 문자열들을 새 줄에 각각 기록함으로써 지정된 파일에 추가합니다. 지정된 파일이 존재하지 않으면 생성됩니다. 모든 문자열을 기록한 후 파일이 닫힙니다.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 문자열을 추가할 파일의 경로 |
| 내용 | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 파일에 쓸 문자열들 |
| encoding | const EncodingPtr\& | 사용할 문자 인코딩 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
