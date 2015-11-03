package org.telegram.messenger;

import android.content.Context;


import org.telegram.android.Emoji;
import org.telegram.android.MessageObject;

import java.util.ArrayList;

public class MessageList {

    private ArrayList<MessageObject> messeges;
    private Context context;

    public MessageList(Context context) {
        this.context = context;
        this.messeges = new ArrayList<>();
    }

    public void removeAdText() {
        for (MessageObject obj : messeges) {
            if (obj.messageText.toString().contains(context.getResources().getString(R.string.WrongClientCheck))) {
                String str = Emoji.removeAdText(obj.messageText.toString());
                obj.messageText = str;
            }
            if (obj.messageOwner != null && obj.messageOwner.message != null && obj.messageOwner.message.contains(context.getResources().getString(R.string.WrongClientCheck))) {
                String str = Emoji.removeAdText(obj.messageOwner.message.toString());
                obj.messageOwner.message = str;
            }
            if (obj.linkDescription != null) {
                obj.linkDescription = null;
            }
        }
    }

    public boolean isEmpty() {
        return messeges.isEmpty();
    }

    public void clear() {
        messeges.clear();
    }

    public void add(int i, MessageObject obj) {
        if (obj.messageText.toString().contains(context.getResources().getString(R.string.WrongClientCheck))) {
            String str = Emoji.removeAdText(obj.messageText.toString());
            obj.messageText = str;
        }
        if (obj.messageOwner != null && obj.messageOwner.message != null && obj.messageOwner.message.contains(context.getResources().getString(R.string.WrongClientCheck))) {
            String str = Emoji.removeAdText(obj.messageOwner.message.toString());
            obj.messageOwner.message = str;
        }
        if (obj.linkDescription != null) {
            obj.linkDescription = null;
        }
        messeges.add(i, obj);
    }

    public void add(MessageObject obj) {
        if (obj.messageText.toString().contains(context.getResources().getString(R.string.WrongClientCheck))) {
            String str = Emoji.removeAdText(obj.messageText.toString());
            obj.messageText = str;
        }
        if (obj.messageOwner != null && obj.messageOwner.message != null && obj.messageOwner.message.contains(context.getResources().getString(R.string.WrongClientCheck))) {
            String str = Emoji.removeAdText(obj.messageOwner.message.toString());
            obj.messageOwner.message = str;
        }
        if (obj.linkDescription != null) {
            obj.linkDescription = null;
        }
        messeges.add(obj);
    }

    public MessageObject get(int i) {
        return messeges.get(i);
    }

    public int size() {
        return messeges.size();
    }

    public int indexOf(MessageObject obj) {
        return messeges.indexOf(obj);
    }

    public void remove(int id) {
        messeges.remove(id);
    }

    public ArrayList<MessageObject> getMessageList() {
        return messeges;
    }

    public void set(int i, MessageObject obj) {
        if (obj.messageText.toString().contains(context.getResources().getString(R.string.WrongClientCheck))) {
            String str = Emoji.removeAdText(obj.messageText.toString());
            obj.messageText = str;
        }
        if (obj.messageOwner != null && obj.messageOwner.message != null && obj.messageOwner.message.contains(context.getResources().getString(R.string.WrongClientCheck))) {
            String str = Emoji.removeAdText(obj.messageOwner.message.toString());
            obj.messageOwner.message = str;
        }
        if (obj.linkDescription != null) {
            obj.linkDescription = null;
        }

        messeges.set(i, obj);
    }

    public void remove(MessageObject obj) {
        messeges.remove(obj);
    }
}
