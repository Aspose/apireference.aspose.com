---
title: "System::Security::Permissions::SecurityPermissionFlag 枚举"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Font 适用于 C++"
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
| NoFlags | 0 | 无访问权限。 |
| Assertion | 1 | 断言已授予权限。 |
| UnmanagedCode | 2 | 调用非托管代码。 |
| SkipVerification | 4 | 跳过代码验证。 |
| 执行 | 8 | 执行代码。 |
| ControlThread | 16 | 对线程执行操作。 |
| ControlEvidence | 32 | 控制或更改 CLR 证据。 |
| ControlPolicy | 64 | 查看并更改策略。 |
| SerializationFormatter | 128 | 序列化。 |
| ControlDomainPolicy | 256 | 设置域策略。 |
| ControlPrincipal | 512 | 控制主体对象。 |
| ControlAppDomain | 1024 | 控制应用程序域。 |
| RemotingConfiguration | 2048 | 配置远程调用。 |
| 基础设施 | 4096 | 接入 CLR 基础设施。 |
| BindingRedirects | 8192 | 执行显式绑定重定向。 |
| AllFlags | 16383 | 无限制。 |

## 另见

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)
