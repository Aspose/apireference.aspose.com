---
title: "System::IO::FileInfo::Open 메서드"
linktitle: "Open"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileInfo::Open 메서드. 현재 객체가 나타내는 파일을 지정된 모드로 읽기 및 쓰기를 위해 열고, C++에서는 공유 없이 동작합니다."
type: docs
weight: 1600
url: /ko/cpp/system.io/fileinfo/open/
---
## FileInfo::Open(FileMode) method


현재 객체가 나타내는 파일을 지정된 모드로 읽기 및 쓰기용으로 열고 공유를 하지 않습니다.

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| mode | FileMode | 파일을 열 모드를 지정합니다 |

### ReturnValue

현재 객체가 나타내는 파일과 연결된 [FileStream](../../filestream/) 객체

## 또 보기

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess) method


현재 객체가 나타내는 파일을 지정된 모드와 지정된 액세스 유형으로 열고 공유를 하지 않습니다.

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| mode | FileMode | 파일을 열 모드를 지정합니다 |
| 액세스 | FileAccess | 요청된 액세스 유형 |

### ReturnValue

현재 객체가 나타내는 파일과 연결된 [FileStream](../../filestream/) 객체

## 또 보기

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess, FileShare) method


현재 객체가 나타내는 파일을 지정된 모드와 지정된 액세스 유형, 공유 옵션으로 엽니다.

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access, FileShare share)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| mode | FileMode | 파일을 열 모드를 지정합니다 |
| 액세스 | FileAccess | 요청된 액세스 유형 |
| share | FileShare | 다른 [FileStream](../../filestream/) 객체가 열린 파일에 대해 갖는 액세스 유형 |

### ReturnValue

현재 객체가 나타내는 파일과 연결된 [FileStream](../../filestream/) 객체

## 또 보기

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
