---
title: "System::IO::FileInfo::Replace 메서드"
linktitle: "바꾸기"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileInfo::Replace 메서드. 현재 FileInfo 객체가 나타내는 파일로 지정된 대상 파일의 내용을 교체하고, 교체된 파일의 백업을 생성합니다 (C++)."
type: docs
weight: 2000
url: /ko/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


지정된 대상 파일의 내용을 현재 [FileInfo](../) 객체가 나타내는 파일로 교체하고, 교체된 파일의 백업을 생성합니다.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| destinationFileName | const String\& | 교체할 파일의 이름 |
| destinationBackupFileName | const String\& | 백업 파일의 이름 |

### ReturnValue

**destinationFileName**이 가리키는 파일을 나타내는 FileInfor 객체

## 또 보기

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


지정된 대상 파일의 내용을 현재 [FileInfo](../) 객체가 나타내는 파일로 교체하고, 교체된 파일의 백업을 생성합니다.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| destinationFileName | const String\& | 교체할 파일의 이름 |
| destinationBackupFileName | const String\& | 백업 파일의 이름 |
| ignoreMetadataErrors | bool | 교체된 파일에서 교체 파일로의 병합 오류를 무시할지 여부를 지정합니다 (true) 또는 무시하지 않을지 (false) |

### ReturnValue

**destinationFileName**이 가리키는 파일을 나타내는 FileInfor 객체

## 또 보기

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
