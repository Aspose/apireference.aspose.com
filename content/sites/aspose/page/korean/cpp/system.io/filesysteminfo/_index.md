---
title: "System::IO::FileSystemInfo 클래스"
linktitle: "FileSystemInfo"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileSystemInfo 클래스. FileInfo와 DirectoryInfo의 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1600
url: /ko/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


[FileInfo](../fileinfo/)와 [DirectoryInfo](../directoryinfo/)의 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class FileSystemInfo : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Delete](./delete/)() | 현재 객체가 나타내는 엔터티를 삭제합니다. |
| virtual [Finalize](./finalize/)() | 아무 작업도 수행하지 않습니다. |
| [get_Attributes](./get_attributes/)() | 현재 객체가 나타내는 엔터티의 속성을 반환합니다. |
| [get_CreationTime](./get_creationtime/)() | 현재 객체가 나타내는 엔터티의 생성 시간을 로컬 시간으로 반환합니다. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | 현재 객체가 나타내는 엔터티의 생성 시간을 UTC 시간으로 반환합니다. |
| virtual [get_Exists](./get_exists/)() | 현재 객체가 나타내는 경로가 참조하는 엔터티가 존재하는지 확인합니다. |
| [get_Extension](./get_extension/)() | 현재 객체가 나타내는 파일의 확장자를 반환합니다. |
| virtual [get_FullName](./get_fullname/)() | 현재 객체가 나타내는 엔터티의 전체 이름(경로 포함)을 반환합니다. |
| [get_LastAccessTime](./get_lastaccesstime/)() | 현재 객체가 나타내는 엔터티의 마지막 접근 시간을 로컬 시간으로 반환합니다. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | 현재 객체가 나타내는 엔터티의 마지막 접근 시간을 UTC 시간으로 반환합니다. |
| [get_LastWriteTime](./get_lastwritetime/)() | 현재 객체가 나타내는 엔터티의 마지막 쓰기 시간을 로컬 시간으로 반환합니다. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | 현재 객체가 나타내는 엔터티의 마지막 쓰기 시간을 UTC 시간으로 반환합니다. |
| virtual [get_Name](./get_name/)() | 현재 객체가 나타내는 엔터티의 이름을 반환합니다. |
| [Refresh](./refresh/)() | 현재 객체의 상태를 새로 고칩니다. |
| [set_Attributes](./set_attributes/)(FileAttributes) | 현재 객체가 나타내는 엔터티에 지정된 속성을 설정합니다. |
| [set_CreationTime](./set_creationtime/)(DateTime) | 현재 객체가 나타내는 엔터티의 생성 시간을 로컬 시간으로 설정합니다. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | 현재 객체가 나타내는 엔터티의 생성 시간을 UTC 시간으로 설정합니다. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | 현재 객체가 나타내는 엔터티의 마지막 접근 시간을 로컬 시간으로 설정합니다. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | 현재 객체가 나타내는 엔터티의 마지막 접근 시간을 UTC 시간으로 설정합니다. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | 현재 객체가 나타내는 엔터티의 마지막 쓰기 시간을 로컬 시간으로 설정합니다. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | 현재 객체가 나타내는 엔터티의 마지막 쓰기 시간을 UTC 시간으로 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
