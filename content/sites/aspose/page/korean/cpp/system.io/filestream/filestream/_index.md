---
title: "System::IO::FileStream::FileStream 생성자"
linktitle: "FileStream"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::IO::FileStream 클래스의 FileStream 생성자를 사용하는 방법."
type: docs
weight: 100
url: /ko/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## 또 보기

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


새로운 [FileStream](../) 클래스 인스턴스를 생성하고 지정된 매개변수로 초기화합니다.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 열 파일의 경로. |
| mode | FileMode | 파일을 열 모드를 지정합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


새로운 [FileStream](../) 클래스 인스턴스를 생성하고 지정된 매개변수로 초기화합니다.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 열 파일의 경로. |
| mode | FileMode | 파일을 열 모드를 지정합니다. |
| 액세스 | FileAccess | 요청된 접근 유형. |
| share | FileShare | 다른 [FileStream](../) 객체가 열린 파일에 대해 갖는 접근 유형. |
| buffer_size | int32_t | 읽기 및 쓰기 작업 중에 버퍼링되는 바이트 수. |
| useAsync | bool | 비동기 I/O 또는 동기 I/O를 사용할지 여부를 지정합니다. |
## 비고



기본 운영 체제가 비동기 I/O를 지원하지 않을 수 있습니다.

## 또 보기

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


새로운 [FileStream](../) 클래스 인스턴스를 생성하고 지정된 매개변수로 초기화합니다.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 열 파일의 경로. |
| mode | FileMode | 파일을 열 모드를 지정합니다. |
| 액세스 | FileAccess | 요청된 접근 유형. |
| share | FileShare | 다른 [FileStream](../) 객체가 열린 파일에 대해 갖는 접근 유형. |
| buffer_size | int32_t | 읽기 및 쓰기 작업 중에 버퍼링되는 바이트 수. |
| 옵션 | FileOptions | 추가 옵션. |

## 또 보기

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
