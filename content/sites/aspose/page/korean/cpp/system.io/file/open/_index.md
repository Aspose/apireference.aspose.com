---
title: "System::IO::File::Open 메서드"
linktitle: "Open"
second_title: "C++용 Aspose.Page"
description: "System::IO::File::Open 메서드. 지정된 파일을 지정된 모드로 열어 읽기 및 쓰기를 수행하고, 공유 없이 사용합니다(C++)."
type: docs
weight: 1900
url: /ko/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


지정된 파일을 지정된 모드로 읽기 및 쓰기용으로 열고 공유를 하지 않습니다.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 열 파일의 경로 |
| mode | FileMode | 파일을 열 모드를 지정합니다 |

### ReturnValue

열린 파일과 연결된 [FileStream](../../filestream/) 객체

## 또 보기

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


지정된 파일을 지정된 모드와 지정된 액세스 유형 및 공유 옵션으로 엽니다.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 열 파일의 경로 |
| mode | FileMode | 파일을 열 모드를 지정합니다 |
| 액세스 | FileAccess | 요청된 액세스 유형 |
| share | FileShare | 다른 [FileStream](../../filestream/) 객체가 열린 파일에 대해 갖는 액세스 유형 |

### ReturnValue

열린 파일과 연결된 [FileStream](../../filestream/) 객체

## 또 보기

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
