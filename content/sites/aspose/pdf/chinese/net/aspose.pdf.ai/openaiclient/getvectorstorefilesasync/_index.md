---
title: OpenAIClient.GetVectorStoreFilesAsync
second_title: Aspose.PDF for .NET API Reference
description: OpenAIClient 方法。异步检索特定向量存储中的文件列表
type: docs
weight: 370
url: /zh/net/aspose.pdf.ai/openaiclient/getvectorstorefilesasync/
---
## OpenAIClient.GetVectorStoreFilesAsync 方法

异步检索特定向量存储中的文件列表。

```csharp
public Task<VectorStoreFileListResponse> GetVectorStoreFilesAsync(string vectorStoreId, 
    VectorStoreFileListQueryParameters queryParameters = null, 
    CancellationToken? cancellationToken = default)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| vectorStoreId | 字符串 | 包含文件的向量存储的 ID。 |
| queryParameters | VectorStoreFileListQueryParameters | 可选查询参数，用于过滤文件列表。 |
| cancellationToken | 可空`1 | 用于取消操作的令牌。 |

### 返回值

表示异步操作的任务。任务结果包含向量存储中的文件列表。

### 异常

| 异常 | 条件 |
| --- | --- |
| [AIClientException](../../aiclientexception/) | 当向量存储 ID 为 null 或空时抛出。 |

### 另请参阅

* 类 [VectorStoreFileListResponse](../../vectorstorefilelistresponse/)
* 类 [VectorStoreFileListQueryParameters](../../vectorstorefilelistqueryparameters/)
* 类 [OpenAIClient](../)
* 命名空间 [Aspose.Pdf.AI](../../../aspose.pdf.ai/)
* 程序集 [Aspose.PDF](../../../)