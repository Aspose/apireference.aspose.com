---
title: IAsyncPop3Client.DeleteMessageAsync
second_title: Aspose.Email for .NET API Reference
description: IAsyncPop3Client method. Deletes the message
type: docs
weight: 20
url: /net/aspose.email.clients.pop3/iasyncpop3client/deletemessageasync/
---
## DeleteMessageAsync(int, IConnection, CancellationToken) {#deletemessageasync}

Deletes the message

```csharp
public Task DeleteMessageAsync(int sequenceNumber, IConnection connection = null, 
    CancellationToken token = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | Int32 | Connection to a server |
| sequenceNumber | IConnection | The sequence number of the message |
| token | CancellationToken | Propagates notification that operations should be canceled. |

## Remarks

The POP3 server marks the message as deleted. The POP3 server does not actually delete the message until the POP3 session enters the UPDATE state.

### See Also

* interface [IConnection](../../../aspose.email.clients/iconnection/)
* interface [IAsyncPop3Client](../)
* namespace [Aspose.Email.Clients.Pop3](../../iasyncpop3client/)
* assembly [Aspose.Email](../../../)

---

## DeleteMessageAsync(string, IConnection, CancellationToken) {#deletemessageasync_1}

Deletes the message

```csharp
public Task DeleteMessageAsync(string uniqueId, IConnection connection = null, 
    CancellationToken token = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | String | Connection to a server |
| uniqueId | IConnection | The unique id of the message |
| token | CancellationToken | Propagates notification that operations should be canceled. |

## Remarks

The POP3 server marks the message as deleted. The POP3 server does not actually delete the message until the POP3 session enters the UPDATE state.

### See Also

* interface [IConnection](../../../aspose.email.clients/iconnection/)
* interface [IAsyncPop3Client](../)
* namespace [Aspose.Email.Clients.Pop3](../../iasyncpop3client/)
* assembly [Aspose.Email](../../../)


