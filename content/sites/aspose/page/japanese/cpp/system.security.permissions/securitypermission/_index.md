---
title: "System::Security::Permissions::SecurityPermission クラス"
linktitle: "SecurityPermission"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Permissions::SecurityPermission クラス。セキュリティ権限を記述するクラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


セキュリティ権限を記述するクラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際にそのポインタを使用してください。

```cpp
class SecurityPermission : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Flags](./get_flags/)() | RTTI 情報。 |
| [IsUnrestricted](./isunrestricted/)() | 権限が無制限かどうかをチェックします。 |
| [SecurityPermission](./securitypermission/)(PermissionState) | コンストラクタ。 |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | コンストラクタ。 |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | 権限に関連付けられたフラグを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
