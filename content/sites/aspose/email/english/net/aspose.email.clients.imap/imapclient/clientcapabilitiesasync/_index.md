---
title: ImapClient.ClientCapabilitiesAsync
second_title: Aspose.Email for .NET API Reference
description: ImapClient method. Notifies server which extensions are supported by client. Please note this operation works only in case if server supports RFC5161 See more https//tools.ietf.org/html/rfc5161
type: docs
weight: 460
url: /net/aspose.email.clients.imap/imapclient/clientcapabilitiesasync/
---
## ClientCapabilitiesAsync(CancellationToken, params string[]) {#clientcapabilitiesasync_3}

Notifies server which extensions are supported by client. Please note, this operation works only in case if server supports RFC5161 See more https://tools.ietf.org/html/rfc5161

```csharp
public Task<string[]> ClientCapabilitiesAsync(CancellationToken token, 
    params string[] capabilityNames)
```

| Parameter | Type | Description |
| --- | --- | --- |
| token | CancellationToken | Propagates notification that operations should be canceled. |
| capabilityNames | String[] | Array of capabilities which are supported by client |

### Return Value

Task object, with delegate for this operation

### See Also

* class [ImapClient](../)
* namespace [Aspose.Email.Clients.Imap](../../imapclient/)
* assembly [Aspose.Email](../../../)

---

## ClientCapabilitiesAsync(IConnection, CancellationToken, params string[]) {#clientcapabilitiesasync_1}

Notifies server which extensions are supported by client. Please note, this operation works only in case if server supports RFC5161 See more https://tools.ietf.org/html/rfc5161

```csharp
public Task<string[]> ClientCapabilitiesAsync(IConnection connection, CancellationToken token, 
    params string[] capabilityNames)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | IConnection | Connection to a server |
| token | CancellationToken | Propagates notification that operations should be canceled. |
| capabilityNames | String[] | Array of capabilities which are supported by client |

### Return Value

Task object, with delegate for this operation

### See Also

* interface [IConnection](../../../aspose.email.clients/iconnection/)
* class [ImapClient](../)
* namespace [Aspose.Email.Clients.Imap](../../imapclient/)
* assembly [Aspose.Email](../../../)

---

## ClientCapabilitiesAsync(params string[]) {#clientcapabilitiesasync_2}

Notifies server which extensions are supported by client. Please note, this operation works only in case if server supports RFC5161 See more https://tools.ietf.org/html/rfc5161

```csharp
public Task<string[]> ClientCapabilitiesAsync(params string[] capabilityNames)
```

| Parameter | Type | Description |
| --- | --- | --- |
| capabilityNames | String[] | Array of capabilities which are supported by client |

### Return Value

Task object, with delegate for this operation

### See Also

* class [ImapClient](../)
* namespace [Aspose.Email.Clients.Imap](../../imapclient/)
* assembly [Aspose.Email](../../../)

---

## ClientCapabilitiesAsync(IConnection, params string[]) {#clientcapabilitiesasync}

Notifies server which extensions are supported by client. Please note, this operation works only in case if server supports RFC5161 See more https://tools.ietf.org/html/rfc5161

```csharp
public Task<string[]> ClientCapabilitiesAsync(IConnection connection, 
    params string[] capabilityNames)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | IConnection | Connection to a server |
| capabilityNames | String[] | Array of capabilities which are supported by client |

### Return Value

Task object, with delegate for this operation

### See Also

* interface [IConnection](../../../aspose.email.clients/iconnection/)
* class [ImapClient](../)
* namespace [Aspose.Email.Clients.Imap](../../imapclient/)
* assembly [Aspose.Email](../../../)


