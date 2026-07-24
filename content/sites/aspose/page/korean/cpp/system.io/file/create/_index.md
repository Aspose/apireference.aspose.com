---
title: "System::IO::File::Create 메서드"
linktitle: "생성"
second_title: "C++용 Aspose.Page"
description: "System::IO::File::Create 메서드. 새 파일을 생성(또는 기존 파일을 덮어쓰기)하고 지정된 버퍼 크기와 옵션을 사용하여 읽기 및 쓰기 액세스를 위해 엽니다(C++)."
type: docs
weight: 500
url: /ko/cpp/system.io/file/create/
---
## File::Create method


새 파일을 생성(또는 기존 파일을 덮어쓰기)하고, 지정된 버퍼 크기와 옵션을 사용하여 읽기 및 쓰기 접근으로 엽니다.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 생성하거나 덮어쓸 파일의 경로 |
| bufferSize | int32_t | 파일을 읽고 쓸 때 버퍼링되는 바이트 수 |
| 옵션 | FileOptions | 파일을 생성하거나 덮어쓸 방법을 지정합니다 |

### ReturnValue

지정된 파일과 연결된 [FileStream](../../filestream/) 객체에 대한 공유 포인터

## 또 보기

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
