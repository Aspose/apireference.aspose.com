---
title: "System::IO::FileInfo 클래스"
linktitle: "FileInfo"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileInfo 클래스. 파일 경로와 해당 경로가 가리키는 파일을 나타내며, 이를 조작하기 위한 메서드를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 1400
url: /ko/cpp/system.io/fileinfo/
---
## FileInfo class


파일 경로와 해당 경로가 가리키는 파일을 나타내며, 이를 조작하기 위한 메서드를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class FileInfo : public System::IO::FileSystemInfo
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AppendText](./appendtext/)() | 현재 객체가 나타내는 파일을 UTF-8 인코딩으로 텍스트를 쓰기 위해 'Append' 모드로, 공유 없이 엽니다. |
| [CopyTo](./copyto/)(const String\&) | 현재 객체가 나타내는 파일을 지정된 위치로 복사합니다. 대상 파일이 이미 존재하면 복사가 실패합니다. |
| [CopyTo](./copyto/)(const String\&, bool) | 현재 객체가 나타내는 파일을 지정된 위치로 복사합니다. 매개변수를 통해 기존 대상 파일을 덮어쓸지 여부를 지정합니다. |
| [Create](./create/)() | 현재 객체가 나타내는 경로가 지정하는 위치에 파일을 생성하고, truncate 모드로 공유 없이 읽기 및 쓰기용으로 엽니다. |
| [CreateText](./createtext/)() | 현재 객체가 나타내는 경로가 지정하는 위치에 파일을 생성하고, UTF-8 인코딩으로 텍스트를 쓰기 위해 공유 없이 엽니다. |
| [Decrypt](./decrypt/)() | 구현되지 않음. |
| [Delete](./delete/)() override | 현재 객체가 나타내는 파일을 삭제합니다. |
| [Encrypt](./encrypt/)() | 구현되지 않음. |
| [FileInfo](./fileinfo/)(const String\&) | 지정된 파일을 나타내는 새로운 [FileInfo](./) 클래스 인스턴스를 생성합니다. |
| [get_Directory](./get_directory/)() | 현재 객체가 나타내는 파일이 위치한 디렉터리를 나타내는 [DirectoryInfo](../directoryinfo/) 객체를 반환합니다. |
| [get_DirectoryName](./get_directoryname/)() | 현재 객체가 나타내는 파일이 위치한 디렉터리의 전체 이름을 반환합니다. |
| [get_Exists](./get_exists/)() override | 파일이 존재하는지 여부를 나타내는 값을 반환합니다. |
| [get_IsReadOnly](./get_isreadonly/)() | 읽기 전용(ReadOnly) 속성이 설정되어 있는지 여부를 나타내는 값을 반환합니다. |
| [get_Length](./get_length/)() | 파일의 크기를 바이트 단위로 반환합니다. |
| [get_Name](./get_name/)() override | 파일 이름을 반환합니다. |
| [MoveTo](./moveto/)(const String\&) | 현재 객체가 나타내는 파일을 지정된 위치로 이동합니다. |
| [Open](./open/)(FileMode) | 현재 객체가 나타내는 파일을 지정된 모드로 읽기 및 쓰기용으로 열고 공유를 하지 않습니다. |
| [Open](./open/)(FileMode, FileAccess) | 현재 객체가 나타내는 파일을 지정된 모드와 지정된 액세스 유형으로 열고 공유를 하지 않습니다. |
| [Open](./open/)(FileMode, FileAccess, FileShare) | 현재 객체가 나타내는 파일을 지정된 모드와 지정된 액세스 유형, 공유 옵션으로 엽니다. |
| [OpenRead](./openread/)() | 현재 객체가 나타내는 파일을 읽기 전용으로, 'Open' 모드에서 읽기 공유 액세스로 엽니다. |
| [OpenText](./opentext/)() | 현재 객체가 나타내는 경로가 지정한 위치에 있는 기존 파일을 UTF-8 인코딩을 사용하여 텍스트를 읽기 위해 공유 없이 엽니다. |
| [OpenWrite](./openwrite/)() | 현재 객체가 나타내는 파일을 쓰기 전용으로, 'OpenOrCreate' 모드에서 공유 없이 엽니다. |
| [Replace](./replace/)(const String\&, const String\&) | 지정된 대상 파일의 내용을 현재 [FileInfo](./) 객체가 나타내는 파일로 교체하고, 교체된 파일의 백업을 생성합니다. |
| [Replace](./replace/)(const String\&, const String\&, bool) | 지정된 대상 파일의 내용을 현재 [FileInfo](./) 객체가 나타내는 파일로 교체하고, 교체된 파일의 백업을 생성합니다. |
| [set_IsReadOnly](./set_isreadonly/)(bool) | 파일의 읽기 전용(ReadOnly) 속성을 설정하거나 해제합니다. |
| [ToString](./tostring/)() const override | 현재 객체가 나타내는 경로를 반환합니다. |
## 또 보기

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
