// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.queries.notes.NotesAddQuery;
import com.vk.api.sdk.queries.notes.NotesCreateCommentQuery;
import com.vk.api.sdk.queries.notes.NotesDeleteCommentQuery;
import com.vk.api.sdk.queries.notes.NotesDeleteQuery;
import com.vk.api.sdk.queries.notes.NotesEditCommentQuery;
import com.vk.api.sdk.queries.notes.NotesEditQuery;
import com.vk.api.sdk.queries.notes.NotesGetByIdQuery;
import com.vk.api.sdk.queries.notes.NotesGetCommentsQuery;
import com.vk.api.sdk.queries.notes.NotesGetQuery;
import com.vk.api.sdk.queries.notes.NotesRestoreCommentQuery;

/**
 * List of Notes methods
 */
public class Notes extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Notes(VkApiClient client) {
        super(client);
    }

    /**
     * Creates a new note for the current user.
     *
     * @param actor vk user actor
     * @param title Note title.
     * @param text Note text.
     * @return query
     */
    @ApiMethod("notes.add")
    public NotesAddQuery add(UserActor actor, String title, String text) {
        return new NotesAddQuery(getClient(), actor, title, text);
    }

    /**
     * Creates a new note for the current user.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.add")
    public NotesAddQuery add(UserActor actor) {
        return new NotesAddQuery(getClient(), actor);
    }

    /**
     * Adds a new comment on a note.
     *
     * @param actor vk user actor
     * @param noteId Note ID.
     * @param message Comment text.
     * @return query
     */
    @ApiMethod("notes.createComment")
    public NotesCreateCommentQuery createComment(UserActor actor, Integer noteId, String message) {
        return new NotesCreateCommentQuery(getClient(), actor, noteId, message);
    }

    /**
     * Adds a new comment on a note.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.createComment")
    public NotesCreateCommentQuery createComment(UserActor actor) {
        return new NotesCreateCommentQuery(getClient(), actor);
    }

    /**
     * Deletes a note of the current user.
     *
     * @param actor vk user actor
     * @param noteId Note ID.
     * @return query
     */
    @ApiMethod("notes.delete")
    public NotesDeleteQuery delete(UserActor actor, Integer noteId) {
        return new NotesDeleteQuery(getClient(), actor, noteId);
    }

    /**
     * Deletes a note of the current user.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.delete")
    public NotesDeleteQuery delete(UserActor actor) {
        return new NotesDeleteQuery(getClient(), actor);
    }

    /**
     * Deletes a comment on a note.
     *
     * @param actor vk user actor
     * @param commentId Comment ID.
     * @return query
     */
    @ApiMethod("notes.deleteComment")
    public NotesDeleteCommentQuery deleteComment(UserActor actor, Integer commentId) {
        return new NotesDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Deletes a comment on a note.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.deleteComment")
    public NotesDeleteCommentQuery deleteComment(UserActor actor) {
        return new NotesDeleteCommentQuery(getClient(), actor);
    }

    /**
     * Edits a note of the current user.
     *
     * @param actor vk user actor
     * @param noteId Note ID.
     * @param title Note title.
     * @param text Note text.
     * @return query
     */
    @ApiMethod("notes.edit")
    public NotesEditQuery edit(UserActor actor, Integer noteId, String title, String text) {
        return new NotesEditQuery(getClient(), actor, noteId, title, text);
    }

    /**
     * Edits a note of the current user.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.edit")
    public NotesEditQuery edit(UserActor actor) {
        return new NotesEditQuery(getClient(), actor);
    }

    /**
     * Edits a comment on a note.
     *
     * @param actor vk user actor
     * @param commentId Comment ID.
     * @param message New comment text.
     * @return query
     */
    @ApiMethod("notes.editComment")
    public NotesEditCommentQuery editComment(UserActor actor, Integer commentId, String message) {
        return new NotesEditCommentQuery(getClient(), actor, commentId, message);
    }

    /**
     * Edits a comment on a note.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.editComment")
    public NotesEditCommentQuery editComment(UserActor actor) {
        return new NotesEditCommentQuery(getClient(), actor);
    }

    /**
     * Returns a list of notes created by a user.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("notes.get")
    public NotesGetQuery get(UserActor actor) {
        return new NotesGetQuery(getClient(), actor);
    }

    /**
     * Returns a note by its ID.
     *
     * @param actor vk user actor
     * @param noteId Note ID.
     * @return query
     */
    @ApiMethod("notes.getById")
    public NotesGetByIdQuery getById(UserActor actor, Integer noteId) {
        return new NotesGetByIdQuery(getClient(), actor, noteId);
    }

    /**
     * Returns a note by its ID.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.getById")
    public NotesGetByIdQuery getById(UserActor actor) {
        return new NotesGetByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments on a note.
     *
     * @param actor vk user actor
     * @param noteId Note ID.
     * @return query
     */
    @ApiMethod("notes.getComments")
    public NotesGetCommentsQuery getComments(UserActor actor, Integer noteId) {
        return new NotesGetCommentsQuery(getClient(), actor, noteId);
    }

    /**
     * Returns a list of comments on a note.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.getComments")
    public NotesGetCommentsQuery getComments(UserActor actor) {
        return new NotesGetCommentsQuery(getClient(), actor);
    }

    /**
     * Restores a deleted comment on a note.
     *
     * @param actor vk user actor
     * @param commentId Comment ID.
     * @return query
     */
    @ApiMethod("notes.restoreComment")
    public NotesRestoreCommentQuery restoreComment(UserActor actor, Integer commentId) {
        return new NotesRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Restores a deleted comment on a note.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("notes.restoreComment")
    public NotesRestoreCommentQuery restoreComment(UserActor actor) {
        return new NotesRestoreCommentQuery(getClient(), actor);
    }
}
