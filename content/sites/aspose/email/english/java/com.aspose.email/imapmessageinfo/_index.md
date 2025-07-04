---
title: ImapMessageInfo
second_title: Aspose.Email for Java API Reference
description: Represents a Imap message object.
type: docs
weight: 333
url: /java/com.aspose.email/imapmessageinfo/
---

**Inheritance:**
java.lang.Object, [com.aspose.email.MessageInfoBase](../../com.aspose.email/messageinfobase)
```
public final class ImapMessageInfo extends MessageInfoBase
```

Represents a Imap message object.
## Methods

| Method | Description |
| --- | --- |
| [close()](#close--) |  |
| [containsKeyword(String flag)](#containsKeyword-java.lang.String-) | Gets a value indicating whether Flags property contains the Keyword flag. |
| [dispose()](#dispose--) | Performs tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAnswered()](#getAnswered--) | Gets a value indicating whether Flags property contains the Answered flag. |
| [getBcc()](#getBcc--) | Gets blind carbon copy of the E-Mail message. |
| [getCC()](#getCC--) | Gets CC of the E-Mail message. |
| [getClass()](#getClass--) |  |
| [getConversationId()](#getConversationId--) | Gets a value indicating conversation id. |
| [getDate()](#getDate--) | The origination date specifies the date and time at which the creator of the message indicated that the message was complete and ready to enter the mail delivery system. |
| [getDeleted()](#getDeleted--) | Gets a value indicating whether Flags property contains the Deleted flag. |
| [getDraft()](#getDraft--) | Gets a value indicating whether Flags property contains the Draft flag. |
| [getExtraParameters()](#getExtraParameters--) | Gets extra parameters of a message. |
| [getFlagged()](#getFlagged--) | Gets a value indicating whether Flags property contains the Flagged flag. |
| [getFlags()](#getFlags--) | Gets the message flags. |
| [getFrom()](#getFrom--) | Gets the list of authors of this message. |
| [getHeaders()](#getHeaders--) | Gets the Headers of the E-Mail message. |
| [getInternalDate()](#getInternalDate--) | The internal date and time of the message on the server. |
| [getListUnsubscribe()](#getListUnsubscribe--) | The List-Unsubscribe field describes the command (preferably using mail) to directly unsubscribe the user(removing them from the list). |
| [getMessageId()](#getMessageId--) | Gets the message ID. |
| [getModificationSequence()](#getModificationSequence--) | Gets the modification sequence of this message. |
| [getParentFolder()](#getParentFolder--) | Gets parent folder for message |
| [getProperties()](#getProperties--) | Gets a mapi properties. |
| [getRecent()](#getRecent--) | Gets a value indicating whether Flags property contains the Recent flag. |
| [getReplyTo()](#getReplyTo--) | Gets the list of addresses that should receive replies to this message. |
| [getSender()](#getSender--) | Gets the sender of this message. |
| [getSequenceNumber()](#getSequenceNumber--) | Gets the message sequence number. |
| [getSize()](#getSize--) | Gets the size of the E-Mail message. |
| [getSubject()](#getSubject--) | Gets the Subject of the E-Mail message. |
| [getTo()](#getTo--) | Gets the receiptants of the E-Mail message. |
| [getUniqueId()](#getUniqueId--) | Gets the message unique ID. |
| [hashCode()](#hashCode--) |  |
| [isRead()](#isRead--) | Gets a value indicating whether Flags property contains the Read flag. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | Returns a string that represents the current object. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### close() {#close--}
```
public void close()
```




### containsKeyword(String flag) {#containsKeyword-java.lang.String-}
```
public final boolean containsKeyword(String flag)
```


Gets a value indicating whether Flags property contains the Keyword flag.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flag | java.lang.String | The Keyword flag. |

**Returns:**
boolean
### dispose() {#dispose--}
```
public void dispose()
```


Performs tasks associated with freeing, releasing, or resetting unmanaged resources.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAnswered() {#getAnswered--}
```
public final boolean getAnswered()
```


Gets a value indicating whether Flags property contains the Answered flag.

Value: The answered flag.

**Returns:**
boolean
### getBcc() {#getBcc--}
```
public MailAddressCollection getBcc()
```


Gets blind carbon copy of the E-Mail message.

**Returns:**
[MailAddressCollection](../../com.aspose.email/mailaddresscollection)
### getCC() {#getCC--}
```
public MailAddressCollection getCC()
```


Gets CC of the E-Mail message.

**Returns:**
[MailAddressCollection](../../com.aspose.email/mailaddresscollection)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConversationId() {#getConversationId--}
```
public final String getConversationId()
```


Gets a value indicating conversation id.

**Returns:**
java.lang.String
### getDate() {#getDate--}
```
public Date getDate()
```


The origination date specifies the date and time at which the creator of the message indicated that the message was complete and ready to enter the mail delivery system. For instance, this might be the time that a user pushes the "send" or "submit" button in an application program. In any case, it is specifically not intended to convey the time that the message is actually transported, but rather the time at which the human or other creator of the message has put the message into its final form, ready for transport. (For example, a portable computer user who is not connected to a network might queue a message for delivery. The origination date is intended to contain the date and time that the user queued the message, not the time when the user connected to the network to send the message.)

**Returns:**
java.util.Date
### getDeleted() {#getDeleted--}
```
public final boolean getDeleted()
```


Gets a value indicating whether Flags property contains the Deleted flag.

Value: The deleted flag.

**Returns:**
boolean
### getDraft() {#getDraft--}
```
public final boolean getDraft()
```


Gets a value indicating whether Flags property contains the Draft flag.

Value: The draft flag.

**Returns:**
boolean
### getExtraParameters() {#getExtraParameters--}
```
public final System.Collections.Generic.IGenericDictionary<String,String> getExtraParameters()
```


Gets extra parameters of a message.

**Returns:**
com.aspose.ms.System.Collections.Generic.IGenericDictionary<java.lang.String,java.lang.String>
### getFlagged() {#getFlagged--}
```
public final boolean getFlagged()
```


Gets a value indicating whether Flags property contains the Flagged flag.

Value: The flagged flag.

**Returns:**
boolean
### getFlags() {#getFlags--}
```
public final ImapMessageFlags getFlags()
```


Gets the message flags.

Value: The message flags.

**Returns:**
[ImapMessageFlags](../../com.aspose.email/imapmessageflags)
### getFrom() {#getFrom--}
```
public final MailAddress getFrom()
```


Gets the list of authors of this message.

Value: The list of authors of this message.

**Returns:**
[MailAddress](../../com.aspose.email/mailaddress)
### getHeaders() {#getHeaders--}
```
public final HeaderCollection getHeaders()
```


Gets the Headers of the E-Mail message.

Value: The headers.

**Returns:**
[HeaderCollection](../../com.aspose.email/headercollection)
### getInternalDate() {#getInternalDate--}
```
public final Date getInternalDate()
```


The internal date and time of the message on the server. This is not the date and time in the [RFC-2822] header, but rather a date and time which reflects when the message was received. - In the case of messages delivered via [SMTP], this SHOULD be the date and time of final delivery of the message as defined by[SMTP]. - In the case of messages delivered by the IMAP4rev1 COPY command, this SHOULD be the internal date and time of the source message. - In the case of messages delivered by the IMAP4rev1 APPEND command, this SHOULD be the date and time as specified in the APPEND command description. - All other cases are implementation defined.

**Returns:**
java.util.Date
### getListUnsubscribe() {#getListUnsubscribe--}
```
public final String getListUnsubscribe()
```


The List-Unsubscribe field describes the command (preferably using mail) to directly unsubscribe the user(removing them from the list). For more details please see https://tools.ietf.org/html/rfc2369

**Returns:**
java.lang.String
### getMessageId() {#getMessageId--}
```
public final String getMessageId()
```


Gets the message ID.

Value: The message id string.

**Returns:**
java.lang.String
### getModificationSequence() {#getModificationSequence--}
```
public final long getModificationSequence()
```


Gets the modification sequence of this message. See more: https://tools.ietf.org/html/rfc7162

**Returns:**
long
### getParentFolder() {#getParentFolder--}
```
public final String getParentFolder()
```


Gets parent folder for message

**Returns:**
java.lang.String
### getProperties() {#getProperties--}
```
public MapiPropertyCollection getProperties()
```


Gets a mapi properties.

**Returns:**
[MapiPropertyCollection](../../com.aspose.email/mapipropertycollection)
### getRecent() {#getRecent--}
```
public final boolean getRecent()
```


Gets a value indicating whether Flags property contains the Recent flag.

Value: The recent flag.

**Returns:**
boolean
### getReplyTo() {#getReplyTo--}
```
public final MailAddressCollection getReplyTo()
```


Gets the list of addresses that should receive replies to this message.

Value: The list of addresses.

**Returns:**
[MailAddressCollection](../../com.aspose.email/mailaddresscollection)
### getSender() {#getSender--}
```
public final MailAddress getSender()
```


Gets the sender of this message.

Value: The sender of this message.

**Returns:**
[MailAddress](../../com.aspose.email/mailaddress)
### getSequenceNumber() {#getSequenceNumber--}
```
public final int getSequenceNumber()
```


Gets the message sequence number.

Value: The sequence number.

**Returns:**
int
### getSize() {#getSize--}
```
public final long getSize()
```


Gets the size of the E-Mail message.

Value: The size of the E-Mail message.

**Returns:**
long
### getSubject() {#getSubject--}
```
public final String getSubject()
```


Gets the Subject of the E-Mail message.

**Returns:**
java.lang.String
### getTo() {#getTo--}
```
public MailAddressCollection getTo()
```


Gets the receiptants of the E-Mail message.

**Returns:**
[MailAddressCollection](../../com.aspose.email/mailaddresscollection)
### getUniqueId() {#getUniqueId--}
```
public final String getUniqueId()
```


Gets the message unique ID.

Value: The unique id string.

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isRead() {#isRead--}
```
public final boolean isRead()
```


Gets a value indicating whether Flags property contains the Read flag.

Value: The read flag.

**Returns:**
boolean
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```


Returns a string that represents the current object.

**Returns:**
java.lang.String - A string that represents the current object.
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

