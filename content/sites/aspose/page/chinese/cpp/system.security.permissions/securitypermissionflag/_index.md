---
title: "System::Security::Permissions::SecurityPermissionFlag 枚举"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Permissions::SecurityPermissionFlag 枚举。C++ 中安全权限的标志。"
type: docs
weight: 300
url: /zh/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


安全权限的标志。

```cpp
enum class SecurityPermissionFlag
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无标志 | 0 | 无访问。 |
| 断言 | 1 | 断言已授予权限。 |
| 非托管代码 | 2 | 调用非托管代码。 |
| 跳过验证 | 4 | 跳过代码验证。 |
| 执行 | 8 | 执行代码。 |
| 控制线程 | 16 | 对线程执行操作。 |
| 控制证据 | 32 | 控制或更改 CLR 证据。 |
| 控制策略 | 64 | 查看并更改策略。 |
| 序列化格式化程序 | 128 | 序列化。 |
| 控制域策略 | 256 | 设置域策略。 |
| 控制主体 | 512 | 控制主体对象。 |
| 控制应用程序域 | 1024 | 控制应用程序域。 |
| 远程配置 | 2048 | 配置远程。 |
| 基础设施 | 4096 | 接入 CLR 基础设施。 |
| 绑定重定向 | 8192 | 执行显式绑定重定向。 |
| AllFlags | 16383 | 无限制。 |

## 另见

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
