---
title: "System::IO::FileInfo::CopyTo 메서드"
linktitle: "CopyTo"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileInfo::CopyTo 메서드. 현재 객체가 나타내는 파일을 지정된 위치로 복사합니다. 대상 파일이 이미 존재하면 복사가 C++에서 실패합니다."
type: docs
weight: 300
url: /ko/cpp/system.io/fileinfo/copyto/
---
## FileInfo::CopyTo(const String\&) method


현재 객체가 나타내는 파일을 지정된 위치로 복사합니다. 대상 파일이 이미 존재하면 복사가 실패합니다.

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| destFileName | const String\& | 대상 파일 이름 |

### ReturnValue

복사본을 나타내는 [FileInfo](../) 객체

## 또 보기

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::CopyTo(const String\&, bool) method


현재 객체가 나타내는 파일을 지정된 위치로 복사합니다. 매개변수를 통해 기존 대상 파일을 덮어쓸지 여부를 지정합니다.

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName, bool overwrite)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| destFileName | const String\& | 대상 파일 이름 |
| 덮어쓰기 | bool | 대상 파일이 이미 존재할 경우 기존 파일을 덮어써야 하면 true, 복사가 실패해야 하면 false |

### ReturnValue

복사본을 나타내는 [FileInfo](../) 객체

## 또 보기

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
